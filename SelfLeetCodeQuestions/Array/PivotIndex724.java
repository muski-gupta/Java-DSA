public class PivotIndex724 {
    // public static void main(String [] args){
    //     int pivotIndex=0;
    //     int leftSum=0;
    //     int RightSum=0;
    // int [] nums = {1,7,3,6,5,6};
    // for(int i=0;i<nums.length;i++){
    //     int index=i;
    //     for(int j=0;j<index;j++){
    //        leftSum+=nums[j];
    //        System.out.println(leftSum);
    //     }
    //     for(int j=index+1;j<nums.length;j++){
    //         RightSum+=nums[j];
    //     }


    //     if(leftSum == RightSum){
    //         pivotIndex=index;
    //     }
    // }
    // System.out.println(pivotIndex);
    // }
     //more optimized solution 
     public static void main(String [] args){
      int [] nums = {1,7,3,6,5,6};
      int totalSum=0;
      int leftSum=0;

    
    for(int i=0;i<nums.length;i++){
       totalSum+= nums[i];
    }
    for(int i=0;i<nums.length;i++){
        int rightSum=totalSum - leftSum - nums[i];
        System.out.println(leftSum);
        System.out.println(rightSum);
        if(leftSum==rightSum){
          System.out.println(i);
        }
         leftSum+=nums[i];
    }
    System.out.println(-1);
    }
}
