package io.horizontalsystems.bankwallet.web3;

import com.alphawallet.token.entity.EthereumMessage;

public interface OnSignMessageListener {
    void onSignMessage(EthereumMessage message);
}
