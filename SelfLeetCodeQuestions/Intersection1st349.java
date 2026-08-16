import java.util.*;

public class Intersection1st349 {
      public static void main(String [] args){
        int [] nums1={1,2,2,1};
        int [] nums2={2,2};
        System.out.println(intersection(nums1, nums2));

      }
        public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans =new ArrayList<> ();
        // List<String> ans = new ArrayList<> ();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans.add(nums1[i]);
                }
            }
        }
        return ans;
    }
}
