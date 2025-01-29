package Programmingchallenges;

import java.util.Scanner;

public class Task17_greatestofThreeNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Greatest of Three Number :");
        System.out.print(" Please Enter First Number : ");
        int firstnum= input.nextInt();
        System.out.print("Please Enter Secound Number :");
        int secoundnum= input.nextInt();
        System.out.print("Please Enter Third Number :");
        int thirdnum= input.nextInt();

        if(firstnum>=secoundnum && firstnum>=thirdnum){
            System.out.println(firstnum +" is greatest num");
        } else if (secoundnum>=firstnum && secoundnum>=thirdnum) {
            System.out.println(secoundnum +" is greatest");
        }else {
            System.out.println( thirdnum +"is greatest");
        }

    }
}
