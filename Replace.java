import java.util.Scanner;;

public class Replace {

    public static void replace(String string, char oldCharacter, char newCharacter) {
        String output = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == oldCharacter) {
                output += newCharacter;
                if (string.charAt(i) == ' ') {
                    output += ' ';
                }
            } else {
                output += string.charAt(i);
            }
        }
        System.out.println(output);

    }

    public static void main(String[] args) {
        String str;
        char oldCharacter, newCharacter;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the string:: ");
        str = sc.nextLine();

        System.out.println("Enter the old character:: ");
        oldCharacter = sc.next().charAt(0);
        sc.nextLine();

        System.out.println("Enter the new character:: ");
        newCharacter = sc.next().charAt(0);


        replace(str, oldCharacter, newCharacter);

        System.out.println("Exiting the program...");
    }
}
