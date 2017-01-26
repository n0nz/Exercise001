package view;

import controller.Authentication;
import controller.BankAccount;
import model.Student;

import java.util.Scanner;

/**
 * Created by nonth on 26/1/2560.
 */
public class VerySimpleBankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username;
        int password;
        Student checkLogin = null;
        int choice;

        System.out.println("=== Welcome to Very Simple Bank System ===");
        System.out.println("Please login before continue...");
        do {
            System.out.print("Enter your username: ");
            username = sc.next();
            System.out.print("Enter your password: ");
            password = sc.nextInt();
            checkLogin = Authentication.login(username, password);
            if (checkLogin == null) {
                System.err.println("Username/Password is wrong.. please try again...");
            }
        } while (checkLogin == null);
        Student s1 = checkLogin;
        System.out.println("Name: " + s1.getStudentName());
        System.out.println("Balance: " + s1.getBalanceFormatted());
        System.out.print("=============\n" +
                "Please select menu:\n" +
                "1. Deposit\n" +
                "2. Withdraw\n" +
                "3. Transfer\n" +
                "0. Exit\n" +
                "=============\n" +
                "Your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                BankAccount.deposit();
                break;
            case 2:
                BankAccount.withdraw();
                break;
            case 3:
                BankAccount.transfer();
                break;
            default:
                System.exit(0);
        }

    }
}
