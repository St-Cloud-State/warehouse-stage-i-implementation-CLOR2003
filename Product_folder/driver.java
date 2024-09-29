import java.util.*;
import java.io.*;
import Product_folder.Product;
import Product_folder.ProductList;

public class driver{
    public static void main(String[] args){
        // Products created
        Product p = new Product("1111","chickens",42,"jimseries",1);
        Product p2 = new Product("1211","fish",2,"mcdonalds",15);
        Product p3 = new Product("1141","tigers",43,"burgerKing",12.22);

        // Product list created
        ProductList plist = new ProductList();

        // Insertions of products into product list
        boolean result = plist.insertProduct(p);
        result = plist.insertProduct(p2);
        result = plist.insertProduct(p3);

        // Remove product p2
        plist.RemoveProduct(p2.getID());

        // Search for product p3 with ID and return product p3
        // Assign to p2
        p2 = plist.search(p3.getID());

        // Inserting the new value p2 back into plist
        plist.insertProduct(p2);

        // Change product name of p2 back to fish
        p2 = plist.search(p2.getID());
        p2.setName("fish");

        // Insert product bird as p4
        Product p4 = new Product("2222","bird",44,"Bobby's",10.99);
        plist.insertProduct(p4);

        // Remove p2
        plist.RemoveProduct(p2.getID());

        // Change price from 10.99 to 19.99
        p4.setPrice(19.99);

        // Change manufacturer from Bobby's to Eddy's
        p4.setManufacturer("Eddy's");

        // Change quantity of chicken from 44 to 1
        p.setQuantity(1);

        // Assign iterator to all products
        Iterator<Product> iterator = plist.getProducts();

        // Displays all products
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        };

        // Test getters of product
        System.out.println("ID of p: " + plist.search(p.getID()).getID());
        System.out.println("Name of p: " + plist.search(p.getID()).getName());
        System.out.println("Quantity of p: " + plist.search(p.getID()).getQuantity());
        System.out.println("Manufacturer of p: " + plist.search(p.getID()).getManufacturer());
        System.out.println("Price of p: " + plist.search(p.getID()).getPrice());

        // Test toString method
        System.out.println("Testing toString method: "+p);

        // Displays the success or failure of insertion
        System.out.println("Did the insertions work? " + result);
    }
}