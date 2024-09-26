import java.util.Scanner;

public class cwh_34_recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int factorial = 1;
            for(int i=1;i<=n;i++){
                factorial = factorial*i;
            }
            return factorial;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(factorial_iterative(n));
    }
}
