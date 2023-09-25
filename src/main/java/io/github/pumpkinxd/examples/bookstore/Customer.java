package io.github.pumpkinxd.examples.bookstore;

public class Customer {
    public static void main(String[] args) {

        BookStoreage bookStoreage=new BookStoreage();
        bookStoreage.put(new Book(0,"测试图书00",11,191));
        bookStoreage.put(new Book(1,"测试图书01",45,20));
        bookStoreage.put(new Book(2,"测试图书02",14,30));
        for (Book val:bookStoreage.getStockpile().values()
             ) {
            System.out.println(val.getBookName()+"\n"+val.getBookID()+"\n"+val.getStock()+"\n"+val.getPrice());
        }


        Book bucket;

    }

}
