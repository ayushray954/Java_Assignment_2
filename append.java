import java.util.*;
public class append {
    static String s = "";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            while(true) {
                String inp = sc.nextLine();
                s = s + inp+ " ";
                System.out.println(s);
            }

        }
    }
