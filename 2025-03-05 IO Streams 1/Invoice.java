package main.invoice;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.LinkedList;
import main.invoice.ProductOrder;

public class Invoice {
    private String invoiceNumber = null;
    private LocalDate date;
    private LinkedList<ProductOrder> ordersList;
    private double total = 0;

    public Invoice(String invoiceNumber, LinkedList<ProductOrder> ordersList){
        this.invoiceNumber = invoiceNumber;
        this.date = LocalDate.now();
        this.ordersList = ordersList;
        calculateTotal(ordersList);
        
            
        }


    private void calculateTotal(LinkedList<ProductOrder> ordersList){
        for(ProductOrder order: ordersList){
            this.total+=order.getTotal();
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice Number: ").append(invoiceNumber).append("\n");
        sb.append("Date: ").append(date).append("\n");
        sb.append("Orders:\n\n");
        for (ProductOrder order: ordersList) {
            sb.append(order.toString()).append("\n");
        }

        sb.append("Total: ").append(total);
        return sb.toString();
    }
}
