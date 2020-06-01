package bai4;

import java.io.Serializable;

/**
 *
 * @author VanTT
 */
public class Book implements Serializable{
    
    private String ISBN;
    private String bookName;
    private String author;
    private String publisher;

    public Book() {
    }

    public Book(String ISBN, String bookName, String author, String publisher) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", bookName=" + bookName + ", author=" + author + ", publisher=" + publisher + '}';
    }
     
}
