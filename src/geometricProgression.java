import java.util.Scanner;

public class geometricProgression {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of number (n): ");
        int numberOfTerms = scanner.nextInt();
        System.out.print("Enter the value of ratio (r): ");
        int ratio = scanner.nextInt();
        System.out.print("Enter the first term value (x): ");
        int firstTerm = scanner.nextInt();

        double[] geometricProgression = generateGeometricProgression(numberOfTerms, ratio, firstTerm);

        if (ratio == 0 && numberOfTerms == 0) {
            System.out.println(1);
        } else {
            System.out.print("Geometric Progression is: ");
            for (double term : geometricProgression) {
                System.out.print(term + " ");
            }
        }
    }
    public static double[] generateGeometricProgression(int numberOfTerms, int ratio, int firstTerm) {
        double[] progression = new double[numberOfTerms];
        for (int i = 0; i < numberOfTerms; i++) {
            double power = Math.pow(ratio, i);
            progression[i] = firstTerm * power;
        }
        return progression;
    }
}

