package Lecturecode.WhileLoops_Method_Arrays;

public class MultiDimensionalAraay
{
    public static void main(String[] args) {
        int [][] arr=new int[2][3];
        arr[0][0]=54;

        int[][] arr2={{4,5,6},{7,8,9},{5,8,9,9},{7,8,9,6,8}};
      //  System.out.println(arr2[2].length);

        // Array Traversal
        int i=0;
        while (i< arr2.length){
            int j=0;
            while (j< arr2[i].length){
                System.out.print(arr2[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
