package piuk.blockchain.android.ui.account;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import piuk.blockchain.android.BR;

public class AccountEditModel extends BaseObservable {

    private int transferFundsVisibility;
    private float transferFundsAlpha;
    private boolean transferFundsClickable;

    private String labelHeader;
    private String label;
    private float labelAlpha;
    private boolean labelClickable;

    private int defaultAccountVisibility;
    private String defaultText;
    private int defaultTextColor;
    private float defaultAlpha;
    private boolean defaultClickable;

    private int scanPrivateKeyVisibility;
    private float xprivAlpha;
    private boolean xprivClickable;

    private String xpubText;
    private int xpubDescriptionVisibility;
    private float xpubAlpha;
    private boolean xpubClickable;

    private int archiveVisibility;
    private String archiveHeader;
    private String archiveText;
    private float archiveAlpha;
    private boolean archiveClickable;

    public AccountEditModel() {
    }

    @Bindable
    public int getTransferFundsVisibility() {
        return transferFundsVisibility;
    }

    public void setTransferFundsVisibility(int visibility) {
        this.transferFundsVisibility = visibility;
        notifyPropertyChanged(BR.transferFundsVisibility);
    }

    @Bindable
    public float getTransferFundsAlpha() {
        return transferFundsAlpha;
    }

    public void setTransferFundsAlpha(float transferFundsAlpha) {
        this.transferFundsAlpha = transferFundsAlpha;
        notifyPropertyChanged(BR.transferFundsAlpha);
    }

    @Bindable
    public boolean getTransferFundsClickable() {
        return transferFundsClickable;
    }

    public void setTransferFundsClickable(boolean transferFundsClickable) {
        this.transferFundsClickable = transferFundsClickable;
        notifyPropertyChanged(BR.transferFundsClickable);
    }

    @Bindable
    public String getLabelHeader() {
        return labelHeader;
    }

    public void setLabelHeader(String labelHeader) {
        this.labelHeader = labelHeader;
        notifyPropertyChanged(BR.labelHeader);
    }

    @Bindable
    public float getLabelAlpha() {
        return labelAlpha;
    }

    public void setLabelAlpha(float labelAlpha) {
        this.labelAlpha = labelAlpha;
        notifyPropertyChanged(BR.labelAlpha);
    }

    @Bindable
    public boolean getLabelClickable() {
        return labelClickable;
    }

    public void setLabelClickable(boolean labelClickable) {
        this.labelClickable = labelClickable;
        notifyPropertyChanged(BR.labelClickable);
    }

    @Bindable
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
        notifyPropertyChanged(BR.label);
    }

    @Bindable
    public int getDefaultAccountVisibility() {
        return defaultAccountVisibility;
    }

    public void setDefaultAccountVisibility(int visibility) {
        this.defaultAccountVisibility = visibility;
        notifyPropertyChanged(BR.defaultAccountVisibility);
    }

    @Bindable
    public String getDefaultText() {
        return defaultText;
    }

    public void setDefaultText(String defaultText) {
        this.defaultText = defaultText;
        notifyPropertyChanged(BR.defaultText);
    }

    @Bindable
    public int getDefaultTextColor() {
        return defaultTextColor;
    }

    public void setDefaultTextColor(int defaultTextColor) {
        this.defaultTextColor = defaultTextColor;
        notifyPropertyChanged(BR.defaultTextColor);
    }

    @Bindable
    public float getDefaultAlpha() {
        return defaultAlpha;
    }

    public void setDefaultAlpha(float defaultAlpha) {
        this.defaultAlpha = defaultAlpha;
        notifyPropertyChanged(BR.defaultAlpha);
    }

    @Bindable
    public boolean getDefaultClickable() {
        return defaultClickable;
    }

    public void setDefaultClickable(boolean defaultClickable) {
        this.defaultClickable = defaultClickable;
        notifyPropertyChanged(BR.defaultClickable);
    }

    @Bindable
    public int getScanPrivateKeyVisibility() {
        return scanPrivateKeyVisibility;
    }

    public void setScanPrivateKeyVisibility(int visibility) {
        this.scanPrivateKeyVisibility = visibility;
        notifyPropertyChanged(BR.scanPrivateKeyVisibility);
    }

    @Bindable
    public float getXprivAlpha() {
        return xprivAlpha;
    }

    public void setXprivAlpha(float xprivAlpha) {
        this.xprivAlpha = xprivAlpha;
        notifyPropertyChanged(BR.xprivAlpha);
    }

    @Bindable
    public boolean getXprivClickable() {
        return xprivClickable;
    }

    public void setXprivClickable(boolean xprivClickable) {
        this.xprivClickable = xprivClickable;
        notifyPropertyChanged(BR.xprivClickable);
    }

    @Bindable
    public String getXpubText() {
        return xpubText;
    }

    public void setXpubText(String xpubText) {
        this.xpubText = xpubText;
        notifyPropertyChanged(BR.xpubText);
    }

    @Bindable
    public int getXpubDescriptionVisibility() {
        return xpubDescriptionVisibility;
    }

    public void setXpubDescriptionVisibility(int xpubDescriptionVisibility) {
        this.xpubDescriptionVisibility = xpubDescriptionVisibility;
        notifyPropertyChanged(BR.xpubDescriptionVisibility);
    }

    @Bindable
    public float getXpubAlpha() {
        return xpubAlpha;
    }

    public void setXpubAlpha(float xpubAlpha) {
        this.xpubAlpha = xpubAlpha;
        notifyPropertyChanged(BR.xpubAlpha);
    }

    @Bindable
    public boolean getXpubClickable() {
        return xpubClickable;
    }

    public void setXpubClickable(boolean xpubClickable) {
        this.xpubClickable = xpubClickable;
        notifyPropertyChanged(BR.xpubClickable);
    }

    @Bindable
    public int getArchiveVisibility() {
        return archiveVisibility;
    }

    public void setArchiveVisibility(int visibility) {
        this.archiveVisibility = visibility;
        notifyPropertyChanged(BR.archiveVisibility);
    }

    @Bindable
    public String getArchiveHeader() {
        return archiveHeader;
    }

    public void setArchiveHeader(String archiveHeader) {
        this.archiveHeader = archiveHeader;
        notifyPropertyChanged(BR.archiveHeader);
    }

    @Bindable
    public String getArchiveText() {
        return archiveText;
    }

    public void setArchiveText(String archiveText) {
        this.archiveText = archiveText;
        notifyPropertyChanged(BR.archiveText);
    }

    @Bindable
    public float getArchiveAlpha() {
        return archiveAlpha;
    }

    public void setArchiveAlpha(float archiveAlpha) {
        this.archiveAlpha = archiveAlpha;
        notifyPropertyChanged(BR.archiveAlpha);
    }

    @Bindable
    public boolean getArchiveClickable() {
        return archiveClickable;
    }

    public void setArchiveClickable(boolean archiveClickable) {
        this.archiveClickable = archiveClickable;
        notifyPropertyChanged(BR.archiveClickable);
    }
}
