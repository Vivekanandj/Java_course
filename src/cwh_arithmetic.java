import java.util.Scanner;

public class cwh_arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values for arithmetic progression
        System.out.print("Enter the first term (a): ");
        int firstTerm = scanner.nextInt();

        System.out.print("Enter the common difference (d): ");
        int commonDifference = scanner.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int numberOfTerms = scanner.nextInt();

        // Generate and display arithmetic progression
        int[] arithmeticProgression = new int[numberOfTerms];
        for (int i = 0; i < numberOfTerms; i++) {
            arithmeticProgression[i] = firstTerm + (i * commonDifference);
        }

        System.out.println("Arithmetic Progression: ");
        for (int term : arithmeticProgression) {
            System.out.print(term + " ");
        }
    }
}
