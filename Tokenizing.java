
import java.util.Arrays;
import java.util.StringTokenizer;

public class Tokenizing {
    public static void main(String[] args) {
       String input  = "Hello World";
       int output = lengthOfLastWord(input);
       System.out.println(output);
    }

    public static int lengthOfLastWord(String s) {
        StringTokenizer z = new StringTokenizer(s, " ");
        int count = z.countTokens();
        String[] ans = new String[count];
        int i = 0 ;
          while(z.hasMoreTokens()){
              ans[i] = z.nextToken();
              i++;
          }
          String rw = ans[i-1];
          return rw.length();
        } 
}
// https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&envId=top-interview-150
