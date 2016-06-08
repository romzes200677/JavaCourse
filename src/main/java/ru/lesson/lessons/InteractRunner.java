package ru.lesson.lessons;

import java.util.Scanner;

/**
 * Created by оплоплопшгншгрло on 08.06.2016.
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            Calculator calculator = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.println("Enter first number");
                String first = scanner.next();
                System.out.println("Enter second number");
                String second = scanner.next();
                calculator.add(Integer.valueOf(first),Integer.valueOf(second));
                System.out.println("Result = "+calculator.getResult());
                calculator.clearResult();
                System.out.println("Exit :yes/no");
                exit=scanner.next();
            }
        } finally {
            scanner.close();
        }
    }
}
