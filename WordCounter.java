import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words using spaces as the delimiter
        String[] words = sentence.split("\\s+");

        // Output the number of words
        System.out.println("The sentence has " + words.length + " words.");

        scanner.close();
    }
}