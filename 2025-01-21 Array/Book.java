public class Book extends Product {
    private String author;
    public Book(){
        author = "";
    }

    public Book(String code, String description, double price, String author){
        super(code, description, price);
        this.author = author;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public String toString(){
        System.out.println(super.toString());
        return "Author:     " + author;
    }
}
