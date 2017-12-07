package com.telenordigital.prime.firebase;

/**
 * Bean used to use read items from the product catalogs we find
 * in Firebase.
 */
public  final class ProductCatalogItem {

    private String badgeLabel;
    private String currencyLabel;
    private boolean isVisible;
    private String label;
    private int price;
    private String priceLabel;

    private int amount;
    private String sku;
    private long noOfBytes;

    public String getBadgeLabel() {
        return badgeLabel;
    }

    public void setBadgeLabel(String badgeLabel) {
        this.badgeLabel = badgeLabel;
    }

    public String getCurrencyLabel() {
        return currencyLabel;
    }

    public void setCurrencyLabel(String currencyLabel) {
        this.currencyLabel = currencyLabel;
    }

    public boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean visible) {
        isVisible = visible;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPriceLabel() {
        return priceLabel;
    }

    public void setPriceLabel(String priceLabel) {
        this.priceLabel = priceLabel;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public long getNoOfBytes() {
        return noOfBytes;
    }

    public void setNoOfBytes(long noOfBytes) {
        this.noOfBytes = noOfBytes;
    }

    @Override
    public String toString() {
        return "ProductCatalogItem{" +
                "badgeLabel='" + badgeLabel + '\'' +
                ", currencyLabel='" + currencyLabel + '\'' +
                ", isVisible=" + isVisible +
                ", label='" + label + '\'' +
                ", price=" + price +
                ", priceLabel='" + priceLabel + '\'' +
                ", amount=" + amount +
                ", sku='" + sku + '\'' +
                ", noOfBytes=" + noOfBytes +
                '}';
    }
}
