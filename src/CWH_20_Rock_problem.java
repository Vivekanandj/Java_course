import java.util.Random;
import java.util.Scanner;

public class CWH_20_Rock_problem {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 is for Rock, 1 is for Paper, 2 is for Scissors");
        int user = sc.nextInt();
        int computer = r.nextInt(3);

        if((user == 0 && computer==2)||(user==1 && computer==0)||(user==2 && computer==1)){
            System.out.println("You Win!");
        }
        else if((user == 0 && computer==0)||(user==1 && computer==1)||(user==2 && computer==2)) {
            System.out.println("You Tie!");
        }
        else if((user == 0 && computer==1)||(user==1 && computer==2)||(user==2 && computer==0)) {
            System.out.println("You Lose!");
        }
        else {
            System.out.println("You gave wrong input!");
        }
    }
}
