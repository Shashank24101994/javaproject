package Programmingchallenges;

import java.util.Scanner;

public class Task36_fibonacci
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series: ");
        System.out.println("Please Enter your Num ");
        int num= input.nextInt();
        System.out.println("Here is the Fibonacci Series");
        Fibonacciseries(num);
    }

    public static void Fibonacciseries(int num){
        if(num<0)return;
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");
        int first =0 , secound=1;
        while (first +secound<=num){
            int third = first+secound;
            System.out.print(third+" ");
            first=secound;
            secound=third;
        }
    }
}
