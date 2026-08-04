public class SubSeq {
    public static void main(String [] args){
        String ques="abc";
        PrintSubSeq(ques," ");
    }

    public static void PrintSubSeq(String ques, String ans) {
        if(ques.length()==0){
            System.out.print(ans);
            return ;
        }
        char ch=ques.charAt(0);
        PrintSubSeq(ques.substring(1), ans);
        PrintSubSeq(ques.substring(1), ans+ch);
    }
}
