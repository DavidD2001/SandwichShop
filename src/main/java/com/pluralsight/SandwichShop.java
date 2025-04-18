package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of Sandwich(Regular=1, Large=2): ");
        int size = scanner.nextInt();

        //base price + Size
        double basePrice;
        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Sorry the requested size is invalid, please try again.");
            return;
        }
        //isLoaded T/F?
        System.out.println("Would you like the sandwich loaded? (Y/N);");
        String loadedSandwich = scanner.next().toLowerCase();
        boolean isLoaded = loadedSandwich.equals("y");
        double loadedPrice;
       if (isLoaded) {
           loadedPrice = basePrice + 1.00;
           System.out.println("Sandwich loaded successfully.");
       }else {
           loadedPrice = basePrice;
           System.out.println("Sandwich not Loaded.");
        }

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        //Discount Rate for minor and Elder
        double agediscountRate = 0.00;
        if (age <= 17) {
            agediscountRate = 0.10;
        } else if (age >= 65) {
            agediscountRate = 0.20;
        }
        double ageDiscount = basePrice * agediscountRate;
        double isLoadedageDiscount = loadedPrice * agediscountRate;
        double totalPrice = basePrice - ageDiscount;
        double totalLoadedPrice = loadedPrice - isLoadedageDiscount;

        //If age based on totalPrice
        if (age <= 17) {
            System.out.println("Your total is: " + totalPrice);
        } else if (age >= 65) {
            System.out.println("Your total is: " + totalPrice);
        } else {
            System.out.println("Your Total Price is: " + basePrice);
            if (age <= 17 && isLoaded) {
                System.out.println("Your total is: " + totalLoadedPrice);
            }else if (age >= 65 && isLoaded); {
                System.out.println("Your total is: " + totalLoadedPrice);
            }



    }scanner.close();


}

}
