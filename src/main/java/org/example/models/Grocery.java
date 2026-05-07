package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {

    public static ArrayList<String> groceryList = new ArrayList<>();

    public static void startGrocery() {

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {

            System.out.println("""
                    0 -> Çıkış
                    1 -> Ürün Ekle
                    2 -> Ürün Sil
                    """);

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 0:
                    isRunning = false;
                    break;

                case 1:
                    System.out.println("Eklemek istediğiniz ürünleri giriniz:");
                    String addInput = scanner.nextLine();
                    addItems(addInput);
                    break;

                case 2:
                    System.out.println("Silmek istediğiniz ürünleri giriniz:");
                    String removeInput = scanner.nextLine();
                    removeItems(removeInput);
                    break;

                default:
                    System.out.println("Geçersiz seçim");
            }

            printSorted();
        }
    }

    public static void addItems(String input) {

        String[] items = input.split(",");

        for (String item : items) {

            String cleanedItem = item.trim();

            if (!checkItemIsInList(cleanedItem)) {
                groceryList.add(cleanedItem);
            }
        }

        Collections.sort(groceryList);
    }

    public static void removeItems(String input) {

        String[] items = input.split(",");

        for (String item : items) {

            String cleanedItem = item.trim();

            if (checkItemIsInList(cleanedItem)) {
                groceryList.remove(cleanedItem);
            }
        }

        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product) {

        return groceryList.contains(product);
    }

    public static void printSorted() {

        Collections.sort(groceryList);

        System.out.println("Liste:");

        for (String item : groceryList) {
            System.out.println(item);
        }
    }
}