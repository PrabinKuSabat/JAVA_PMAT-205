import java.text.NumberFormat;

public class Product implements java.lang.Comparable<Product>
{
    private String code;
    private String description;
    private double price;
    private static int count = 0;

    public Product()
    {
        code = "";
        description = "";
        price = 0;
        count ++;
    }

    public Product(String code, String description, double  price){
        this.code = code;
        this.description = description;
        this.price = price;
        count ++;
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

    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " + this.getFormattedPrice();
    }

    public static void countUP(){
        count++;
    }

    public static int getCount()
    {
        return count;
    }

    @Override
    public int compareTo(Product product){
        return code.compareTo(product.getCode());
    }
}