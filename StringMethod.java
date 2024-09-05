/***
 * Q:- create all string method
 * owner name:- Ayush ray
 * Date:- 5-9-2024
 */

import java.util.Scanner;

class StringFunctions {
    static String string = "";
//    Split method
    public void split(String str) {
        String[] arr = new String[str.length()];
        String output = "";
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (!output.isEmpty()) {
                    arr[index] = output;
                    index++;
                }
                output = "";
            } else {
                output += str.charAt(i);
            }
        }
        if (!output.isEmpty()) {
            arr[index] = output;
            index++;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
// Splice method
    public void splice(String str, int firstIndex, int lastIndex) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if (i >= firstIndex && i < firstIndex + lastIndex) {
                continue;
            } else {
                output += str.charAt(i);
            }
        }
        System.out.println(output);
    }
//  count word
    public void count(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
//     replace method
    public void replace(String string, String oldSubstring, String newSubstring) {
        String output = "";
        int i = 0;
        int length = oldSubstring.length();

        while (i <= string.length() - length) {
            if (string.substring(i, i + length).equals(oldSubstring)) {
                output += newSubstring;
                i += length;
            } else {
                output += string.charAt(i);
                i++;
            }
        }
        output += string.substring(i);

        System.out.println(output);
    }
//    reverse method
    public void reverse(String str) {
        StringBuilder output = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            output.append(str.charAt(i));
        }
        System.out.println(output.toString());
    }
//     shift character
    public String shiftCharacters(String str, int index) {
        int length = str.length();
        String output = "";
        for (int i = length - index; i < length; i++) {
            output += str.charAt(i);
        }
        for (int i = 0; i < length - index; i++) {
            output += str.charAt(i);
        }
        return output;
    }

    public int maximum(int i, int j) {
        return Math.max(i, j);
    }
    // count char
    public void coutmaxWord(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            max = maximum(max, count);
        }

        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                if (count == max) index = i;
            }
        }

        if (index != -1) {
            System.out.println(str.charAt(index) + " -> " + max);
        } else {
            System.out.println("No repeated characters found.");
        }
    }
    // sort method

    public void toSortAlphabets(String name) {
        int len = name.length();
        char[] charArray = name.toCharArray();

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        System.out.println(new String(charArray));
    }

    public boolean isAlphabetic(String name) {
        for (char c : name.toCharArray()) {
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) {
                return false;
            }
        }
        return true;
    }
// Append method
    public void append() {
        System.out.println(Constants.ENTER_STRING_PROMPT);
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if (str.equalsIgnoreCase(Constants.EXIT_COMMAND)) break;
            string += str + " ";
            System.out.println(string);
        }
    }
// palindrome
    public void palindrome(String str) {
        int firstIdx = 0;
        int lastIdx = str.length() - 1;
        boolean flag = true;
        while (firstIdx <= lastIdx) {
            if (str.charAt(firstIdx) != str.charAt(lastIdx)) {
                flag = false;
                break;
            }
            firstIdx++;
            lastIdx--;
        }
        if (flag) System.out.println(Constants.PALINDROME);
        else System.out.println(Constants.NOT_A_PALINDROME);
    }
}



public class StringMethod {
    public static void main(String[] args) {
        StringFunctions stringFunction = new StringFunctions();
        Scanner sc = new Scanner(System.in);
        String str = "";

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println(Constants.ENTER_STRING_PROMPT);
            str = sc.nextLine();

            System.out.println(Constants.CHOOSE_OPERATION_PROMPT);
            System.out.println(Constants.APPEND_OPTION);
            System.out.println(Constants.COUNT_OPTION);
            System.out.println(Constants.PALINDROME_OPTION);
            System.out.println(Constants.MAX_FREQUENCY_OPTION);
            System.out.println(Constants.REPLACE_OPTION);
            System.out.println(Constants.REVERSE_OPTION);
            System.out.println(Constants.SORT_OPTION);
            System.out.println(Constants.SPLICE_OPTION);
            System.out.println(Constants.SPLIT_OPTION);
            System.out.println(Constants.SHIFT_OPTION);

            System.out.println("Enter here: ");

            if (!sc.hasNextInt()) {
                System.out.println(Constants.INVALID_INPUT);
                sc.next();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    stringFunction.append();
                    break;
                case 2:
                    stringFunction.count(str);
                    break;
                case 3:
                    System.out.println(Constants.PALINDROME_PROMPT);
                    String strs = sc.nextLine();
                    stringFunction.palindrome(strs);
                    break;
                case 4:
                    stringFunction.coutmaxWord(str);
                    break;
                case 5:
                    String oldSubstring, newSubstring;

                    System.out.println(Constants.ENTER_OLD_SUBSTRING);
                    oldSubstring = sc.nextLine();

                    System.out.println(Constants.ENTER_NEW_SUBSTRING);
                    newSubstring = sc.nextLine();

                    stringFunction.replace(str, oldSubstring, newSubstring);
                    break;
                case 6:
                    stringFunction.reverse(str);
                    break;
                case 7:
                    stringFunction.toSortAlphabets(str);
                    break;
                case 8:
                    System.out.println(Constants.ENTER_START_INDEX);
                    int startIndex = sc.nextInt();
                    System.out.println(Constants.ENTER_END_INDEX);
                    int endIndex = sc.nextInt();
                    stringFunction.splice(str, startIndex, endIndex);
                    break;
                case 9:
                    stringFunction.split(str);
                    break;
                case 10:
                    System.out.println(Constants.ENTER_SHIFT_INDEX);
                    int shiftIndex = sc.nextInt();
                    String outputString = stringFunction.shiftCharacters(str, shiftIndex);
                    System.out.println(Constants.OUTPUT_STRING + outputString);
                    break;
                default:
                    System.out.println(Constants.INVALID_CHOICE);
                    break;
            }

            System.out.println(Constants.CONTINUE_PROMPT);
            String continueChoice = sc.nextLine().trim().toLowerCase();

            if (!continueChoice.equals("yes")) {
                continueProgram = false;
                System.out.println(Constants.EXITING_PROMPT);
            }
        }
        sc.close();
    }
}

