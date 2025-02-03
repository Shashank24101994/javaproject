package Programmingchallenges;

import java.util.Scanner;

public class Task28_MultiplicationTable
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplicationworld\n ");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        PrintMultiplicationTable(num);

    }

    public static void PrintMultiplicationTable(int num){
        int i=1;
        while (i<=10){
            System.out.println(num + " X "+ i + " = "+(num*i));
            i++;
        }
    }


}
