import java.sql.Array;
import java.util.Arrays;

public class Median4 {
    public static void main(String [] args){
        int nums1 [] = {1,3};
        int nums2 [] = {2,4};
        int n=nums1.length;
        int m=nums2.length;
        int append[]=new int[n+m];
        int k=append.length-1;
        for(int i=0;i<n+m;i++){
          if(i<n){
            append[i]=append[i]+nums1[i];
          }
          else{
            append[i]=append[i]+nums2[i-n];
          }
        }
        Arrays.sort(append);
        int low=0;
        int high=append.length-1;
        int mid=low+high/2;
        if(append.length % 2 != 0){
            double d = append[mid];
            System.out.println(d);
        }
        else{
           double d = (append[mid] + append[mid+1])/2.0;
           System.out.println(d);
        }
       
    }
}
