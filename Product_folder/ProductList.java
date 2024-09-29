package Product_folder;

import java.util.*;
import java.io.*;
import Product_folder.Product;

public class ProductList{
    private LinkedList<Product> products = new LinkedList<Product>();

    public Product search(String Productid){
        Product target = null;
    
        for (Product p : products) {
            if (p.getID().equals(Productid)) {
                target = p;
                return target;
            }
        }
        return null;
    }

    public boolean insertProduct(Product Product){
        if(!this.products.add(Product)){
            return false;
        };
        return true;
    }

    public boolean RemoveProduct(String productID){
        for(Product p: this.products){
            if(p.getID().equals(productID)){
                this.products.remove(p);
                return true;
            }
        }
        return false;
    }

     public Iterator<Product> getProducts(){
        return this.products.iterator();
    }
}
