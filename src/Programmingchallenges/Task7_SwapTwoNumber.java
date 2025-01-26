package Programmingchallenges;

import java.util.Scanner;

public class Task7_SwapTwoNumber
{
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter first value: ");
//        int firstvalue = input.nextInt();
//        System.out.println("enter secound value: ");
//        int secoundvalue = input.nextInt();
//        System.out.println("first value is " + secoundvalue +" "+"secound value is "+firstvalue);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of A :");
        int a = input.nextInt();
        System.out.println("Enter the Value Of B :");
        int b = input.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("Swapping Done......");
        System.out.println("Value of A IS: "+a);
        System.out.println("Value of B IS: "+b);

    }
}
