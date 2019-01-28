package projekt1;

public class Product {


    private String name;
    private double price;
    private double value;

    public Product(String name){
        this.name = name;
        this.price = 0;
        this.value = value;
    }

    public Product(String name, double price, double value){
        this.name = name;
        this.price = price;
        this.value = value;

    }

    public String getName(){
        return name;
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

    public void setValue(double newValue){
        this.value=newValue;
    }

    public String toString(){
        String s = "Product: " +
                "ProductName: " + name +
                ", Price: " + price +
                ", Value:" + value;
        return s;
    }


}