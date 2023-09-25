package io.github.pumpkinxd.examples.bookstore;

import java.util.HashMap;

/***
 * @author PumpkinXD
 */
public class BookStoreage  {
    private HashMap<Integer,Book> stockpile; //should be a(n) array/arraylisy/vector of set<book>??????????
    private HashMap<String,Integer> index;
    public BookStoreage() {
        stockpile=new HashMap<>();
        index=new HashMap<>();
    }

    public BookStoreage(Book abook) {
        stockpile= new HashMap<>();
        stockpile.put(abook.getBookID(), abook);
        index.put(abook.getBookName(), abook.getBookID());
    }

    /***
     *
     * @param books books with same name
     */
    public void put(Book books){
        if(stockpile.containsKey(books.getBookID())){
            stockpile.get(books.getBookID()).addStock(books.getStock());

        }else {
            stockpile.put(books.getBookID(),books);
            index.put(books.getBookName(),books.getBookID());
        }
    }

    /***
     * fetch 1 book from the storage
     * @param bookID ID of the book
     * @return null if 0 books there
     */
    public Book pop(int bookID) {
        Book ret;
        if (!stockpile.containsKey(bookID)) return null;
        if (stockpile.get(bookID).getStock()<=1) {
            ret=new Book(bookID,stockpile.get(bookID).getBookName(),stockpile.get(bookID).getPrice(),1);
            stockpile.remove(bookID);
        }else {
            ret=new Book(bookID,stockpile.get(bookID).getBookName(),stockpile.get(bookID).getPrice(),1);
            stockpile.get(bookID).addStock(-1);
        }
        return ret;
    }

    /***
     * fetch x books from the storage
     * @param bookID ID of the book you wish to fetch
     * @param x
     * @return null if 0 books there or cannot get enough books for the caller
     *
     */
    public Book pop(int bookID,int x){
        Book ret;
        if (!stockpile.containsKey(bookID)) return null;
        if (stockpile.get(bookID).getStock()<x) return null;
        else {
            ret=new Book(bookID,stockpile.get(bookID).getBookName(),stockpile.get(bookID).getPrice(),x);
            stockpile.get(bookID).addStock(-x);
            if (stockpile.get(bookID).getStock()<1) stockpile.remove(bookID);
        }
        return ret;
    }

    /***
     * name of a book to it's id
     * @param bookName book's name
     * @return it's ID
     */
    public int GetBookID(String bookName) {
        return index.get(bookName);
    }

    public HashMap<Integer, Book> getStockpile() {
        return stockpile;
    }

    /***
     *
     * for testing
     */
    public static void main(String[] args) {
        BookStoreage bookStoreage=new BookStoreage();

    }

}
