public class MaxSubArray53 {
    public static void main(String [] args){
        // int [] nums={-2,1,-3,4};
        // int [] nums={5,4,-1,7,8};
        // int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        int [] nums={-2};
   
        MaxSub(nums);
    }
    public static void MaxSub(int [] nums){
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
               sum=sum+nums[i];
               ans=Math.max(sum,ans);
                 if(sum<0){
                sum=0;
                 }
               
}
 System.out.print(ans + " ");
}
}
