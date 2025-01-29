package Programmingchallenges;

import java.util.Scanner;

public class Task18_leapyear
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to leap year calculator :");
        System.out.println("please enter your Present Year ? : ");
        int year = input.nextInt();

        if(year %400==0){
            System.out.println("present year is leap year");
        } else if(year%100==0){
            System.out.println("it is non leap year");
        } else if (year%4==0) {
            System.out.println("Present year is leap year");
        } else {
            System.out.println("it is non leap year");
        }
    }
}
