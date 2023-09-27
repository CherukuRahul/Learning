import java.util.StringTokenizer;
//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1?page=1&category[]=Strings&sortBy=submissions
public class ReverseString {
    public static void main(String[] args) {
        String input = "I.like.this.program.very.much";
        String output = reverseWords(input);
        System.out.println(output);
    }

    public static String reverseWords(String S)
    {
      StringTokenizer one = new StringTokenizer(S,".",true);
      String[] straight = new String[one.countTokens()];
      int i = 0;
      while(one.hasMoreTokens()){
          straight[i] = one.nextToken();
          i++;
      }
      String result = "";
      String[] reverse = new String[i-1];
      int k = 0;
      for(int j = i-1; j>=0;j--){
         // reverse[k] = straight[j];
         result += straight[j];
          k++;
      }
      //String result = new String(reverse);
      return result;
    }
}