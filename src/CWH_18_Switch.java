import java.util.Scanner;
public class CWH_18_Switch {
    public static void main(String[] args) {
        char var ='r';

        switch (var) {
            case 'r' -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case 'c' -> System.out.println("You are going to join a Job!");
            case 'd' -> System.out.println("You are going to get Retired!");
            default -> System.out.println("Enjoy Your life");
        }


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your age:");
//        int age =sc.nextInt();
//        if (age>=56){
//            System.out.println("You are experienced");
//        } else if (age>=46) {
//            System.out.println("You are semi-experienced");
//        } else if (age>=36) {
//            System.out.println("You are semi-semi-experienced");
//        }
//        else {
//            System.out.println("You are not experienced");
//        }
    }
}
