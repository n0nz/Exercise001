package controller;

import model.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by nonth on 26/1/2560.
 */
public class Authentication {
    public static Student login(String username, int password) {
        Student s1 = null;
        try {
            BufferedReader bf = new BufferedReader(new FileReader("Students.csv"));
            String text;
            try {
                while ((text = bf.readLine()) != null) {
                    if (username.equals(text.substring(0, 11)) && password == Integer.parseInt(text.substring(13, 17))) {
                        int strLen = text.length();
                        double balance = Integer.parseInt(text.substring(19, strLen));
                        s1 = new Student();
                        s1.setStudentNumber(username);
                        s1.setBalance(balance);

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return s1;
    }
}
