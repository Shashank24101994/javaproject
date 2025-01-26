package Programmingchallenges;

import java.util.Scanner;

public class Task_11_AreaOfTriangle
{
    public static void main(String[] args) {
        System.out.println("calculate area of triangle");
        Scanner input = new Scanner(System.in);
        System.out.println("enter value of base in cms : ");
        double base = input.nextDouble();
        System.out.println("enter value of height in cms: ");
        double height= input.nextDouble();
        double area =0.5*base*height;
        System.out.println("area of triangle :"+ area+" cm2");
    }
}
