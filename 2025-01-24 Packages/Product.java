package main.products;

import java.text.NumberFormat;
import main.products.interfaces.Tagable;

public class Product implements Tagable, Comparable<Product> {
    private String code;
    private String description;
    private double price;
    private static int count = 0;
    private StringBuilder tags = new StringBuilder();

    public Product()
    {
        code = "";
        description = "";
        price = 0;
        count ++;
        tags.append("");
    }

    public Product(String code, String description, double  price, String tag){
        this.code = code;
        this.description = description;
        this.price = price;
        count ++;
        tags.append(tag);

    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public void setTags(String tag)
    {   
        if(tags.isEmpty()){
            tags.append(tag);
        }
        else{
            tags.append("," + tag);
        }
    }

    public StringBuilder getTags(){
        return tags;
    }

    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " + this.getFormattedPrice() + "\n" +
               "Tags:        " + tags;
    }

    public static void countUP(){
        count++;
    }

    public static int getCount()
    {
        return count;
    }

    public int compareTo(Product product){
        return code.compareTo(product.getCode());
    }
}

