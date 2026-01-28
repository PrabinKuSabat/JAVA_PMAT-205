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
                String[] parts = line.split(",");
                String code = parts[0].trim();
                int quantity;
                if (parts.length > 1) {
                    try {
                        quantity = Integer.parseInt(parts[1].trim());
                    } catch (NumberFormatException e) {
                        quantity = rand.nextInt(10) + 1;
                    }
                } else {
                    quantity = rand.nextInt(10) + 1;
                }
                
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
