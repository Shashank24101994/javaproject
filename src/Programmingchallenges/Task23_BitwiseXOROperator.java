package Programmingchallenges;

import java.util.Scanner;

public class Task23_BitwiseXOROperator
{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Showcasing Bitwise And operator");
        System.out.print("Please Enter The First Number ");
        int firstnum = input.nextInt();
        System.out.print("Please Enter The Secound Number ");
        int secondnum = input.nextInt();

        int result = firstnum ^ secondnum ;
        System.out.println(" result is " + result);
    }
}
