package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    
    private ArrayList<Product> listProduct;
    
    public ProductController(){
        listProduct = new ArrayList<>();
    }
    
    public void inputProduct(){
        System.out.println("Enter product information: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Price: ");
        double price = input.nextDouble();
        
        Product product = new Product(name, price);
        
        listProduct.add(product);
    }
    
    public void outputProduct(){
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }
}
