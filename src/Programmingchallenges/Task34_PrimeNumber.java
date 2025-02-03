package Programmingchallenges;

import java.util.Scanner;

public class Task34_PrimeNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("find the prime number: ");
        System.out.println("Please enter your Number");
        int num = input.nextInt();
        boolean isprime=isprime(num);
        if(isprime){
            System.out.println("your number is prime");
        }else {
            System.out.println("your num is not prime");
        }

    }
    public static boolean isprime(int num){
        int i=2;
        while (i<num){
            if(num%i ==0){
                return false;
            }
            i++;
        }
        return true;
    }


    }


