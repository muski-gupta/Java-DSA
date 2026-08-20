import java.util.Arrays;

public class ValidAnagram242 {
    public static void main(String [] args){
    //    String s="anagram";
    //    String t="nagaram";
         String s="rat";
       String t="ar";
      System.out.println( validAna(s, t));
    }
        public static boolean validAna(String s,String t){
          if(s.length()!=t.length()){
            return false;
          }
          char[] arr = s.toCharArray();
          char[] arr1 = t.toCharArray();
          Arrays.sort(arr);
          Arrays.sort(arr1);
            for(int i=0;i<arr1.length;i++){
            if(arr[i]!=arr1[i]){
               return false;
            } 
          }
          return true;
          }
            }
        
    


