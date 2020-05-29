package bai1;

/**
 *
 * @author VanTT
 */
public class TestProduct {
    public static void main(String[] args) {
        
        Product p1 = new Product();
        System.out.println(p1.getName() + ", " + p1.getPrice());
        
        //doi ten p1
        p1.setName("Mobile");
        System.out.println("In ten sau khi doi: " + p1.getName());
        
        //doi gia p1
        p1.setPrice(23.556);
        System.out.println("In gia sau khi doi: " + p1.getPrice());
        
        
        Product p2 = new Product("Sam sung", 34.677);
        System.out.println(p2.getName() + "," + p2.getPrice());
        
        //doi ten p2 thanh nokia
        p2.setName("nokia");
        System.out.println("ten p2 bi doi: " + p2.getName());
    }
}
