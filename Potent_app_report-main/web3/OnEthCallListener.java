package io.horizontalsystems.bankwallet.web3;

import io.horizontalsystems.bankwallet.web3.entity.Web3Call;

/**
 * Created by JB on 19/02/2021.
 */
public interface OnEthCallListener
{
    void onEthCall(Web3Call txdata);
}
