import java.util.*;
public class ArrayPartition {
    public static void main(String[] args) {
    int [] nums = {6,2,6,5,1,2};
    //  int ans=0;
    //    for(int i=0;i<nums.length-1;i++){
    //     for(int j=0;j<nums.length-1;j++){
    //        if(i==j){
    //           continue;
    //        }
    //        int sum=0;
    //        sum=Math.min(nums[i],nums[j]) + Math.min(nums[j+1],nums[j+2]);
    //        System.out.println(sum);
    //        ans=Math.max(sum,ans);
    //     }
    //    }
    //    System.out.println(ans);
    Arrays.sort(nums);
    int ans=0;
    for(int i=0;i<=nums.length-1;i++){
        if(i<nums.length-1){
           ans=Math.min(nums[i],nums[i+1]) + ans;
           i++;
        }
    }
    System.out.println(ans);
    }
}

