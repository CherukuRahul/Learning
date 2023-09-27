//https://leetcode.com/problems/decoded-string-at-index/?envType=daily-question&envId=2023-09-27
public class LeetCode0 {
    public static void main(String[] args) {
        String s  = "Leet2Code3";
        int k = 10;
        String ans = "";
        String anss = decodeAtIndex(s, k,ans);
        System.out.println(anss);
        String realans = "leetleetcodeleetleetcodeleetleetcode";
        System.out.println(realans.length());
        if(anss.equals(realans)){
            System.out.println("reakl");
        }
    }

    
    public static  String decodeAtIndex(String s, int k,String ans) {
    if(s.isEmpty()){
       
        return  Character.toString(ans.charAt(k-1));
    }
    char ch = s.charAt(0);
    if(Character.isDigit(ch)){
        String add = "";
        for(int i = 1 ; i< Character.getNumericValue(ch); i++){
            add += ans;
        }
        ans += add;
        s = s.substring(1);
    }else{
        ans += ch;
        s = s.substring(1);
    }
    return decodeAtIndex(s, k,ans);
    }

}
