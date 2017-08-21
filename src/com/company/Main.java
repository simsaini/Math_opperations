package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        Double operand1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter a Second Number: ");
        Double operand2 = Double.parseDouble(scanner.nextLine());
        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;
        showResults(sum, difference, multiplication, remainder);
    }
    public static void showResults(double sum, double difference, double multiplication, double remainder){
        System.out.println("The sum is " + sum );
        System.out.println("The difference is " + difference);
        System.out.println("The multiplication is " + multiplication);
        System.out.println("The remainder is " + remainder);
    }
}
