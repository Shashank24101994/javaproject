package Programmingchallenges;

import java.util.Scanner;

public class Task29_SumOfOddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please calculate sumofoddnumber\n ");
        System.out.println("please enter number: ");
        int num = input.nextInt();
        int sum = SumOddNum(num);
        System.out.println("OddSum till " + num + "is: " + sum);

    }

    public static int SumOddNum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}








