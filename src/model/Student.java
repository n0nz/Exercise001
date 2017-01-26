package model;

import java.text.DecimalFormat;

/**
 * Created by nonth on 26/1/2560.
 */
public class Student {
    private String studentNumber;
    private String studentName;
    private double balance;


    public Student() {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.balance = balance;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBalanceFormatted(){
        DecimalFormat df = new DecimalFormat("###,###,000.00");
        String dcmBalance = df.format(getBalance());
        return dcmBalance;
    }
}
