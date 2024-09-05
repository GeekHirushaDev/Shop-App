
package gui;

import java.util.Date;

public class GRNItem {
    
    private String productID;
    private String brandName;
    private String productName;
    private double qty;
    private double buyingPrice;
    private Date mfd;
    private Date exp;
    
    
    public String getProductID() {
        return productID;
    }
    
    
    public void setProductID(String productID) {
        this.productID = productID;
    }
    
    
    public String getBrandName() {
        return brandName;
    }
    
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    
    public String getProductName() {
        return productName;
    }

    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    
    public double getQty() {
        return qty;
    }

    
    public void setQty(double qty) {
        this.qty = qty;
    }


    
    public double getBuyingPrice() {
        return buyingPrice;
    }

    
    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    
    public Date getMfd() {
        return mfd;
    }


    public void setMfd(Date mfd) {
        this.mfd = mfd;
    }


    public Date getExp() {
        return exp;
    }


    public void setExp(Date exp) {
        this.exp = exp;
    }
    
}
