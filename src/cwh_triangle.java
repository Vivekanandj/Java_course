import java.util.Scanner;

public class cwh_triangle {
    static void tri(int n){
        System.out.print("Triangle Series of " + n + " numbers: ");
        for(int i=1;i<=n;i++){
            int sum = (i*(i+1))/2;
            
            System.out.print(sum + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tri(n);
    }
}
