package Programmingchallenges;

import java.util.Scanner;

public class Task19_GradeCalculation 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to grade calculation calculator\n:");
        
        System.out.println("total mark of exam :");
        float totalmark= input.nextFloat();
        System.out.print("Enter first number :");
        float firstnum = input.nextFloat();
        System.out.print("Enter secound number :");
        float secoundnum = input.nextFloat();
        System.out.print("Enter third number :");
        float thirdnum= input.nextFloat();
        System.out.print("Enter fourth number :");
        float fourthnum= input.nextFloat();
        System.out.print("Enter fifth number :");
        float fifthnum= input.nextFloat();
        
        float sum=(firstnum+secoundnum+thirdnum+fourthnum+fifthnum )*100 ;
        
        if(sum/totalmark >=90){
            System.out.println("your garde is 'A' ");
        } else if (sum/totalmark >=75) {
            System.out.println("your garde is 'B' ");
        } else if (sum/totalmark >=60) {
            System.out.println("your garde is 'C' ");
        } else if (sum/totalmark >=30) {
            System.out.println("your garde is 'D' ");
        }else {
            System.out.println("your grade is 'f' ");
        }


    }
}
