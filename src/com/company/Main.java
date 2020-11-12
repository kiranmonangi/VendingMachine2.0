package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<VendingItems> item_list = new ArrayList<>();

    public static void main(String[] args) {
        int cc;
        System.out.println("***************welcome to vending machine****************");
        do {
            System.out.println("Owner---1\t\t\t\t\tCustomer------2");
            Scanner sc = new Scanner(System.in);
             cc = sc.nextInt();
            if (cc == 1) {
              //  VendingItems vending = new VendingItems();
                Owner owner = new Owner();
                owner.ownerfeaures();
            }
            if (cc == 2) {
                customer c = new customer();
                c.customer_page();
            }
        }while (true);
    }
}




