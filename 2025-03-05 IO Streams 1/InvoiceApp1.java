package main;

import main.utility.ReadMyFile;
import main.invoice.Invoice;
import main.invoice.ProductOrder;
import java.util.LinkedList;

public class InvoiceApp1 {
    public static void main(String[] args) {
        String orderFile = "orders.txt"; // Path to your text file
        LinkedList<ProductOrder> ordersList = ReadMyFile.readOrdersFromFile(orderFile);
        
        if (ordersList.isEmpty()) {
            System.out.println("No orders were found in the file.");
            return;
        }
        
        // Create an invoice with a unique number (using current time in millis)
        String invoiceNumber = "INV" + System.currentTimeMillis();
        Invoice invoice = new Invoice(invoiceNumber, ordersList);

        // Display the invoice
        System.out.println(invoice);
    }
}
