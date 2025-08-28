import java.util.Scanner;

public class Reverse5Letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the 5 letters word: ");
        String fiveLetters = input.nextLine();

        if (fiveLetters.length() == 5){
            String combine = "" + fiveLetters.charAt(4)+ fiveLetters.charAt(3)+ fiveLetters.charAt(2)+ fiveLetters.charAt(1)+ fiveLetters.charAt(0);
            System.out.println("The reverse of the word "+ fiveLetters+ " is "+ combine);
        }
        else {
            System.out.println("Please run again and enter 5-letter word");
        }


    }
}
