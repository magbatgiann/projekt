package store;
import java.io.Serializable;

public class Product implements Serializable {
    private final static long serialVersionUID = 4661471824932115886L;

    private String productName;
    private double productPrice;
    private String units;

    public Product()
    { }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Product(String productName, double productPrice, String units )
    {
        this.productName = productName;
        this.productPrice = productPrice;
        this.units = units;

    }

    @Override
    public String toString()
    {
        return productName + ": SEK " + productPrice + " x " + "item/" + units;
    }
}
