package Programmingchallenges;

import java.util.Scanner;

public class Task13_compoundIntrest
{
    public static void main(String[] args) {
        System.out.println("calculate compound intreest:\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of Principal amount Rs: ");
        int principal = input.nextInt();
        System.out.print("Enter value of time in year: ");
        double time = input.nextDouble();
        System.out.print("Enter value of rate : ");
        double rate = input.nextDouble();
        double CI =principal *Math.pow(1+rate/100,time);
        System.out.println("your compound intrest in RS:"+CI);
    }
}
