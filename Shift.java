
import java.util.Scanner;

public class Shift {

    public static void toReverse(char[] name, int start, int end) {
        while (start < end) {
            // Swap characters
            char temp = name[start];
            name[start] = name[end];
            name[end] = temp;
            start++;
            end--;
        }
    }

    public static void toShift(char[] name, int length) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of digits you want to shift at last: ");
        int shift = scanner.nextInt();
        if (shift > length) {
            System.out.println("The shift value is greater than the length of the name you have entered.");
            return;
        }

        if (shift == 0 || length <= 1) {
            System.out.println(name);
            return;
        }

        toReverse(name, 0, shift - 1);
        toReverse(name, shift, length - 1);
        toReverse(name, 0, length - 1);

        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any word: ");
        String input = scanner.nextLine();
        char[] name = input.toCharArray(); // Convert input string to char array
        int length = name.length; // Get the length of the input

        toShift(name, length);

        scanner.close();
    }
}