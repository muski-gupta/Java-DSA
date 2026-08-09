public class CoinToss {

    //print the number of possibilties while tossing a coin and counting the number also 
    // public static void main(String [] args){
    //     int n=3;
    //     System.out.print(TossCoin(n," "));
    // }
    // public static int TossCoin(int n,String ans) {
    //     if(n==0){
    //         System.out.print(ans + " ");
    //         return 1;
    //     }
    //    int a=TossCoin(n-1, ans+ "H");
    //    int b=TossCoin(n-1, ans+ "T");
    //    return a+b;
    // }

    //remove the possibilities where there is consecutive two heads 
     public static void main(String [] args){
        int n=3;
        TossCoin(n," ");
    }
    public static void TossCoin(int n,String ans) {
        if(n==0){
            System.out.print(ans + " ");
            return ;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1) != 'H'){
         TossCoin(n-1, ans+ "H");
        }
       TossCoin(n-1, ans+ "T");
    }
}


