import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		/* Declare second integer, double, and String variables. */
        int input_i;
        double input_d;
        String input_s;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        input_i = scan.nextInt();
        input_d = scan.nextDouble();
        input_s = scan.nextLine(); 
        
        while(input_s.equals("")) {
            input_s = scan.nextLine(); 
        }
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + input_i);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + input_d);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + input_s);
        
        scan.close();
    }
}