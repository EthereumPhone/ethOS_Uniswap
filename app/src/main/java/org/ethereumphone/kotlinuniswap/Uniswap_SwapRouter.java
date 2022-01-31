package org.ethereumphone.kotlinuniswap;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint160;
import org.web3j.abi.datatypes.generated.Uint24;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class Uniswap_SwapRouter extends Contract {
    public static final String BINARY = "Bin file was not provided";

    public static final String FUNC_WETH9 = "WETH9";

    public static final String FUNC_EXACTINPUT = "exactInput";

    public static final String FUNC_EXACTINPUTSINGLE = "exactInputSingle";

    public static final String FUNC_EXACTOUTPUT = "exactOutput";

    public static final String FUNC_EXACTOUTPUTSINGLE = "exactOutputSingle";

    public static final String FUNC_FACTORY = "factory";

    public static final String FUNC_MULTICALL = "multicall";

    public static final String FUNC_REFUNDETH = "refundETH";

    public static final String FUNC_SELFPERMIT = "selfPermit";

    public static final String FUNC_SELFPERMITALLOWED = "selfPermitAllowed";

    public static final String FUNC_SELFPERMITALLOWEDIFNECESSARY = "selfPermitAllowedIfNecessary";

    public static final String FUNC_SELFPERMITIFNECESSARY = "selfPermitIfNecessary";

    public static final String FUNC_SWEEPTOKEN = "sweepToken";

    public static final String FUNC_SWEEPTOKENWITHFEE = "sweepTokenWithFee";

    public static final String FUNC_UNISWAPV3SWAPCALLBACK = "uniswapV3SwapCallback";

    public static final String FUNC_UNWRAPWETH9 = "unwrapWETH9";

    public static final String FUNC_UNWRAPWETH9WITHFEE = "unwrapWETH9WithFee";

    @Deprecated
    protected Uniswap_SwapRouter(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Uniswap_SwapRouter(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Uniswap_SwapRouter(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Uniswap_SwapRouter(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> WETH9() {
        final Function function = new Function(FUNC_WETH9, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> exactInput(ExactInputParams params) {
        final Function function = new Function(
                FUNC_EXACTINPUT, 
                Arrays.<Type>asList(params), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> exactInputSingle(ExactInputSingleParams params) {
        final Function function = new Function(
                FUNC_EXACTINPUTSINGLE, 
                Arrays.<Type>asList(params), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> exactOutput(ExactOutputParams params) {
        final Function function = new Function(
                FUNC_EXACTOUTPUT, 
                Arrays.<Type>asList(params), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> exactOutputSingle(ExactOutputSingleParams params) {
        final Function function = new Function(
                FUNC_EXACTOUTPUTSINGLE, 
                Arrays.<Type>asList(params), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> factory() {
        final Function function = new Function(FUNC_FACTORY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> multicall(List<byte[]> data) {
        final Function function = new Function(
                FUNC_MULTICALL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.DynamicBytes>(
                        org.web3j.abi.datatypes.DynamicBytes.class,
                        org.web3j.abi.Utils.typeMap(data, org.web3j.abi.datatypes.DynamicBytes.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> refundETH() {
        final Function function = new Function(
                FUNC_REFUNDETH, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> selfPermit(String token, BigInteger value, BigInteger deadline, BigInteger v, byte[] r, byte[] s) {
        final Function function = new Function(
                FUNC_SELFPERMIT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, token), 
                new org.web3j.abi.datatypes.generated.Uint256(value), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline), 
                new org.web3j.abi.datatypes.generated.Uint8(v), 
                new org.web3j.abi.datatypes.generated.Bytes32(r), 
                new org.web3j.abi.datatypes.generated.Bytes32(s)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> selfPermitAllowed(String token, BigInteger nonce, BigInteger expiry, BigInteger v, byte[] r, byte[] s) {
        final Function function = new Function(
                FUNC_SELFPERMITALLOWED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, token), 
                new org.web3j.abi.datatypes.generated.Uint256(nonce), 
                new org.web3j.abi.datatypes.generated.Uint256(expiry), 
                new org.web3j.abi.datatypes.generated.Uint8(v), 
                new org.web3j.abi.datatypes.generated.Bytes32(r), 
                new org.web3j.abi.datatypes.generated.Bytes32(s)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> selfPermitAllowedIfNecessary(String token, BigInteger nonce, BigInteger expiry, BigInteger v, byte[] r, byte[] s) {
        final Function function = new Function(
                FUNC_SELFPERMITALLOWEDIFNECESSARY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, token), 
                new org.web3j.abi.datatypes.generated.Uint256(nonce), 
                new org.web3j.abi.datatypes.generated.Uint256(expiry), 
                new org.web3j.abi.datatypes.generated.Uint8(v), 
                new org.web3j.abi.datatypes.generated.Bytes32(r), 
                new org.web3j.abi.datatypes.generated.Bytes32(s)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> selfPermitIfNecessary(String token, BigInteger value, BigInteger deadline, BigInteger v, byte[] r, byte[] s) {
        final Function function = new Function(
                FUNC_SELFPERMITIFNECESSARY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, token), 
                new org.web3j.abi.datatypes.generated.Uint256(value), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline), 
                new org.web3j.abi.datatypes.generated.Uint8(v), 
                new org.web3j.abi.datatypes.generated.Bytes32(r), 
                new org.web3j.abi.datatypes.generated.Bytes32(s)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> sweepToken(String token, BigInteger amountMinimum, String recipient) {
        final Function function = new Function(
                FUNC_SWEEPTOKEN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, token), 
                new org.web3j.abi.datatypes.generated.Uint256(amountMinimum), 
                new org.web3j.abi.datatypes.Address(160, recipient)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> sweepTokenWithFee(String token, BigInteger amountMinimum, String recipient, BigInteger feeBips, String feeRecipient) {
        final Function function = new Function(
                FUNC_SWEEPTOKENWITHFEE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, token), 
                new org.web3j.abi.datatypes.generated.Uint256(amountMinimum), 
                new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Uint256(feeBips), 
                new org.web3j.abi.datatypes.Address(160, feeRecipient)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> uniswapV3SwapCallback(BigInteger amount0Delta, BigInteger amount1Delta, byte[] _data) {
        final Function function = new Function(
                FUNC_UNISWAPV3SWAPCALLBACK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int256(amount0Delta), 
                new org.web3j.abi.datatypes.generated.Int256(amount1Delta), 
                new org.web3j.abi.datatypes.DynamicBytes(_data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> unwrapWETH9(BigInteger amountMinimum, String recipient) {
        final Function function = new Function(
                FUNC_UNWRAPWETH9, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountMinimum), 
                new org.web3j.abi.datatypes.Address(160, recipient)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> unwrapWETH9WithFee(BigInteger amountMinimum, String recipient, BigInteger feeBips, String feeRecipient) {
        final Function function = new Function(
                FUNC_UNWRAPWETH9WITHFEE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountMinimum), 
                new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Uint256(feeBips), 
                new org.web3j.abi.datatypes.Address(160, feeRecipient)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Uniswap_SwapRouter load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Uniswap_SwapRouter(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Uniswap_SwapRouter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Uniswap_SwapRouter(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Uniswap_SwapRouter load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Uniswap_SwapRouter(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Uniswap_SwapRouter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Uniswap_SwapRouter(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class ExactInputParams extends DynamicStruct {
        public byte[] path;

        public String recipient;

        public BigInteger deadline;

        public BigInteger amountIn;

        public BigInteger amountOutMinimum;

        public ExactInputParams(byte[] path, String recipient, BigInteger deadline, BigInteger amountIn, BigInteger amountOutMinimum) {
            super(new org.web3j.abi.datatypes.DynamicBytes(path),new org.web3j.abi.datatypes.Address(recipient),new org.web3j.abi.datatypes.generated.Uint256(deadline),new org.web3j.abi.datatypes.generated.Uint256(amountIn),new org.web3j.abi.datatypes.generated.Uint256(amountOutMinimum));
            this.path = path;
            this.recipient = recipient;
            this.deadline = deadline;
            this.amountIn = amountIn;
            this.amountOutMinimum = amountOutMinimum;
        }

        public ExactInputParams(DynamicBytes path, Address recipient, Uint256 deadline, Uint256 amountIn, Uint256 amountOutMinimum) {
            super(path,recipient,deadline,amountIn,amountOutMinimum);
            this.path = path.getValue();
            this.recipient = recipient.getValue();
            this.deadline = deadline.getValue();
            this.amountIn = amountIn.getValue();
            this.amountOutMinimum = amountOutMinimum.getValue();
        }
    }

    public static class ExactInputSingleParams extends StaticStruct {
        public String tokenIn;

        public String tokenOut;

        public BigInteger fee;

        public String recipient;

        public BigInteger deadline;

        public BigInteger amountIn;

        public BigInteger amountOutMinimum;

        public BigInteger sqrtPriceLimitX96;

        public ExactInputSingleParams(String tokenIn, String tokenOut, BigInteger fee, String recipient, BigInteger deadline, BigInteger amountIn, BigInteger amountOutMinimum, BigInteger sqrtPriceLimitX96) {
            super(new org.web3j.abi.datatypes.Address(tokenIn),new org.web3j.abi.datatypes.Address(tokenOut),new org.web3j.abi.datatypes.generated.Uint24(fee),new org.web3j.abi.datatypes.Address(recipient),new org.web3j.abi.datatypes.generated.Uint256(deadline),new org.web3j.abi.datatypes.generated.Uint256(amountIn),new org.web3j.abi.datatypes.generated.Uint256(amountOutMinimum),new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceLimitX96));
            this.tokenIn = tokenIn;
            this.tokenOut = tokenOut;
            this.fee = fee;
            this.recipient = recipient;
            this.deadline = deadline;
            this.amountIn = amountIn;
            this.amountOutMinimum = amountOutMinimum;
            this.sqrtPriceLimitX96 = sqrtPriceLimitX96;
        }

        public ExactInputSingleParams(Address tokenIn, Address tokenOut, Uint24 fee, Address recipient, Uint256 deadline, Uint256 amountIn, Uint256 amountOutMinimum, Uint160 sqrtPriceLimitX96) {
            super(tokenIn,tokenOut,fee,recipient,deadline,amountIn,amountOutMinimum,sqrtPriceLimitX96);
            this.tokenIn = tokenIn.getValue();
            this.tokenOut = tokenOut.getValue();
            this.fee = fee.getValue();
            this.recipient = recipient.getValue();
            this.deadline = deadline.getValue();
            this.amountIn = amountIn.getValue();
            this.amountOutMinimum = amountOutMinimum.getValue();
            this.sqrtPriceLimitX96 = sqrtPriceLimitX96.getValue();
        }
    }

    public static class ExactOutputParams extends DynamicStruct {
        public byte[] path;

        public String recipient;

        public BigInteger deadline;

        public BigInteger amountOut;

        public BigInteger amountInMaximum;

        public ExactOutputParams(byte[] path, String recipient, BigInteger deadline, BigInteger amountOut, BigInteger amountInMaximum) {
            super(new org.web3j.abi.datatypes.DynamicBytes(path),new org.web3j.abi.datatypes.Address(recipient),new org.web3j.abi.datatypes.generated.Uint256(deadline),new org.web3j.abi.datatypes.generated.Uint256(amountOut),new org.web3j.abi.datatypes.generated.Uint256(amountInMaximum));
            this.path = path;
            this.recipient = recipient;
            this.deadline = deadline;
            this.amountOut = amountOut;
            this.amountInMaximum = amountInMaximum;
        }

        public ExactOutputParams(DynamicBytes path, Address recipient, Uint256 deadline, Uint256 amountOut, Uint256 amountInMaximum) {
            super(path,recipient,deadline,amountOut,amountInMaximum);
            this.path = path.getValue();
            this.recipient = recipient.getValue();
            this.deadline = deadline.getValue();
            this.amountOut = amountOut.getValue();
            this.amountInMaximum = amountInMaximum.getValue();
        }
    }

    public static class ExactOutputSingleParams extends StaticStruct {
        public String tokenIn;

        public String tokenOut;

        public BigInteger fee;

        public String recipient;

        public BigInteger deadline;

        public BigInteger amountOut;

        public BigInteger amountInMaximum;

        public BigInteger sqrtPriceLimitX96;

        public ExactOutputSingleParams(String tokenIn, String tokenOut, BigInteger fee, String recipient, BigInteger deadline, BigInteger amountOut, BigInteger amountInMaximum, BigInteger sqrtPriceLimitX96) {
            super(new org.web3j.abi.datatypes.Address(tokenIn),new org.web3j.abi.datatypes.Address(tokenOut),new org.web3j.abi.datatypes.generated.Uint24(fee),new org.web3j.abi.datatypes.Address(recipient),new org.web3j.abi.datatypes.generated.Uint256(deadline),new org.web3j.abi.datatypes.generated.Uint256(amountOut),new org.web3j.abi.datatypes.generated.Uint256(amountInMaximum),new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceLimitX96));
            this.tokenIn = tokenIn;
            this.tokenOut = tokenOut;
            this.fee = fee;
            this.recipient = recipient;
            this.deadline = deadline;
            this.amountOut = amountOut;
            this.amountInMaximum = amountInMaximum;
            this.sqrtPriceLimitX96 = sqrtPriceLimitX96;
        }

        public ExactOutputSingleParams(Address tokenIn, Address tokenOut, Uint24 fee, Address recipient, Uint256 deadline, Uint256 amountOut, Uint256 amountInMaximum, Uint160 sqrtPriceLimitX96) {
            super(tokenIn,tokenOut,fee,recipient,deadline,amountOut,amountInMaximum,sqrtPriceLimitX96);
            this.tokenIn = tokenIn.getValue();
            this.tokenOut = tokenOut.getValue();
            this.fee = fee.getValue();
            this.recipient = recipient.getValue();
            this.deadline = deadline.getValue();
            this.amountOut = amountOut.getValue();
            this.amountInMaximum = amountInMaximum.getValue();
            this.sqrtPriceLimitX96 = sqrtPriceLimitX96.getValue();
        }
    }
}
