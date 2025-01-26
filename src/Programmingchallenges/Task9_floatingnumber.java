package Programmingchallenges;

import java.util.Scanner;

public class Task9_floatingnumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator start\n");

        System.out.println("ENTER FIRST FLOAT NUMBER");
        float firstnumber = input.nextFloat();

        System.out.println("ENTER SECOUND FLOAT NUMBER");
        float secoundnumber = input.nextFloat();

        float product= firstnumber*secoundnumber;
        System.out.println("product of two float is: "+ product);
    }
}
