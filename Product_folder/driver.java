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

        // Assign iterator to all products
        Iterator<Product> iterator = plist.getProducts();

        // Displays all products
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        };

        // Displays the success or failure of insertion
        System.out.println(result);
    }
}