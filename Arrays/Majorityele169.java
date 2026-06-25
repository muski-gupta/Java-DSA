// //optimized code
// class Solution {
//     public int majorityElement(int[] nums) {
//          return Majorityarray(nums);
//     }
//         public static int Majorityarray(int[] nums){
//             int n=nums.length;
//             for(int i=0;i<n;i++){
//                 int count=0;
//                 for(int j=0;j<n;j++){
//                     if(nums[i]==nums[j]){
//                         count++;
//                     }
//                 }
//                 if(count>n/2){
//                     return nums[i];
//                 }
//             }
//             return -1;    //we used return -1 here only so that we can check all the elements and this is necessary to be used here because if there is no majority element -1 means (not found or error)
//         }
//     }

//non optimized code

import java.util.*;
public class Majorityele169 {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<arr.length;i++){
             int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                System.out.println(arr[i]);
                break;
            } 

        }
         
    }
}
