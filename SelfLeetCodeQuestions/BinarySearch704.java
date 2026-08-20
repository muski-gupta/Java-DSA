import java.util.*;

public class BinarySearch704 {
    public static void main(String [] args){
    //   int nums[]={-1,0,3,5,9,12};
      int nums[]={-1,0,3,5,9,12};
      int target=2;
      BinarySearch(nums, target);
    }
    public static void BinarySearch(int []nums,int target){
        int low=0;
        int high=nums.length-1;
      for(int i=0;i<nums.length;i++){
        int mid=low+high/2;
        if(nums[ mid]==target){
            System.out.println(mid);
            break;
        }
        else if(nums[mid]>target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }


    }
}
