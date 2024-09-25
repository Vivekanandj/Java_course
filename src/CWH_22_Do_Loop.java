import java.util.Scanner;
public class CWH_22_Do_Loop {
    public static void main(String[] args) {
//        int x=1;
//        do{
//            System.out.println(x);
//            x=x+1;
//        }while (x<=10);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
