package controller;

/**
 * Created by nonth on 26/1/2560.
 */

public class BankAccount {
    public static boolean deposit(){
        System.out.println("=== Deposit ===");
        System.out.print("Please input balance (0 to return to the main menu): ");
        return true;
    }

    public static boolean withdraw(){
        System.out.println("=== Withdraw ===");
        System.out.print("Withdraw (0 to return to the main menu): ");
        return true;
    }

    public static boolean transfer(){
        System.out.println("=== Transfer ===");
        System.out.print("Please input account number (0 to return to the main menu):");
        return true;
    }
}
