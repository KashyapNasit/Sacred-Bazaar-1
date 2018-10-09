package sample;

import java.io.Serializable;
import java.sql.Date;

public class Cart implements Serializable {
    public int productID;
    public Date productPurchaseDate;
    public Date estimatedDeliveryDate;
    public Date actualDeliveryDate;
    public String deliveryAddress;
    public double sellingPrice;
    public double purchasePrice;
    public double shippingCharges;
    public int quantity;
    public String retailerUserName;
    public String paymentMethod;
    public String offerName;
    public int isDelivered;

    public void makeCart(int productID,Date productPurchaseDate,Date estimatedDeliveryDate,Date actualDeliveryDate,String deliveryAddress, double sellingPrice, double purchasePrice, double shippingCharges, int quantity, String retailerUserName, String paymentMethod, String offerName, int isDelivered){
        this.productID = productID;
        this.productPurchaseDate = productPurchaseDate;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        this.actualDeliveryDate = actualDeliveryDate;
        this.deliveryAddress = deliveryAddress;
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
        this.shippingCharges = shippingCharges;
        this.quantity = quantity;
        this.retailerUserName = retailerUserName;
        this.paymentMethod = paymentMethod;
        this.offerName = offerName;
        this.isDelivered = isDelivered;
    }

}
