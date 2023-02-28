import java.util.Scanner;

public class Array2D {
    Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Array2D array2D=new Array2D();
        System.out.println("Enter the number of rows:-");
        int m= sc.nextInt();
        System.out.println("Enter number of columns:-");
        int n= sc.nextInt();
        System.out.println("Select type of array:-\n1.Integer\n2.Double\n3.Boolean");
        int choice= sc.nextInt();
        System.out.println("Enter elements of the array:-");
        switch (choice){
            case 1:
                array2D.integerArray(m,n);
                break;
            case 2:
                array2D.doubleArray(m,n);
                break;
            case 3:
                array2D.booleanArray(m,n);
                break;
            default:
                System.out.println("Incorrect choice");
                break;
        }
    }

    private void booleanArray(int m, int n) {
        boolean array[][]=new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                array[i][j]= sc.nextBoolean();
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

    private void doubleArray(int m, int n) {
        double array[][]=new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                array[i][j]= sc.nextDouble();
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

    public void integerArray(int m,int n){
        int array[][]=new int[m][n];
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
