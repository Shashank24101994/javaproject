package Programmingchallenges;

import java.util.Scanner;

public class SUM_task6
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int FirstNumber = input.nextInt();
        System.out.println("Enter Secound Number: ");
        int SecoundNumber=input.nextInt();
        int sum = FirstNumber+SecoundNumber;
        System.out.println("SUM OF TWO NUMBER IS : "+sum);
    }
}
