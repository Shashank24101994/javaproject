package Programmingchallenges;

import java.util.Scanner;

public class Task26_EvenOdd
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check Number is even or odd ");
        System.out.println("Enter your number ");
        int num = input.nextInt();

        if((num & 1)==1){
            System.out.println("your number is odd");
        } else {
            System.out.println("your number is even");
        }
    }
}
