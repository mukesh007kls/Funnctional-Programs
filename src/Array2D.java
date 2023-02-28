import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:-");
        int m= sc.nextInt();
        System.out.println("Enter number of columns:-");
        int n= sc.nextInt();
        int array[][]=new int[m][n];
        System.out.println("Enter elements of the array:-");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                array[i][j]= sc.nextInt();
            }
        }
        System.out.println("Elements in 2D array are:-");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
