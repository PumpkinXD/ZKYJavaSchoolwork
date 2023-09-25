package io.github.pumpkinxd.examples.bookstore;

public class Book {
    private int bookID;
    private String bookName;
    private double price;
    private int stock;

    public Book(int bookID, String bookName, double price, int stock) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.price = price;
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addStock(int stock) {
        this.stock += stock;
    }

    public int getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
