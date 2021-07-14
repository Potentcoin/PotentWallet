package io.horizontalsystems.bankwallet.web3.entity;

import io.horizontalsystems.bankwallet.entity.DAppFunction;
import com.alphawallet.token.entity.Signable;

/**
 * Created by James on 6/04/2019.
 * Stormbird in Singapore
 */
public interface FunctionCallback
{
    void signMessage(Signable sign, DAppFunction dAppFunction);
    void functionSuccess();
    void functionFailed();
}
