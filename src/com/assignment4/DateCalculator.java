package com.assignment4;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateCalculator {

    public static void main(String[] args) throws ParseException {



        UsersPersonalDetails usersPersonalDetails = new UsersPersonalDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        usersPersonalDetails.firstName = scanner.next();

        System.out.print("Please enter your last name: ");
        usersPersonalDetails.lastName = scanner.next();

        System.out.print("please enter your age: ");
        usersPersonalDetails.age = scanner.next();

        System.out.print("please enter your pronoun: ");
        usersPersonalDetails.pronoun = scanner.next();

        System.out.println("please enter your date: ");
        usersPersonalDetails.userDate = scanner.next();


        System.out.println("please enter the date in this format: dd/MM/YYYY: ");
        usersPersonalDetails.anotherDate = scanner.next();
        Date anotherDate = SimpleDateFormat.getDateTimeInstance().parse(usersPersonalDetails.anotherDate);


        System.out.println("enter a number: ");
        String number = scanner.next();
        String numberToCalculate = number + usersPersonalDetails.userDate;
        System.out.println(numberToCalculate);











    }

}
