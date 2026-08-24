class LenofLastWord58 {
    public static void main(String [] args){ 
         String s="Hello";
        int n=s.length();
        while(n>=0 && s.charAt(n-1) == ' '){
            n--;
        }
        int k=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                k=i+1;
                break;
            }
        }
        int len=n-k;
       System.out.println(len);
    } 
}
    
