package Lecturecode.operator_ifelse_numbersystem;

import java.util.Scanner;

public class Relational_Operator
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ELIGIBLE FOR VOTING ?: ");
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if(age>18)
        {
            System.out.println("you are eligible for voting");
        } else{
            System.out.println("Not eligible for voting");
        }

        System.out.println("Welcome to Driving License Portal");
        System.out.print("Please enter your age: ");
        int age1 = input.nextInt();

        if (age1 >= 18) {
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("Beta cycle chalao");
        }
    }
    }

