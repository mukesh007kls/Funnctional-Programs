import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y values:-");
        int x = sc.nextInt();
        int y = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The distance between (" + x + "," + y + ") and (0,0) is:- " + distance);
    }
}
