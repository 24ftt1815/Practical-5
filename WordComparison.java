import java.util.Scanner;

public class WordComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String firstW = input.nextLine();

        System.out.print("Enter the second word: ");
        String secondtW = input.nextLine();

        System.out.print("Are both words the same? "+ firstW.equalsIgnoreCase(secondtW));
    }
}
