package bai1;

public class Book {
    private String name;
    private Author author;
    private double price;

    public Book() {
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    //Muc dich: Thiet dat tac gia khac cho lop Book
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "; " + price + "; " + author.getEmail();
    }
    
}
