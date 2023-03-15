package ru.netology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int port = 8088;
        String host = "netology.homework";
        Scanner scanner = new Scanner(System.in);
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String resp = in.readLine();
            System.out.println(resp);
            out.println(scanner.nextLine());
            resp = in.readLine();
            System.out.println(resp);
            out.println(scanner.nextLine());
            resp = in.readLine();
            System.out.println(resp);

//            String resp = in.readLine();
//            while (true) {
//                if(resp.equalsIgnoreCase("quit")) {break;}
//                System.out.println(resp);
//                String answer = scanner.nextLine();
//                out.println(answer);
//                resp = in.readLine();
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
