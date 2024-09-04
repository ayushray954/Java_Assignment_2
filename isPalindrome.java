import java.util.*;
public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        int j = s.length()-1;
        boolean flag = true;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                flag = false;
            }
            i++;
            j--;
        }
        if(flag==true) System.out.println("It is palindrome");
        else System.out.println("Not a palindrome");
    }
}
