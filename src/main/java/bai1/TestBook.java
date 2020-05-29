package bai1;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Poly", "poly@fpt.edu.vn", true);
        
        Book javaBook = new Book("Java 2", author, 34.6);
        
        System.out.println(javaBook);
        
        //thay doi tac gia cho doi tuong javaBook
        Author kimDongAuthor = new Author("Kim dong", "kim@gmail.com", false);
        javaBook.setAuthor(kimDongAuthor);
        
        //lay ve thong tin tac gia cua doi tuong javaBook
        Author authorJavaBook = javaBook.getAuthor();
        System.out.println(authorJavaBook.getEmail());
        
        
    }
}
