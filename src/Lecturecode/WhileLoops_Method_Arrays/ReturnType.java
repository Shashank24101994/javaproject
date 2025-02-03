package Lecturecode.WhileLoops_Method_Arrays;

import java.util.Scanner;

public class ReturnType
{
    public static float readnumber(){
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter your number: ");
        float number = input.nextFloat();
        return number;

    }





    public static void greet(){
        System.out.println("welcome to simple calculator: ");
    }

    public static void main(String[] args) {
        greet();
        float firstnum = readnumber();
        float secoundnum= readnumber();

        System.out.println("sum of two number: "+(firstnum+secoundnum));

    }
}
