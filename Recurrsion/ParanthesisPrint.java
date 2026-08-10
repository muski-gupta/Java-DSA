import java.util.*;
public class ParanthesisPrint {
    public static void main(String[] args){
        int n=3;
        List<String> ll=new ArrayList<> ();
        Paranthesis(n,0,0," ",ll);
        System.out.print(ll);


    }
       public static void Paranthesis(int n,int open,int close,String ans,List<String> ll){
        if(open==n && close == n){
            // System.out.print(ans + " ");
            ll.add(ans);
            return ;
        }
        if(open<n){
            Paranthesis(n,open+1,close, ans + "(",ll);
        }
        if(close<open){
            Paranthesis(n,open,close+1,ans + ")",ll);
        }
    }
}
