import java.util.ArrayList;

public class IntOfTwoArr350 {
    public static void main(String [] args){
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        //   int nums[]={4,9,5};
        // int nums1[]={9,4,9,8,4};
        // int newarr
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums1.length;j++){
        //         if(nums[i]==nums1[j]){
        //             System.out.print(nums[i] + " ");
        //             break;
        //         }
        //     }
        // }



 
        // System.out.println(length);
        // int newarr[]=new int [length];
        // ArrayList<Integer>arr=new ArrayList<>();
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]){
        //           arr.add(nums2[i]);
        //            break;
        //         }
        //     }
        // }
        // for(int i=0;i<=arr.size();i++){
        //     System.out.println(arr.get(i));
        // }


        ArrayList<Integer> arr = new ArrayList<>();
for(int i = 0; i < nums1.length; i++){
    for(int j = 0; j < nums2.length; j++){
        if(nums1[i] == nums2[j]){
            arr.add(nums2[j]);
            break ; }}}
for(int i = 0; i < arr.size(); i++){
    System.out.println(arr.get(i));
}
 }
}
