package bai1;

/**
 *
 * @author VanTT
 */
public class Product implements DAO{
    
    private String name;
    private double price;
    
    public Product(){
        this.name = "no name";
        this.price = 12.5;
    }
    
    public Product(String n, double p){
        this.name = n;
        this.price = p;
    }

    /*
     * Muc dich: tra ve ten cua san pham
     *  
     */
    public String getName() {
        return name;
    }

    /*
     * Muc dich: tra ve ten cua san pham
     *  
     */
    public double getPrice() {
        return price;
    }

    /*
     * Muc dich: thay doi ten cua san pham
     * Dau vao: ten khac
     *  
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Muc dich: tra ve ten cua san pham
     *  
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getImportTax(){
        return 0.1 * this.price;
    }

    @Override
    public String toString() {
        return name + "; " + price + "; tax: " + getImportTax();
    }

    @Override
    public void insert() {
        System.out.println("insert thanh cong!");
    }

    @Override
    public void select() {
        System.out.println("select thanh cong!");
    }

    @Override
    public void update() {
        System.out.println("update thanh cong!");
    }

    @Override
    public void delete() {
        System.out.println("delete thanh cong!");
    }
   
}
