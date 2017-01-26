package controller;

import model.Student;

/**
 * Created by nonth on 26/1/2560.
 */
public class Authentication {
    public static Student login(String username, int password){
        if(username.equals("56130500026")  && (password == 1234)){
            Student s1 = new Student("56130500026", "Nonthawat Duangchai", 100000.00);
            return s1;
        }else{
           return null;
        }
    }
}
