package bai1;

public class Product {
 
    //cac thuoc tinh
    private String name;
    private double price;
    
    public Product(){
        this.name = "no name";
        this.price = 1.0;
    }
    
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    
    //Muc dich: thiet dat ten moi cho ten cua san pham 
    public void setName(String tenMoi){
        this.name = tenMoi;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double giaKhac){
        this.price = giaKhac;
    }
    
}
