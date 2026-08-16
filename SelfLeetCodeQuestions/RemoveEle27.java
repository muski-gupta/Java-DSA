import java.util.*;
public class RemoveEle27 {
    public static void main (String [] args){
      int [] nums={0,1,2,2,3,0,4,2};
      int val=2;
      remove(nums,val);
    }


public static void remove(int [] nums,int val){
    int i=0;
    int k=0;
    for(int j=0;j<nums.length;j++){
        if(nums[j]!=val){
            k=k+1;
            nums[i]=nums[j];
            i++;
        }
    }

    for(int m=0;m<nums.length;m++){
        System.out.println(nums[m]);
    }
}
}


