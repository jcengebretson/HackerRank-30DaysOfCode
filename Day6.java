import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            String s = scan.nextLine(); 
            while(s.equals("")) {
                s = scan.nextLine();
            }
            
            String even = "";
            String odd = "";
            for (int j = 0; j < s.length(); j++) {
                if(j % 2 == 0) even += s.charAt(j);
                else odd += s.charAt(j);
            }
            System.out.println(even + " " + odd);
        }
        scan.close();
    }
}