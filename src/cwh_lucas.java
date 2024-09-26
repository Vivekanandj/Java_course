import java.util.Scanner;

public class cwh_lucas {
    public static void luc(int n){
        int l = 2;
        int l1 = 1;
        System.out.print("Lucas Series of " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(l + " ");
           if (n==1) {
               System.out.println(1);
           }
           else {
               int l2 = l1+l;
               l = l1;
               l1 = l2;
           }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        luc(n);
    }
}
