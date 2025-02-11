package Programmingchallenges;

import java.util.Scanner;

public class Task35_ReverseNum
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse the Digit");
        System.out.println("Please Enter Your Number: ");
        int num = input.nextInt();
        int reverse= reversenum(num);
        System.out.println("your reverse num is"+reverse);
    }

    public static int reversenum(int num)
    {
        int newnum=0;
        while (num>0){
            int digit=num%10;
            newnum=newnum *10 +digit;
            num=num/10;
        }
        return newnum;
    }
}
