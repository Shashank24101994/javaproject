package Lecturecode.WhileLoops_Method_Arrays;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr ={3,6,7,8,9,10,122,35,36,12,55};
        System.out.println("Welcome to Array Searching \n");
        System.out.println("Enter the number you want to Search:");
        int num = input.nextInt();
        boolean isfound = isFound(arr,num);
        if(isfound){
            System.out.println("your number was found:");
        }else {
            System.out.println("your number was not found");
        }
    }

    public static boolean isFound(int[]arr , int num){
        int index=0;
        while (index< arr.length){
            if(arr[index]==num){
                return true;

            }
            index++;
        }
        return false;
    }
}
