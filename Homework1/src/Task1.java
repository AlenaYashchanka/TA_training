import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int p = in.nextInt();
        double m1 = in.nextDouble();
        double m2 = in.nextDouble();

        double PI = java.lang.Math.PI;
        double g = 4*(PI*PI)*((a^3)/((p^2)*(m1+m2)));
        System.out.println("Result G = " + g);
    }
}
