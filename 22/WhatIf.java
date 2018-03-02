import java.util.Scanner;

public class WhatIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int age = input.nextInt();
        
        if (age <= 16) {
            System.out.println("nah, u too young dawg ");
        }
        
        if (16 < age && age <= 18) {
            System.out.println("no votin for u yung'un ");
        }
        
        if (18 < age && age <= 25) {
            System.out.println("ay, just get a car, broke boy ");
        }
        
        if (age > 25) {
            System.out.println("u good dawg");
        }
    }
}
