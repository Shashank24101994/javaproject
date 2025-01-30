package Programmingchallenges;

import java.util.Scanner;

public class Task26_RightShift
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to showcasing Right shift operator ");
        System.out.println("Enter your number ");
        int num = input.nextInt();
        int result = num >> 1;
        System.out.println("your result is : "+ result );
    }
}
