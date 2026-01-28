package main;

import main.invoice.*;
import main.utility.*;
import main.products.db.*;
import main.products.*;
import java.util.*;

public class InvoiceApp {
    public static void main(String[] args) {
        LinkedList<ProductOrder> orderList = new LinkedList<>();
        String input;
        
        while (true) {
            input = null;
            Product productCode = null;
            do{
                input = Validator.getString("Please enter the Product code (or type 'done' to finish): ");
                
                if (input.equalsIgnoreCase("done")) {
                    break;
                }

                productCode = ProductDB.getProduct(input);
            }while(productCode == null);

            if(input.equalsIgnoreCase("done") ) break;

            int quantity = Validator.getInt("Enter quantity: ");
            
            // Create a new ProductOrder based on the product code and quantity.
            ProductOrder order = new ProductOrder(productCode, quantity);
            orderList.add(order);
        }
        
        // Sort the orders by total using the compareTo method.
        Collections.sort(orderList);
        
        // Generate an invoice number (here using current time in milliseconds for uniqueness).
        String invoiceNumber = "INV" + System.currentTimeMillis();
        Invoice invoice = new Invoice(invoiceNumber, orderList);
        
        // Print out the sorted invoice.
        System.out.println("\n" + invoice);
    }
}
