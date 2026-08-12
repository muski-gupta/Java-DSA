import java.util.*;
public class RemoveDuplicates26 {
    public static void main(String [] args){
     int [] nums={1,1,2,2,3,4};
     Duplicates(nums);
    }
    // public static void Duplicates(int [] nums){

    // by using array 

    //  int i=0;
    //  for(int j=1;j<nums.length;j++){
    //     if(nums[j]!=nums[i]){
    //         i++;
    //         nums[i]=nums[j];
    //     }
    //  }
    //    System.out.println(i+1);     
    // }
    // }

 

    //by using arraylist
// public static ArrayList<Integer> Duplicates(int []nums){
//     ArrayList<Integer> list =new ArrayList <>();
//     list.add(nums[0]);
//     for(int i=1;i<nums.length;i++){
//         if(nums[i] != nums[i-1]){
//             list.add(nums[i]);

//         }
//     }
//     System.out.println(list);
//     System.out.println(list.size());
// }
// }
