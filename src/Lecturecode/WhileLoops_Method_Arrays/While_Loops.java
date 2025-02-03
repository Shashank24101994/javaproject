package Lecturecode.WhileLoops_Method_Arrays;

import java.util.Scanner;

public class While_Loops
{
    public static void main(String[] args) {
        int num = 1;//intialization
        while (num<=100){  //condition
            System.out.println(num); // actual work
            num= num+1; // updating the condition

        }
        int count = 500;
        while (count >= 200) {
            System.out.println(count);
            count -= 1;
        }
        Scanner input = new Scanner(System.in);
        int i=0;
        while (i<5){
            int inp= input.nextInt();
            System.out.println("number is : "+ inp);
            i++;
        }
    }
}
