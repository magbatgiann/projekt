package projekt1.Register;
import java.util.ArrayList;
public class Product {


    private String productName;
    private double price;
    private int value;



    public Product(String productName, double price, int value){
        this.productName = productName;
        this.price = price;
        this.value = value;

    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        this.price=newPrice;
    }

    public double getValue(){
        return value;
    }

    public void setValue(int newValue){
        this.value=newValue;
    }

    public String toString(){
        String s = "Product: " +
                "ProductName: " + productName +
                ", Price: " + price +
                ", Value:" + value;
        return s;
    }


}