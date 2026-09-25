package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String studentName = "Rahul";
        int mark1 = 85;
        int mark2 = 92;
        int mark3 = 88;

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Student Result");
        System.out.println("--------------------");
        System.out.println("Name      : " + studentName);
        System.out.println("Total     : " + total);
        System.out.println("Average   : " + average);

        if (average >= 50)
            System.out.println("Result    : PASS");
        else
            System.out.println("Result    : FAIL");

    }
}
