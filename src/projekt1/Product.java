package projekt1;

public class Product {


    private String name;
    private double price;
    private String customer;
    private double value;

    public Product(String name){
        this.name = name;
        this.price = 0;
        this.customer = "";
        this.value = value;
    }

    public Product(String name, double price, double value){
        this.name = name;
        this.price = price;
        this.customer = "";
        this.value = value;

    }

    public String getName(){
        return name;
    }

    public String getCustomer(){
        return customer;
    }

    public void setCustomer(String customer){
        this.customer=customer;
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
        return String.format("Name: . Price: . Value: . Customer", name,price,value,customer);
    }


}