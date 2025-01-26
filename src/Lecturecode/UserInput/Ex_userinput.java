package Lecturecode.UserInput;

import java.util.Scanner;

public class Ex_userinput
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = input.next();
        System.out.println("Good morning"+ name);
        System.out.println(name + " " + "enter your age");
        int age = input.nextInt();
        System.out.println("your age is :" + age);
        System.out.println("enter your pincode");
        int pincode = input.nextInt();
        System.out.println("you pincode is:"+ pincode);
        System.out.println(name + "tell your mailid:");
        String email = input.next();
        System.out.println(email);
        

    }
}
