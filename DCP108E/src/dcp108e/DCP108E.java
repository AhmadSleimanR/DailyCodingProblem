package dcp108e;
import java.util.*;
/**
 *
 * @author lycan
 */
/**
 * Problem from Google:
Given two strings A and B, return whether or not A can be shifted some number of times to get B.

For example, if A is abcde and B is cdeab, return true. If A is abc and B is acb, return false.**/
public class DCP108E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a, b;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the values for string a: ");
        a = kb.nextLine();
        System.out.print("Enter the values for string b: ");
        b = kb.nextLine();
        System.out.println(shiftStrings(a,b));
    }
    
    static boolean shiftStrings(String a, String b){
        if(a.length() != b.length())
            return false;
        for(int i = 0;i<a.length();++i){
            if(a.compareToIgnoreCase(b) == 0)
                return true;
            a = a.substring(1) + a.charAt(0);
            System.out.println(a);
        }
        return false;
   }
}