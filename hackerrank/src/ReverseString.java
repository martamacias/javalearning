package hackerrank.src;
import java.util.*;

public class ReverseString{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder builder = new StringBuilder(A);
        if (A.equals(builder.reverse().toString())){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
