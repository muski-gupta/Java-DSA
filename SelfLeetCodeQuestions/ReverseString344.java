public class ReverseString344 {
    public static void main(String [] args){
      String [] s={"h","e","l","l","o"};
      ReverseString(s);
    }
    public static void ReverseString(String [] s){
        int low=0;
        int n=s.length;
        int high=n-1;
     while(low<high){
        String temp=s[low];
        s[low]=s[high];
        s[high]=temp;
        low++;
        high--;
     }
     for(int i=0;i<n;i++){
        System.out.println(s[i]);
     }

    }
}
