package com.company;

import java.util.Scanner;
import static com.company.VendingMachine.*;
//import static com.company.ItemsFeatures.display_item;

public class Customer {
    //static ArrayList<VendingItems> item_list = new ArrayList<>();
    Scanner sc= new Scanner(System.in);

    public void customer_page() {
        System.out.println("hello customer...........");
       // Owner ow = new Owner();
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.display_item();
        System.out.println("choose item by giving its index:");
        int itm = sc.nextInt();
        --itm;
        VendingItems vii = new VendingItems();
               vii= item_list.get(itm);
        System.out.println("ur selected item is:" + vii.itemname + "\tprice:" + vii.price+"$");

        System.out.println("how many  "+vii.itemname+ "  do u want:");
        int qua = sc.nextInt();
        if (qua> vii.quantity){
            System.out.println("we dont have that plenty of  "+vii.itemname+ " please enter the required quantity:");
            qua =sc.nextInt();

        }

        int cost = vii.price * qua;
        System.out.println("pay the bill  " + cost+ "$");
        int bill = sc.nextInt();
        if (bill < cost) {
            System.out.println("u have low balance");
        } else if (bill > cost) {
            int rembal = bill - cost;
            System.out.println("take  "+  vii.itemname + "and  take change: " + rembal);
        } else {
            System.out.println("take it  " + vii.itemname);
        }
        vii.quantity= vii.quantity-qua;
        if (vii.quantity<=0){
            item_list.remove(itm);
        }
    }
}
