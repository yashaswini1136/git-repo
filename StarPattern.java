import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {        // For each row
            for (int j = 1; j <= i; j++) {       // Print stars in each row
                System.out.print("* ");
            }
            System.out.println();                 // Move to next line
        }
    }
}
