package Lecturecode.WhileLoops_Method_Arrays;

import java.util.Scanner;

public class ReturnType_swappingofnumber
{
    public static int readnumber(){
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter The Value : ");
        int num= input.nextInt();
        return num;
    }

    public static void message(){
        System.out.println("swapping of two number\n");
    }

    public static void endcode(){
        System.out.println("swapping of two number.....\n");

    }

    public static void main(String[] args) {
        message();
        int a=readnumber();
        int b= readnumber();
        int c=a;
        a=b;
        b=c;
        endcode();
        System.out.println("value of A Is: "+a);
        System.out.println("value of B Is: "+c);
    }
}
