package hackerrank.src;

import java.util.Scanner;

public class Anagrams{
    static boolean isAnagram(String a, String b) {
        boolean bo = false;

        char[] A = a.toLowerCase().toCharArray();
        char[] B = b.toLowerCase().toCharArray();

        int max = 0;

        if (A.length == B.length){
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B.length; j++) {
                    if (A[i] == B[j]){
                        max ++;
                        B[j] = '+';
                        break;
                    }
                }
            }
        }else{
            bo = false;
        }

        if (max == A.length) bo = true;

        return bo;    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
