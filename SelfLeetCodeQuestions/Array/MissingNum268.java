public class MissingNum268{
    public static void main(String[] args) {
        // int [] nums={3,0,1};
        // int [] nums={0,1};

        //this contain two loops so time complexity is 0(n^2) times but when we use 
        //mathematical formula its time complexity will be 0(n) times
    //     int [] nums={9,6,4,2,3,5,7,0,1};
    //     for(int i=0;i<=nums.length;i++){
    //         boolean found = false;
    //         for(int j=0;j<nums.length;j++){
    //         if(i == nums[j]){
    //             found=true;
    //             break;
    //         }
    //         }
    //         if(!found){
    //             System.out.println(i);
    //         }
    // }


     //more optimised - use mathematical formula for sum of n numbers  == [ n(n+1)/2 ]
    int [] nums={9,6,4,2,3,5,7,0,1};
      int n=nums.length;
      int totalSum=n * (n+1) / 2;
      int actualSum=0;
      for(int i=0;i<nums.length;i++){
        actualSum+=nums[i];
      }
      int ans=totalSum - actualSum;
      System.out.println(ans);
}
}
