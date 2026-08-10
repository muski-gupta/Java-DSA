public class ParanthesisPrint {
    public static void main(String[] args){
        int n=3;
        Paranthesis(n,0,0," ");

    }
       public static void Paranthesis(int n,int open,int close,String ans){
        if(open==n && close == n){
            System.out.print(ans + " ");
            return ;
        }
        if(open<n){
            Paranthesis(n,open+1,close, ans + "(");
        }
        if(close<open){
            Paranthesis(n,open,close+1,ans + ")");
        }
    }
}
