import java.util.*;

public class MaxLenOfSUbstr3090 {
    public static void main(String [] args){
        String s = "bcbbbcba";
        int k=2;
        CountLen(s,'c',k);
    }
    public static void CountLen(String s,char ch,int k){
        int ans=0;
        int si=0;
        int ei=0;
        int countA = 0;
       while(ei<s.length()) {
         if(s.charAt(ei)==ch){
            countA=countA+1;
         } 
         while(countA>k){
             if(s.charAt(si)==ch){
                countA=countA-1;
                si++;
             }
         } 
         ans=ans+(ei-si+1);
         ei++;  
        }
        System.out.println(countA);
    }
}