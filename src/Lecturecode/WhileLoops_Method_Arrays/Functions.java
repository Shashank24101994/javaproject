package Lecturecode.WhileLoops_Method_Arrays;

public class Functions {
    public static void main(String[] args) {
   //  RightHalfPyramid();
       playfootball();
    }


    public static void RightHalfPyramid() {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void playfootball(){
        System.out.println("play football on sunday");
    }

        }








