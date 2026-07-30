import java.util.Scanner;
public class Kartikbhaiya {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s =sc.next();
        int flip_a= MaxlenofString(s,'a',k);
        int flip_b= MaxlenofString(s,'b',k);
        System.out.println(Math.max(flip_a,flip_b));


    }
    public static int MaxlenofString(String str ,char ch,int k){
        int si=0;
        int ei=0;
        int ans=0;
        int flip=0;
     while(ei<str.length()){
        //growing 
        if(str.charAt(ei)==ch){
            flip++;
        }
            //shrinking 
            if(flip>k && si<=ei){
                if(str.charAt(si)==ch){
                    flip--;
                }
                si++;
            }

        //ans calculation
        ans =Math.max(ans,ei-si+1);
        ei++;
     }  
     return ans;
    }
}
