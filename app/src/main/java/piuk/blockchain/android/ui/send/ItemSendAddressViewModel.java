package piuk.blockchain.android.ui.send;

import android.databinding.BaseObservable;

import piuk.blockchain.android.ui.account.ItemAccount;
import piuk.blockchain.android.ui.base.ViewModel;

public class ItemSendAddressViewModel extends BaseObservable implements ViewModel {

    private ItemAccount addressItem;

    public ItemSendAddressViewModel(ItemAccount address) {
        this.addressItem = address;
    }

    public String getLabel() {
        return addressItem.label;
    }

    public String getBalance() {
        return addressItem.balance;
    }

    public void setAddress(ItemAccount address) {
        this.addressItem = address;
        notifyChange();
    }

    @Override
    public void destroy() {
        addressItem = null;
    }

}
