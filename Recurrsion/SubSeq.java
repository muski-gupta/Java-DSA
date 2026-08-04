public class SubSeq {
//how to print the sub sequences     
    // public static void main(String [] args){
    //     String ques="abc";
    //     PrintSubSeq(ques," ");
    // }

    // public static void PrintSubSeq(String ques, String ans) {
    //     if(ques.length()==0){
    //         System.out.print(ans);
    //         return ;
    //     }
    //     char ch=ques.charAt(0);
    //     PrintSubSeq(ques.substring(1), ans);
    //     PrintSubSeq(ques.substring(1), ans+ch);
    // }


//how to count the no. of possible sub sequences 

//method 1
    // public static void main(String [] args){
    //     String ques="abc";
    //     PrintSubSeq(ques," ");
    //     System.out.println(count);
    // }
    //  static int count = 0;
    // public static void PrintSubSeq(String ques, String ans) {
    //     if(ques.length()==0){
    //         System.out.print(ans + " ");
    //         count++;
    //         return ;
    //     }
    //     char ch=ques.charAt(0);
    //     PrintSubSeq(ques.substring(1), ans);
    //     PrintSubSeq(ques.substring(1), ans+ch);
    // }


//method 2 
public static void main(String [] args){
    String ques="abc";
    System.out.print(PrintSubSeq(ques," "));
}
public static int PrintSubSeq(String ques,String ans) {
    if(ques.length()==0){
        // System.out.print(ans + " ");
        return 1;
    }
    char ch=ques.charAt(0);
   int a1= PrintSubSeq(ques.substring(1), ans);
   int b1= PrintSubSeq(ques.substring(1), ans+ch);
   return a1+b1;
}
}
