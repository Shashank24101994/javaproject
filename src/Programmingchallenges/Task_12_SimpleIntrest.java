package Programmingchallenges;

import java.util.Scanner;

public class Task_12_SimpleIntrest
{
    public static void main(String[] args) {
        System.out.println("Calculate Simple Intrest:\n ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of Principal amount Rs: ");
        int principal = input.nextInt();
        System.out.print("Enter value of time in year: ");
        double time = input.nextDouble();
        System.out.print("Enter value of rate : ");
        double rate = input.nextDouble();
        double simpleintrest=(principal*rate*time)/100;
        System.out.println("\nsimple intrest equals to:"+ simpleintrest);
    }
}
