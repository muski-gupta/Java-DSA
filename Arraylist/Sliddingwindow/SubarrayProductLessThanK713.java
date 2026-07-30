// import java.util.*;
// public class SubarrayProductLessThanK713 {
//     public static void main(String [] args) {
//        int nums[]= {10,5,2,6};
//        int k=100;
//        System.out.println(maxsubarrays(nums,k));
//     }
//     public static int  maxsubarrays(int[] nums , int k){
//     int si=0;
//         int ei=0;
//         int p=1;
//         int ans=0;
//         while(ei<nums.length){
//             p=p*nums[ei];
//             while(p>=k && si<=ei){
//                 p=p/nums[si];
//                 si++;
//             }
//           ans=ans+(ei-si+1);
//           ei++;
//         }
//         return ans;
//     }
// }


import java.util.*;
public class SubarrayProductLessThanK713 {
    public static void main(String [] args) {
       int nums[]= {10,5,2,6};
       int k=100;
        maxsubarrays(nums,k);
    }
    public static void  maxsubarrays(int[] nums , int k){
    int si=0;
        int ei=0;
        int p=1;
        int ans=0;
        while(ei<nums.length){
            p=p*nums[ei];
            while(p>=k && si<=ei){
                p=p/nums[si];
                si++;
            }
        for (int i = ei; i >= si; i--) {
            for (int j = i; j <= ei; j++) {
                System.out.print(nums[j] + " ");
            }
            System.out.println();
        }

        ei++;
        }
       
    }
}
