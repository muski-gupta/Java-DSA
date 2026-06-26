//optimized code 
class Solution {
    public int maxSubArray(int[] nums) {
     return Maxsum(nums);
    }
    public int Maxsum(int[] nums){
     int ans=Integer.MIN_VALUE;
      int sum=0;
     for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
       
     }
     return ans;
    }
}








//non optimized code 
// public class MaxSubarray53 {
//     public static void main(String [] args){
//      int nums[]={-2,1,-3,4,-1,2,1,-5,4};
//      System.out.println(MaxSum(nums));
//      }
    
//     public  static int MaxSum(int [] nums){
//         int ans=Integer.MIN_VALUE;
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//                 sum=sum+nums[i];
//                 ans=Math.max(ans,sum);
//                 if (sum<0){
//                    sum=0;
//                 }
               
//             }
//     return ans;
//     }
// }
