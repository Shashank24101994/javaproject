package Lecturecode.WhileLoops_Method_Arrays;

public class Parameter {


    public static void main(String[] args) {
        int number = sumtwonumber(4, 5);
        int number2 = sumtwonumber(7, 9);
        int number3 = sumtwonumber(-67, 89);
        int number5 = sumtwonumber(97, 98);
        System.out.println("The Sum of Two Number is : \n" + number);
        System.out.println("The Sum of Two Number is: \n" + number2);
        System.out.println("The Sum of Two Number is: \n" + number3);
        System.out.println("The Sum of Two Number is: \n" + number5);
    }


        public static int sumtwonumber ( int firstnum, int secoundnum){
        System.out.println("Recived First Number : " + firstnum);
        System.out.println("Recived Secound  Number : " + secoundnum);
        int sum = firstnum + secoundnum;
        return sum;
    }

}


