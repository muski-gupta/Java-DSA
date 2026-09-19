import java.util.*;
public class Squrofarr977 {
    public static void main(String [] args){
        //method 1

        int nums[]={-4,-1,0,3,10};
      
    //      int square=1;
    //     for(int i=0;i<nums.length;i++){
    //           square=nums[i]*nums[i];
    //           nums[i]=square;
    //     }
    //    Arrays.sort(nums);
    //    for(int i=0;i<nums.length;i++){
    //     System.out.print(nums[i] + " ");
    //    }
       //method 2 v
         int newarr[]=new int[nums.length];
       int low=0;
       int high=nums.length-1;
       for(int i=nums.length-1;i>=0;i--){
         if(Math.abs(nums[high])> Math.abs(nums[low])){
        newarr[i]=nums[high]*nums[high];
        high--;
       }
       else{
        newarr[i]=nums[low]*nums[low];
        low++;
       }
       }
    
       for(int i=0;i<=newarr.length-1;i++){
        System.out.print(newarr[i] + " ");
       }
    }
}
