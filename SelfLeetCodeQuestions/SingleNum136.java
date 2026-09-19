public class SingleNum136 {
    public static void main(String [] args){
        // int nums[]={2,2,1};
        int nums[]={4,1,2,1,2};
        //method 1 

        // int nums[]={1};
        // int n =1;

        // for(int i=0;i<nums.length;i++){
        //     int count =1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i==j){
        //             continue;
        //         }
        //         else if(nums[i]==nums[j]){
        //                 count=count+1;
        //         }
        //     }
        //     if(count==n){
        //         System.out.println(nums[i]);
        //     }
        // }

        //method 2 better approach 
        int ans=0;
        for(int i=0;i<nums.length;i++){
             ans =ans ^ nums[i];
        }
        System.out.println(ans);
    }
}


