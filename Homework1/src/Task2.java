import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int algorithmId = in.nextInt();
        int loopType = in.nextInt();
        int n = in.nextInt();
        if (algorithmId == 1) {
            int[] arr = new int[n+1];
            arr[0] = 0;
            arr[1] = 1;
            int k = 1;
            System.out.println(arr[1]);
            if (loopType == 1) {
                while (k <= n) {
                    arr[k+1] = arr[k-1] + arr[k];
                    System.out.println(arr[k+1]);
                    k++;
                }
            }
            if (loopType == 2) {
                do {
                    arr[k+1] = arr[k-1] + arr[k];
                    System.out.println(arr[k+1]);
                    k++;
                }
                while (k <= n);
            }
            if (loopType == 3) {
                for (int i = 1; i <= n; i++) {
                    arr[i+1] = arr[i-1] + arr[i];
                    System.out.println(arr[i+1]);
                }
            }
        }
        if (algorithmId == 2) {
            double fib = 1;
            int k = 1;
            if (loopType == 1) {
                while (k <= n) {
                    fib = fib*k;
                    k++;
                }
            }
            if (loopType == 2) {
                do {
                    fib = fib*k;
                    k++;
                }
                while (k <= n);
            }
            if (loopType == 3) {
                for ( int i = 1; i <= n; i++) {
                    fib = fib*i;
                }
            }
            System.out.println(fib);
        }
    }
}
