import java.util.*;
import java.io.*;

class Day8 {

    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        
        Map<String, Integer> phonebook = new HashMap<String, Integer>();
               
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            String result = "";
            if(phonebook.containsKey(s)) {
                result = s + "=" + phonebook.get(s);
            } else {
                result = "Not found";
            }
            System.out.println(result);
        }
        in.close();
    }
}