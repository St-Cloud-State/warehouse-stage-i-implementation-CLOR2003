package Product_folder;

public class Product{
    private String id;
    private String name;
    private int quantity;
    private String manufacturer;
    private double price;

    public Product(String id,String name,int quantity,String manufacturer,double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getID(){
        return this.id;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getName(){
        return this.name;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String toString(){
        String string = this.id + " " + this.name + " : {" + this.quantity + ","+this.manufacturer+","+this.price+"}";
        return string;
    }
}