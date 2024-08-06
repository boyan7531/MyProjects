package bg.softuni;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello welcome to the BMI Calculator");
        System.out.println("Enter your HEIGHT in CM");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your WEIGHT in kg");
        double weight = Integer.parseInt(scanner.nextLine());

        double meters = (double) height / 100;

        double bmi = weight / (meters * meters);
        System.out.printf("Your BMI is %.2f" ,  bmi);
    }
}