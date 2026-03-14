package com.minibank;

import java.io.*;
import  java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String path = "database.txt";

        Map<String, Double> userMap = new HashMap();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if(parts.length == 2){
                    String name = parts[0];
                    double balance = Double.parseDouble(parts[1]);

                    userMap.put(name, balance);
                    System.out.println(name + " balance: " + balance);
                }
            }
        }catch (IOException e){
            System.err.println("Ошибка: Файл базы данных не найден по пути: " + path);
        }
        if(userMap.containsKey("Bob")){
            double currentBalance = userMap.get("Bob");
            userMap.put("Bob", currentBalance + 100);
            System.out.println("Бобу начислен бонус! Новый баланс: " + userMap.get("Bob"));
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (Map.Entry<String, Double> entry : userMap.entrySet()) {
                String line = entry.getKey() + ", " + entry.getValue();

                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}