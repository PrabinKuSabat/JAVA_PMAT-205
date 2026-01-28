package main.utility;

import java.io.*;
import main.invoice.Invoice;

public class StoreMyObject {

    public static void serializeInvoice(Invoice invoice, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(invoice);
            System.out.println("Invoice serialized to " + fileName);
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }


    public static Invoice deserializeInvoice(String fileName) {
        Invoice invoice = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            invoice = (Invoice) ois.readObject();
            System.out.println("Invoice deserialized successfully from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
        return invoice;
    }

}
