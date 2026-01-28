package main.products;

public class Book extends Product {
    private String author;
    public Book(){
        author = "";
    }

    public Book(String code, String description, double price, String author, String tag){
        super(code, description, price, tag);
        this.author = author;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    @Override
    public String toString(){
        return super.toString() + "\nAuthor:     " + author;
    }
}