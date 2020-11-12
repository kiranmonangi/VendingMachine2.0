package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

    static ArrayList<VendingItems> item_list = new ArrayList<>();

    public  void add_item() {
         VendingItems vi = new VendingItems();

        //  System.out.println("adding item");
         int price,quantity;
         String item;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the item u have to add:");
        item = sc.nextLine();
        System.out.println("enter price for that:");
        price = sc.nextInt();
        System.out.println("quantity to that:");
        quantity = sc.nextInt();

        vi = new VendingItems(item, price, quantity);
        item_list.add(vi);
        System.out.println("item added to the machine");
    }

    public  void delete_item() {

        System.out.println("enter the index  u have to delete");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        item_list.remove(num);
        System.out.println("u deleted the item");
    }

    public  void display_item() {
        System.out.println("items are");
        int k = 1;
        for (VendingItems vv : item_list) {

            System.out.println(k + "  " + vv);
            k = k + 1;
        }
    }
}
