package hackerrank.src;

import java.util.*;
import java.util.stream.Collectors;

public class StringTokens{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        String del = "[ .,?!'_@]+";
        String[] list = s.split(del);
        list = Arrays.asList(list).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
        System.out.println(list.length);
        
        for (String x : list) {
            System.out.println(x);
        }
    }
}