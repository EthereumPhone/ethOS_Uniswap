package org.ethereumphone.kotlinuniswap

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import org.komputing.khex.extensions.toNoPrefixHexString
import org.walletconnect.Session
import org.walletconnect.impls.FileWCSessionStore
import org.walletconnect.impls.MoshiPayloadAdapter
import org.walletconnect.impls.OkHttpTransport
import org.walletconnect.impls.WCSession
import org.web3j.crypto.Credentials
import org.web3j.protocol.Web3j
import org.web3j.protocol.http.HttpService
import org.web3j.tx.gas.ContractGasProvider
import org.web3j.tx.gas.DefaultGasProvider
import java.io.File
import java.math.BigInteger
import java.util.*


class MainActivity : AppCompatActivity(), Session.Callback {

    private lateinit var wcURL: String
    private val DAI_ADDR = "0xc7ad46e0b8a400bb3c915120d284aafba8fc4735"
    private val WETH_ADDR = "0xc778417e063141139fce010982780140aa0cd5ab"
    private val swapRouterAddress = "0x68b3465833fb72a70ecdf485e0e4c7bd8665fc45"
    private lateinit var client: OkHttpClient
    private lateinit var moshi: Moshi
    private lateinit var storage: FileWCSessionStore
    private lateinit var config: Session.Config
    private lateinit var session: Session
    lateinit var uniswap_swapRouter: Uniswap_SwapRouter
    private var txRequest: Long? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        client = OkHttpClient.Builder()
            .build()
        moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
        storage = FileWCSessionStore(File(this.filesDir, "session_store.json").apply { createNewFile() }, moshi)

        val web3j =
            Web3j.build(HttpService())
        uniswap_swapRouter = Uniswap_SwapRouter.load(
            swapRouterAddress,
            web3j,
            Credentials.create("c6141ab081e9c1c04955994b4eadaef733189436ad3f87543a67e71e5fda8a82"), // Not a used private-key
            DefaultGasProvider()
        )
        val connectToWallet = findViewById<Button>(R.id.connectToWallet)
        connectToWallet.setOnClickListener {
            createConnection()
        }
    }

    fun createConnection() {
        val key = ByteArray(32).also { Random().nextBytes(it) }.toNoPrefixHexString()
        config = Session.Config(UUID.randomUUID().toString(), "http://localhost:8887", key)
        session = WCSession(
            config.toFullyQualifiedConfig(),
            MoshiPayloadAdapter(moshi),
            storage,
            OkHttpTransport.Builder(client, moshi),
            Session.PeerMeta(name = "ethOS test")
        )
        session.addCallback(this)
        session.offer()
        val i = Intent(Intent.ACTION_VIEW)
        println("This is the uri: ${config.toWCUri()}")
        i.data = Uri.parse(config.toWCUri())
        try {
            startActivity(i)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(this, "No wallet installed", Toast.LENGTH_LONG).show()
        }
    }

    override fun onMethodCall(call: Session.MethodCall) {
        println("Method-call: $call")
    }

    override fun onStatus(status: Session.Status) {
        println("Status: $status")
        if (status is Session.Status.Approved) {
            makeTransaction()
        }
    }
    fun makeTransaction() {
        val from = session.approvedAccounts()?.first()
        val txRequest = System.currentTimeMillis()

        // Approved wallet
        var tsLong = System.currentTimeMillis() / 1000
        tsLong += 100
        val dude = uniswap_swapRouter.exactInputSingle(
            Uniswap_SwapRouter.ExactInputSingleParams(
                WETH_ADDR,
                DAI_ADDR,
                BigInteger.valueOf(3000),
                "0x71205858fd50d8b66a475A546f2a08b1F3F5C216",
                BigInteger.valueOf(
                    tsLong
                ),
                BigInteger.valueOf(100000),
                BigInteger.valueOf(0),
                BigInteger.valueOf(0)
            )
        )
        val callData = dude.encodeFunctionCall()
        println("This is the call-data: $callData")
        session.performMethodCall(
            Session.MethodCall.SendTransaction(
                txRequest,
                from!!,
                swapRouterAddress,
                null,
                null,
                null,
                "0x0",
                callData
            ),
            ::handleResponse
        )
        this.txRequest = txRequest
    }

    private fun handleResponse(response: Session.MethodCall.Response) {
        println(response.result.toString())
    }
}