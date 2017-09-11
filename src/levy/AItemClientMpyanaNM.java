/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package levy;

import java.util.Scanner;
import javax.swing.*;

/**
 /**
 Student Number,
 * Name 
 *  Surname 
 * Class Group.
 */
public class AItemClientMpyanaNM {

    int ctQty = 0;
    String ctName = "XXXXXXXXXX";
    double ctPrice = 0;
    int ctQOH = 0;
    int option = -1;

    ItemClsMpyanaNM item = new ItemClsMpyanaNM(ctName, ctPrice, ctQOH);

    public static void main(String[] args) {

        AItemClientMpyanaNM Client = new AItemClientMpyanaNM();

        Client.displayMenu();

    }

    public void displayMenu() {

        double total = 0;

        Scanner scanner = new Scanner(System.in);

        //do {

            try {
                option = Integer.parseInt(JOptionPane.showInputDialog("Enter  Option :"));

            } catch (NumberFormatException e) {

                System.out.println("Please enter a number");

            }
            do{
            if (option > 5) {

                System.out.println("Invalid option chosen – please re-enter");
                  option = Integer.parseInt(JOptionPane.showInputDialog("Enter  Option :"));
            } else {

                try {
                    option = Integer.parseInt(JOptionPane.showInputDialog("Enter  Option :"));

                } catch (NumberFormatException e) {
                    System.out.println("Please enter a number");
                }
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////
            if (option == 1) {
                System.out.print("");
                System.out.println("\t" + " Option 1:  An item is created");
                System.out.println("===========================================");
                System.out.print("Enter Name : ");
                ctName = scanner.next();
                item.setName(ctName);

                do {

                    System.out.print("Enter Price : ");
                    ctPrice = scanner.nextDouble();
                    item.setPrice(ctPrice);

                    if (ctPrice <= 0) {
                        System.out.print("price must be > 0\n");
                    }

                } while (ctPrice <= 0);

                do {

                    System.out.print("Enter quantity : ");
                    ctQOH = scanner.nextInt();
                    item.setQOH(ctQOH);

                    if (ctQOH < 0) {
                        System.out.print("Quantity must be >= 0\n");
                    }

                } while (ctQOH < 0);

                item.setName(ctName);
                item.setPrice(ctPrice);
                // item.setQOH(ctQOH);

            }

/////////////////////////////////////////////////////////////////////////////////////////////////////
            if (option == 2) {
                System.out.println("\t" + "Option 2:  An item is edited");
                System.out.println("===========================================");

                displaySubMenu();
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////
            if (option == 3) {
                System.out.println("\t" + "Option 3:  An item is displayed");
                System.out.println("===========================================");
                item.displayDetails();
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////
            if (option == 4) {
                System.out.println("\t" + "Option 4:  An item is bought");
                System.out.println("===========================================");

                System.out.print("how many items : ");
                ctQty = scanner.nextInt();

                if (ctQty < 0) {
                    System.out.print("iteams must be > 0\n");

                }

                if (ctQty > item.getQOH()) {
                    System.out.println("Not enough items in stock");
                    System.out.println(item.getQOH() + "Items left ");

                } else {
                    item.buyitem(ctQty);
                    total = item.getPrice() * ctQty;
                    String totDue = String.format("%.2f", total);
                    System.out.printf(ctQty + " " + "x" + " " + item.getName() + " " + "@" + " " + "R" + " " + item.getPrice() + "= R" + totDue+"\n");
                    System.out.println(item.getQOH() + "Items left ");

                }

            }
            item.setQOH(item.getQOH());

/////////////////////////////////////////////////////////////////////////////////////////////////////
            if (option == 5) {
                System.out.println("\t" + "\t" + "EXIT");
                System.out.println("===========================================");
                System.exit(0);
            }

        } while (option != 5);

    }

    public void displaySubMenu() {

        Scanner scanner = new Scanner(System.in);
        int option2 = 0;
        do {
            if (option2 < 0) {

                System.out.println("Invalid option chosen – please re-enter");
                option2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Sub-menu Option :"));

            } else if (option2 > 5) {

                System.out.println("Invalid option chosen – please re-enter");
                option2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Sub-menu Option :"));

            } else {

                option2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Sub-menu Option :"));

            }

            if (option2 == 1) {

                System.out.println("\t" + " Sub-menu Option 1:  Name is edited");
                System.out.println("===========================================================");
                System.out.println("Current Name :" + item.getName());
                System.out.print("Enter Name : ");
                ctName = scanner.next();
                item.setName(ctName);

            }
/////////////////////////////////////////////////////////////////////////////////////////////////////    
            if (option2 == 2) {
                System.out.println("\t" + "Sub-menu Option 2:  Price is edited");
                System.out.println("===========================================================");
                System.out.println("Current Price :" + item.getPrice());

                do {
                    try {
                        System.out.print("Enter Price : ");
                        ctPrice = scanner.nextDouble();
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a number");
                    }
                    if (ctPrice <= 0) {

                        System.out.print("price must be > 0\n");
                    }
                } while (ctPrice <= 0);
                item.setPrice(ctPrice);

            }
/////////////////////////////////////////////////////////////////////////////////////////////////////
            if (option2 == 3) {
                System.out.println("\t" + "Sub-menu Option 3:  Quantity on Hand is edited");
                System.out.println("===========================================================");
                System.out.println("Current QOH :" + item.getQOH());

                do {
                    try {
                        System.out.print("Enter New QOH : ");
                        ctQOH = scanner.nextInt();
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a number");
                    }
                    if (ctQOH < 0) {
                        System.out.print("QOH must be >= 0\n");
                    }
                } while (ctQOH <= 0);
                item.setQOH(ctQOH);

            }
/////////////////////////////////////////////////////////////////////////////////////////////////////
            if (option2 == 4) {
                System.out.println("\t" + " BACK TO THE MAIN MENU");
                System.out.println("===========================================================");
                displayMenu();
            }

        } while (option2 != 4);

    }

}
