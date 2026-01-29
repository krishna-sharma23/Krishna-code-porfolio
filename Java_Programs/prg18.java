import java.util.*;
class prg18 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuffer sb=new StringBuffer();
        Arrays.sort(strs);
        int n=strs.length;
        String s1=strs[0];
        String s2=strs[n-1];
        int f=0;
        int s=0;
        int a=s1.length();
        int b=s2.length();
        while(f<a && s<b)
        {
             if(s1.charAt(f)==s2.charAt(s))
             {
                sb.append(s1.charAt(f));
                f++;
                s++;
             }
             else
             break;
        }

     return sb.toString();   
    }
    public static String longestCommonPrefix2(String[] strs) {
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++){
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
    	String[] words = {"dog","racecar","car"};
    	System.out.println(longestCommonPrefix(words));
    }
}