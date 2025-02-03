package Programmingchallenges;

import java.util.Scanner;

public class Task31_SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate sum of digit of number: ");
        System.out.println("please enter the number: ");
        int num = input.nextInt();
        int sumofdigit=sumofdigit(num);
        System.out.println("sum of digit "+ sumofdigit);
    }

    public static int sumofdigit(int num)
    {
        int sum=0;
        while (num>0){
            sum=sum +(num%10);
            num=num/10;
        }
        return sum;
    }
}
