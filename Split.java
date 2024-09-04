import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = new String[s.length()];
        String output = "";
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!output.isEmpty()) {
                    arr[index] = output;
                    index++;
                }
                output = "";
            } else {
                output += s.charAt(i);
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
}
