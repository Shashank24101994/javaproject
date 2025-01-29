package Programmingchallenges;

import java.util.Scanner;

public class Task16_odd_even
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("check number is odd/even ? ");
        System.out.println(" Please enter your Number: ");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("your number is even :");
        } else{
            System.out.println("Your number is odd :");
        }
    }
}
