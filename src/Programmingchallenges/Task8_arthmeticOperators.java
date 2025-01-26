package Programmingchallenges;

import java.util.Scanner;

public class Task8_arthmeticOperators
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of A :");
        int a = input.nextInt();
        System.out.println("Enter value of B :");
        int b= input.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
