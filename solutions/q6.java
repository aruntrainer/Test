import java.io.IOException;
import java.util.Scanner;

class q6 {
    public static void typeA(int a[], int n) {
        boolean even = false, odd = false;
        for (int i = 0; i < n; i++) {
            if ((a[i] % 2) == 0) {
                even = true;
            } else {
                odd = true;
            }
        }
        if (even == true && odd == true) {
            System.out.println("Mixed Array");
        } else if (even == true) {
            System.out.println("Even Array");
        } else {
            System.out.println("Odd Array");
        }
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        typeA(a, n);
    }
}