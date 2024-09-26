import java.util.Scanner;

public class cwh_fibonacci {
    public static void fib(int n){
        int f = 0;
        int f1 = 1;
        System.out.print("Fibonacci Series of " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(f + " ");
            int f2= f1+f;
            f = f1;
            f1 = f2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
        System.out.println(n);
    }
}
