import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        int f = factorial(n);
        System.out.print(f);
    }
    
    public static int factorial(int n) {
        if (n <= 1) return 1;
        else return n * factorial(n-1);
    }
}