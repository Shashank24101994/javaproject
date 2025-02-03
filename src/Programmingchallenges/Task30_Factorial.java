package Programmingchallenges;

import java.util.Scanner;

public class Task30_Factorial
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to factorial Calculation: ");
        System.out.println("Please enter your num ");
        int  num = input.nextInt();
        long factor = factorail(num);
        System.out.println("factorial of number is: "+factor);


    }

    public static long factorail(int  num){
        if(num<2){
            return 1;
        }
        long fact=1;
        int i=2;

        while (i<=num){
            fact *=i;
            i++;
        }
        return fact;
    }
}
