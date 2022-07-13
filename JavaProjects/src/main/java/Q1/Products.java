/*
 * PROG6112-Assignment 1
 * 17096823
 * Question 1
 */
package Q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jordan Castling-Bolt
 */
public class Products extends ReportData {

    // the constructor
    public Products() {
        this.code = "";
        this.description = "";
        this.catagory = 0;
        this.warranty = 0;
        this.price = 0;
    }

    public Products(String code, String description, int category, int warranty, double price) {
        this.code = code;
        this.description = description;
        this.catagory = category;
        this.warranty = warranty;
        this.price = price;
    }
    //Creating an Array List
    ArrayList<String> newProduct = new ArrayList<>();

    // Method that adds products to list
    public static int getProductByCode(ArrayList<String> newProduct, String code) {
        for (int i = 0; i < newProduct.size(); i++) {
            if (newProduct.get(i).compareTo(code) == 0) {
                return i;
            }
        }
        return -1;
    }

    //DisplayMenu method
    public void DisplayMenu() {
        Scanner input = new Scanner(System.in);
        {
            int ch;
            System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION\n"
                    + "*****************************************\n"
                    + "(1) to launch menu or any other key to exit: ");
            ch = input.nextInt();
            if (ch == 1) {
                //Exception handling
                try {
                    System.out.println("(1) Capture a new product.");
                    System.out.println("(2) Search for a product.");
                    System.out.println("(3) Update a product.");
                    System.out.println("(4) Delete a product.");
                    System.out.println("(5) Print report.");
                    System.out.println("(6) Exit Application");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        this.CaptureProduct();
                    }
                    if (choice == 2) {
                        this.SearchProduct();
                    }
                    if (choice == 3) {
                        this.UpdateProduct();
                    }
                    if (choice == 4) {
                        this.DeleteProduct();
                    }
                    if (choice == 5) {
                        this.Print();
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid key");
                    this.DisplayMenu();
                }
            }
        }
    }
    //CaptureProduct Method
    public void CaptureProduct() {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter product code: ");
            code = input.nextLine();
            System.out.println("Enter product name: ");
            description = input.nextLine();
            System.out.println("Select Product Catagory: Desktop Computer - 1, Laptop - 2, Tablet - 3, Printer - 4, Gamiing Console - 5 >> ");
            catagory = input.nextInt();
            System.out.println("Indicate the product warranty: Enter (1) for 6 months or any other key for 2 years >> ");
            warranty = input.nextInt();
            System.out.println("Enter the price for " + description);
            price = input.nextDouble();
            System.out.println("Enter the stock level for " + description);
            stock = input.nextInt();
            input.nextLine();
            System.out.println("Enter the supplier for " + description);
            supplier = input.nextLine();
            //Adds new product to list
            newProduct.add(code);
            System.out.println("\nProduct has been successfully saved.\n");
            this.DisplayMenu();
        } catch (Exception e) {
            System.out.println("The product code could not be located. Invalid Product");
            this.DisplayMenu();
        }
    }
    //SearchProduct Method
    public void SearchProduct() {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter product code: ");
            code = input.nextLine();
            //Retrieves product from Array list
            int index = getProductByCode(newProduct, code);
            if (index != -1) {
                System.out.println(newProduct.get(index) + "\n"
                        + "Search Results" + "\n"
                        + "*************************" + "\n"
                        + "Product code: " + this.code + "\n"
                        + "Product description: " + this.description + "\n"
                        + "Product Category: " + this.catagory + "\n"
                        + "Product price: " + this.price + "\n"
                        + "Product Stock Levels: " + this.stock + "\n"
                        + "Product Supplier: " + this.supplier + "\n");
                this.DisplayMenu();
            }
        } catch (Exception e) {
            System.out.println("The product code could not be located. Invalid Product");
            this.DisplayMenu();
        }
    }
    //UpdateProduct method
    public void UpdateProduct() {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter product code: ");
            code = input.nextLine();
            int index = getProductByCode(newProduct, code);
            if (index != -1) {
                //Gets input from user on which updates to do
                System.out.println("Update the warranty? (y)Yes, (n)No>>  ");
                String answerW;
                answerW = input.nextLine();
                if (answerW.equalsIgnoreCase("y")) {
                    System.out.println("Enter new warranty for " + description);
                    warranty = input.nextInt();
                    input.nextLine();
                } else if (answerW.equalsIgnoreCase("n")) {
                    input.nextLine();
                }
                System.out.println("Update the product price? (y)Yes, (n)No>>  ");
                String answerP;
                answerP = input.nextLine();
                if (answerP.equalsIgnoreCase("y")) {
                    System.out.println("Enter new price for " + description);
                    price = input.nextInt();
                    input.nextLine();
                } else if (answerP.equalsIgnoreCase("n")) {
                    input.nextLine();
                }
                System.out.println("Update the stock level? (y)Yes, (n)No>>  ");
                String answerS;
                answerS = input.nextLine();
                if (answerS.equalsIgnoreCase("y")) {
                    System.out.println("Enter new stock level for " + description);
                    stock = input.nextInt();
                    input.nextLine();
                } else if (answerS.equalsIgnoreCase("n")) {
                    input.nextLine();
                }
                //Updates product
                newProduct.remove(index);
                newProduct.add(index, code);
                System.out.println("\nProduct has been successfully saved\n");
                this.DisplayMenu();
            }
        } catch (Exception e) {
            System.out.println("The product code could not be located. Invalid Product");
            this.DisplayMenu();
        }
    }
    //DeleteProduct method
    public void DeleteProduct() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter product code to delete: ");
            code = input.nextLine();
            int index = getProductByCode(newProduct, code);
            if (index != -1) {
                newProduct.remove(index);
                System.out.println("\nProduct has been deleted.\n");
                this.DisplayMenu();
            }
        } catch (Exception e) {
            System.out.println("The product code could not be located. Invalid Product");
            this.DisplayMenu();
        }
    }
    //Print method
    public void Print() {
        for (int i = 0; i < newProduct.size(); i++) {
            System.out.println(newProduct.get(i)
                    + "\n"
                    + "*************************" + "\n"
                    + "Product code: " + this.code + "\n"
                    + "Product description: " + this.description + "\n"
                    + "Product Category: " + this.catagory + "\n"
                    + "Product price: " + this.price + "\n"
                    + "Product Stock Levels: " + this.stock + "\n"
                    + "Product Supplier: " + this.supplier + "\n");
        }
    }
}
