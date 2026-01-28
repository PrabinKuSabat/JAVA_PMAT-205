package main.network;

import java.io.*;
import java.net.*;

public class SendInvoiceDatagram {
    public static void main(String[] args) {
        String myName = "Prabin Kumar Sabat\n";
        byte[] nameBytes = myName.getBytes();

        String fileName = "MyProdctOrders.txt";
        byte[] invoiceBytes = null;
        try (FileInputStream fis = new FileInputStream(fileName)) {
            invoiceBytes = fis.readAllBytes();
        } catch (IOException e) {
            System.out.println("Error reading serialized invoice file: " + e.getMessage());
            return;
        }

        byte[] combined = new byte[nameBytes.length + invoiceBytes.length];
        System.arraycopy(nameBytes, 0, combined, 0, nameBytes.length);
        System.arraycopy(invoiceBytes, 0, combined, nameBytes.length, invoiceBytes.length);

        try {
            DatagramSocket socket = new DatagramSocket();

            InetAddress serverAddress = InetAddress.getByName("10.110.30.26");
            int serverPort = 9999;

            DatagramPacket packet = new DatagramPacket(combined, combined.length, serverAddress, serverPort);

            socket.send(packet);
            System.out.println("Sent serialized Invoice (with name) to server.");

            byte[] ackBuffer = new byte[50];
            DatagramPacket ackPacket = new DatagramPacket(ackBuffer, ackBuffer.length);
            socket.receive(ackPacket);

            String ackMessage = new String(ackPacket.getData(), 0, ackPacket.getLength());
            System.out.println("Received acknowledgement: \n" + ackMessage);

            socket.close();
        } catch (IOException e) {
            System.out.println("Error during Datagram send/receive: " + e.getMessage());
        }
    }
}
