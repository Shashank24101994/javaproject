package Programmingchallenges;

import java.util.Scanner;

public class Task15_num_pos_neg_zero
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Checker\n");
        System.out.println(" Please enter your number: ");
        int number= input.nextInt();

        if(number>0){
            System.out.println(" Your number is positive");
        } else if (number==0) {
            System.out.println("number is zero");
        } else{
            System.out.println("number is negative");
        }
    }
}
