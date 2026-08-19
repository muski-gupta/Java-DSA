public class RemoveZero283 {
    public static void main(String [] args){
       int [] nums={0,1,0,3,12};
       moveZero(nums);
    }
    public static void moveZero(int [] nums){
      int val=0;
      int i=0;
      int k=0;
      for(int j=0;j<nums.length;j++){
        if(nums[j]!=val){
            nums[i]=nums[j];
            i++;
        }
        else{
            k++;
        }
      }
    //   int m=nums.length-1;
    //   while(k>0){
    //     nums[m]=0;
    //     m=m-1;
    //    k-=1;
    //   }
    //   for(int l=0;l<nums.length;l++){
    //     System.out.print (nums[l] + " ");
    //   }
    for(int m=nums.length-1;m>=0;m--){
        if(k>0){
            nums[m]=0;
            k-=1;
        }
    }
       for(int l=0;l<nums.length;l++){
        System.out.print (nums[l] + " ");
      }

    }
}
