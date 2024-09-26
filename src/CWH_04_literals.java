import java.util.Scanner;
public class CWH_04_literals {
    public static void main(String[] args){
        byte age=34;
        int age2=59;
        short age3=87;
        long ageDino=533333333333333L;
        char ch='A';
        float f1=0.4f;
        double d1=4.22;

        boolean a=true;
        System.out.println(age2);
        String str="Vivek";
        System.out.println(str);

            Scanner read = new Scanner(System.in);
            // accept the count of test cases given in the 1st line
            int t = read.nextInt();

            // Run a loop to accept 't' inputs
            for(int i=0; i<t; i++)
            {
                // accept an integer N in each test case
                int n = read.nextInt();
                // output the number mirror for each test case
                // "println" prints output followed with a new line.
                System.out.println(n);
            }
        }
}
