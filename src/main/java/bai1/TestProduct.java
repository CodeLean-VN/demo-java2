package bai1;

public class TestProduct {
    public static void main(String[] args){
        
        //c1
        DAO sPCoThue1 = new Product("Nokia", 23.56);
        System.out.println("Ten SP1: " + sPCoThue1);
        System.out.println("Hien thi du lieu");
        sPCoThue1.select();;
        
        //c2
        Product sPCoThue2 = new Product("Sam sung", 25.67);
        System.out.println("Ten SP2: " + sPCoThue2.getName());
        double thueSP2 = sPCoThue2.getImportTax();
        System.out.println("Thue SP2: " + thueSP2);
        System.out.println("Chen db");
        sPCoThue2.insert();
        
        //Tao san pham khong thue
        DAO sPKhongThue1 = new NoTaxProduct("Dell", 12.56);
        
        Product sPKhongThue2 = new NoTaxProduct("Dasani", 5);
        
        NoTaxProduct sPKhongThue3 = new NoTaxProduct("casino", 2);
        
        
        /*NoTaxProduct vanHoa = new NoTaxProduct("Am nhac", 23.56);
        
        
        
        ProductController pController = new ProductController();
        
        for(int i = 0; i < 3; i++){
            System.out.println("Product " + (i+1) + ": ");
            pController.inputProduct();
        }
        
        pController.outputProduct();
        */    
            
        /*
        //1. Tao doi tuong Product ten la p1 
        //su dung phuong thuc khoi tao ko tham so        
        Product p1 = new Product();
        
        System.out.println("Ten luc dau: " + p1.getName());
        
        //2. Doi ten cua doi tuong p1 thanh "Nokia"
        p1.setName("Nokia");
        
        //3. Hien thi ten va gia cua p1
        System.out.println("Ten sau khi doi: " + p1.getName() 
                                                + "; gia: " + p1.getPrice());

        
        //4. Hien thi thue cua p1
        double thueP1 = p1.getImportTax();
        System.out.println("Thue cua p1: " + thueP1);
        
        //5. Tao doi tuong Product ten la p2
        //su dung phuong thuc khoi tao voi 2 tham so 
        //name = "sam sung"; price = 23.56
        
        
        //6. Doi gia cho p2 thanh 56.89
        
        //7. Hien thi ten va gia cua p2
       */
        
    }
}
