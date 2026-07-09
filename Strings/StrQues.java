import java.util.*;
public class StrQues {
    
    // // to find the string are equal or not 
    // public static void main(String []args){
    //     String str1="hello";
    //     String str2="hello2";
    //     System.out.println(Equals(str1,str2));
    // }
    // public static boolean Equals(String s1,String s2){
    //     if(s1==s2){
    //         return true;
    //     }
    //     if(s1.length()==s2.length()){
    //          return true;
    //     }
    //     for(int i=0;i<s1.length();i++){
    //         if(s1.charAt(i) != s2.charAt(i)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    //to find a palindrome number 
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//          String str=sc.next();
//          System.out.println(Palindrome(str));
//     }
//     public static boolean Palindrome(String str){
//     int i=0;
//     int j=str.length()-1;
//     while(i<j){
//    if(str.charAt(i)!=str.charAt(j)){
//             return false;
//         }
//         i++;
//         j--;
//     }
//     return true;
//         }

// compare two strings(to find which string is large )
    public static void main(String [] args){
        String s1="Kamal";
        String s2="Komal";
        System.out.println(s1.compareTo(s2));
    }
     public static int compareTo(String s1,String s2){
     if(s1 == s2){
        return 0;
     }
     for(int i=0;i<Math.min(s1.length(),s2.length());i++){
        if(s1.charAt(i) != s2.charAt(i)){
            return s1.charAt(i) - s2.charAt(i); //returns AsCII value
        }
     }
     return s1.length() - s2.length(); //if the ans comes -ve the string 2 is larger than string 1
     }
}



