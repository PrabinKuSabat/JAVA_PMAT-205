package main.invoice;

import main.utility.*;
import main.products.*;
import main.products.db.*;
public class ProductOrder implements Comparable<ProductOrder> {
    private Product product;
    private int quantitiy;
    private double total;
    private static int orderObjectCount;

    public ProductOrder(Product product, int quantity){
        this.product = product;
        this.quantitiy = quantity;
        this.total += product.getPrice()*quantity;
        orderObjectCount++;
    }

    public ProductOrder() {
        this(ProductDB.getProduct("Please enter the Product id: "),
        Validator.getInt("Please enter the quantity: "));
    }
    
    @Override
    public int compareTo(ProductOrder order) {
        if(this == order){
            return 0;
        }
        return Double.compare(total, order.getTotal());
    }

    @Override
    public String toString(){
        return  "Product:    \n" + product + "\n\n" + 
                "Quantitiy:  " + quantitiy + "\n" +
                "Total:      " + total + "\n\n\n"; 
    }

    public double getTotal(){
        return this.total;
    }

    public static int getOrderObjectCount (){
        return orderObjectCount;
    }
}
