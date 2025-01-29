package Programmingchallenges;

import java.util.Scanner;

public class Task18_leapyear1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to leap year calculator :");
        System.out.println("please enter your Present Year ? : ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Your year is a leap year");
        } else {
            System.out.println("Your year is not a leap year");
        }
        }
    }

