package Lecturecode.operator_ifelse_numbersystem;

import java.util.Scanner;

public class Logical_Operators
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Delhi metro Rail ticket calculator :");
        System.out.print("Enter you age :");
        int age = input.nextInt();
        System.out.print("is youFemale (true/false) :");
        boolean isfemale= input.nextBoolean();
        System.out.println("are you senior citizen (age>62) ( true/false)");
        boolean seniorcitizen = input.nextBoolean();

        if(age>62){
            System.out.println("you got 50% discount on ticket");
        } else if (age>62 && isfemale) {
            System.out.println("you are free to travel");
        } else if (isfemale) {
            System.out.println("you got 75 % discount");
        } else {
            System.out.println("happy journey  no discount");
        }


    }
}
