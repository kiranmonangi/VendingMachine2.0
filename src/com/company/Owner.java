package com.company;

//import java.util.ArrayList;
import java.util.Scanner;


//import static com.company.VendingMachine.*;
import static java.lang.System.exit;

public class Owner {
   // static ArrayList<VendingItems> item_list = new ArrayList<>();
  //  static VendingItems v = new VendingItems();

   // static Owner ow = new Owner();
    int choice;
    public Owner() {


    }
    public void ownerfeaures() {
        VendingMachine vendingMachine =new VendingMachine();

                do {

                        System.out.println("1.add item \t 2.remove item \t 3 display item \t 4 exit \t 5 goto home:");
                        System.out.println("enter ur choice");
                        Scanner sc = new Scanner(System.in);
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1 -> {


                                vendingMachine.add_item();
                                break;
                            }
                            case 2 -> {
                                vendingMachine.delete_item();
                                break;
                            }
                            case 3 -> {
                                vendingMachine.display_item();
                                break;
                            }
                            case 4 -> {
                                exit(0);
                                break;
                            }

                            default -> {
                                System.out.println("enter proper choice:");
                                break;
                            }

                        }
                } while (choice<5);
    }
}






