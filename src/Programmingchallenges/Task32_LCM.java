package Programmingchallenges;

import java.util.Scanner;

public class Task32_LCM
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Please Enter your Number: ");
        int firstnum= input.nextInt();
        System.out.println("Please Enter your Number: ");
        int secoundnum= input.nextInt();
        int lcm = lcm(firstnum,secoundnum);
        System.out.println("LCM OF THE TWO NUMBER :"+ lcm);

    }
    public static int lcm(int first , int secound){
       int i=1;
       while (i<=secound){
           int factor = first *i;
           if(factor%secound==0){
               return factor;
           }
           i++;
       }

        return 0;
    }
}
