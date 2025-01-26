package Programmingchallenges;

import java.util.Scanner;

public class Task14_Fahrenheit_to_Celsius
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter: ");
        System.out.println("Enter your temp in F: ");
        float TEMP = input.nextFloat();
        float cel=(TEMP-32)*5/9;
        System.out.println("VALUE OF CELCIUS IN DEGREE"+ " " +cel+" degree");
    }
}
