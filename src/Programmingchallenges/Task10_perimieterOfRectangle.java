package Programmingchallenges;

import java.util.Scanner;

public class Task10_perimieterOfRectangle
{
    public static void main(String[] args) {
        System.out.println("Calculate Permeter : ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        int a = input.nextInt();
        System.out.print("Enter value of B: ");
        int b = input.nextInt();
        System.out.print("Enter value of C: ");
        int c = input.nextInt();
        System.out.print("Enter value of D: ");
        int d = input.nextInt();

        int perimeter=a+b+c+d;
        System.out.println("\nperimeter  Result : "+ perimeter);

    }
}
