package main;

import main.utility.ReadMyFile;
import main.utility.StoreMyObject;
import main.invoice.Invoice;
import main.invoice.ProductOrder;
import java.util.LinkedList;

public class InvoiceApp1 {
    public static void main(String[] args) {
        String fileName = "orders.txt"; // Path to your text file
        LinkedList<ProductOrder> ordersList = ReadMyFile.readOrdersFromFile(fileName);
        
        if (ordersList.isEmpty()) {
            System.out.println("No orders were found in the file.");
            return;
        }
        
        String invoiceNumber = "INV" + System.currentTimeMillis();
        Invoice invoice = new Invoice(invoiceNumber, ordersList);
        

        String myProducOrderFile = "MyProdctOrders.txt";
        StoreMyObject.serializeInvoice(invoice, myProducOrderFile);
        
        Invoice deserializedInvoice = StoreMyObject.deserializeInvoice(myProducOrderFile);
        if (deserializedInvoice!=null) {
            System.out.println("Deserialized Invoice:");
            System.out.println(deserializedInvoice);
        }

    }
}
