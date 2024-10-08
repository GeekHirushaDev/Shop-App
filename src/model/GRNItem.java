
package model;

import gui.*;
import java.util.Date;

public class GRNItem {
    
    private String productID;
    private String brandName;
    private String productName;
    private double qty;
    private double buyingPrice;
    private double sellingPrice;
    private Date mfd;
    private Date exp;

    /**
     * @return the productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     * @return the brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName the brandName to set
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the qty
     */
    public double getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(double qty) {
        this.qty = qty;
    }

    /**
     * @return the buyingPrice
     */
    public double getBuyingPrice() {
        return buyingPrice;
    }

    /**
     * @param buyingPrice the buyingPrice to set
     */
    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    /**
     * @return the sellingPrice
     */
    public double getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @param sellingPrice the sellingPrice to set
     */
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     * @return the mfd
     */
    public Date getMfd() {
        return mfd;
    }

    /**
     * @param mfd the mfd to set
     */
    public void setMfd(Date mfd) {
        this.mfd = mfd;
    }

    /**
     * @return the exp
     */
    public Date getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(Date exp) {
        this.exp = exp;
    }
    
}
