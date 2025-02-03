package Programmingchallenges;

import java.util.Scanner;

public class Task33_HCF
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Please Enter your Number: ");
        int firstnum= input.nextInt();
        System.out.println("Please Enter your Number: ");
        int secoundnum= input.nextInt();
        int HCF= hcf(firstnum,secoundnum);
        System.out.println("hcf of two number is "+HCF);
    }
    public static int hcf(int firstnum,int secoudnum){
        int gcd=1;
        int i=2;
        int least=least(firstnum,secoudnum);
        while (i <= least) {
            if (firstnum % i == 0 && secoudnum% i == 0) {
                gcd = i;
            }
            i++;
        }

        return gcd;
    }
    public static int least(int num1 , int num2){
        if(num1<num2) {
            return num1;
        }else{
            return num2;
        }

    }


    }

