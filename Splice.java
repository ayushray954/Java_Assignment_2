import java.util.*;
public class Splice {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int a = sc.nextInt();
       int b = sc.nextInt();
       String out="";
       for(int i=0;i<s.length();i++){
           if(a<0 || b>s.length()){
               System.out.println("invalid index");
               break;
           }
           if(i>=a && i<=b-1+a ) continue;
           else out=out+s.charAt(i);
       }
        System.out.println(out);
    }
}
