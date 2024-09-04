import java.util.Scanner;

public class Sort {

    public static void toSortAlphabets(String name) {
        int len = name.length();
        char[] charArray = name.toCharArray();

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j <= len - 1; j++) {
                if ((int) charArray[i] > (int) charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        System.out.println(new String(charArray));
    }

    public static boolean isAlphabetic(String name) {
        for (char c : name.toCharArray()) {
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string you want in alphabetical order: ");
        String name = scanner.nextLine();

        if (isAlphabetic(name)) {
            toSortAlphabets(name);
        } else {
            System.out.println("Please! Enter only Alphabets");
        }

        scanner.close();
    }
}

