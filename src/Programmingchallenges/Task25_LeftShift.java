package Programmingchallenges;

import java.util.Scanner;

public class Task25_LeftShift
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to showcasing left shift operator ");
        System.out.println("Enter your number ");
        int num = input.nextInt();
        int result = num << 4;
        System.out.println("your result is : "+ result );
    }
}
