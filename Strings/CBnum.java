import java.util.*;

public class CBnum {
    // check the numbers are cb numbers or not and if yes print them
    // Deepak and Gautam are having a discussion on a new type of number that
    // they call Coding Blocks Number or CB Number. They use following criteria to
    // define a CB Number.
    // point 1 :0 and 1 are not a CB number.
    // point 2:2,3,5.7,11,13.17,19,23,29 are CB numbers.
    // point 3:Any number not divisible by the numbers in point 2( Given above) are
    // also CB numbers.

    // Deepak said he loved CB numbers.Hearing it, Gautam throws a challenge to him.
    // Gautam will give Deepak a string of digits.

    // Deepak's task is to find the number of CB numbers in the string.

    // CB number once detected should not be sub-string or super-string of any other
    // CB number.
    // Ex- In 4991, both 499 and 991 are CB numbers but you can choose either 499 or
    // 991, not both.

    // Further, the CB number formed can only be a sub-string of the string.
    // Ex - In 481, you can not take 41 as CB number because 41 is not a sub-string
    // of 481.

    public static void main(String [] args){
    String s="127";
    System.out.println(PrintString(s));

    }
    public static int PrintString(String s){
    int count =0;
    boolean[] visited =new boolean [s.length()] ;
    for(int len=1;len<=s.length();len++){
    for(int j=len;j<=s.length();j++){
    int i=j-len;
    String s1=s.substring(i,j);
    //Integer.parseInt(s1); //num string ko integer m convert krna h to
    long n=Long.parseLong(s1);
    if(IsCbNum(n)==true && Isvalid(visited,i,j)==true){
    count ++;
    for(int k=i;k<j;k++){
    visited[k]=true;
    }
    }
    }
    }
  

    return count ;
    }

    public static boolean Isvalid(boolean []visited,int i,int j){
    for(;i<j;i++){
    if(visited[i]==true){
    return false;
    }
    }
    return true;
    }

    public static boolean IsCbNum(long num){
    if(num==0 ||num==1){
    return false;
    }
    int arr[]={2,3,5,7,11,13,17,19,23,29 };
    for(int i=0;i<arr.length;i++){
    if(num==arr[i]){
    return true;
    }
    }
    for(int i=0;i<arr.length;i++){
    if(num % arr[i] == 0 ){
    return false;
    }
    }
    return true;
    }
    }

  