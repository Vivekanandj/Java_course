import java.util.Scanner;

public class cwh_pell {
    static void pell(int n){
        int p=0;
        int p1=1;
        System.out.print("Pell Series of " + n + " numbers: ");
        for(int i=1;i<=n;i++){
            System.out.print(p + " ");
            int p2=(2*p1)+p;
            p=p1;
            p1=p2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pell(n);
    }
}
