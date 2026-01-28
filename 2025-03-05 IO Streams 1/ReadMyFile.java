package main.utility;

import java.io.*;
import java.util.*;
import main.products.*;
import main.products.db.ProductDB;
import main.invoice.ProductOrder;

public class ReadMyFile {
    public static LinkedList<ProductOrder> readOrdersFromFile(String fileName) {
        LinkedList<ProductOrder> orders = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            Random rand = new Random();
            while ((line = br.readLine()) != null) {
                // Split line by comma; trim to remove extra whitespace.
                String[] parts = line.split(",");
                String code = parts[0].trim();
                int quantity;
                if (parts.length > 1) {
                    try {
                        quantity = Integer.parseInt(parts[1].trim());
                    } catch (NumberFormatException e) {
                        // If the quantity is not valid, generate a random value between 1 and 10.
                        quantity = rand.nextInt(10) + 1;
                    }
                } else {
                    // If only code is provided, generate a random quantity.
                    quantity = rand.nextInt(10) + 1;
                }
                // Retrieve the product from ProductDB
                Product p = ProductDB.getProduct(code);
                if (p != null) {
                    ProductOrder order = new ProductOrder(p, quantity);
                    orders.add(order);
                } else {
                    System.out.println("Product with code " + code + " not found.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return orders;
    }
}
