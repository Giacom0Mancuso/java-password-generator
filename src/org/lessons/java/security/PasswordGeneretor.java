package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGeneretor {
    public static void main(String[] args) {
        Scanner scanName = new Scanner(System.in);
        String name = scanName.nextLine();
        Scanner scanSurname = new Scanner(System.in);
        String surname = scanSurname.nextLine();
        Scanner scanFavColor = new Scanner(System.in);
        String favColor = scanFavColor.nextLine();
        Scanner scanDay = new Scanner(System.in);
        int day = scanDay.nextInt();
        Scanner scanMonth = new Scanner(System.in);
        int month = scanMonth.nextInt();
        Scanner scanYear = new Scanner(System.in);
        int year = scanYear.nextInt();
        String password;
        password = name + surname + favColor +(day + month + year);
        System.out.println(password);

    }
}
