import java.util.Scanner;

public class CWH_06_Percentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject1");
        float subject1= sc.nextFloat();
        System.out.println("Enter the marks of subject2");
        float subject2= sc.nextFloat();
        System.out.println("Enter the marks of subject3");
        float subject3= sc.nextFloat();
        System.out.println("Enter the marks of subject4");
        float subject4= sc.nextFloat();
        System.out.println("Enter the marks of subject5");
        float subject5= sc.nextFloat();

        float sum1 = subject1 + subject2 + subject3 + subject4 + subject5;
        System.out.print("THe sum of 5 subjects:");
        System.out.println(sum1);

        float sum2 = sum1 / 500;
        System.out.println("The total marks of all subject in decimal is:");
        System.out.println(sum2);
        float sum3 = sum2 * 100;
        System.out.println("The Percentage of total subject is:");
        System.out.println(sum3);
    }
}
