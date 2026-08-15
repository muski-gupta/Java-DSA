import java.util.*;
public class MergeSortedArr88 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2,3, 0, 0,0 };
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int currentSize = m;
        for(int j = 0; j < n; j++) {
            int target = nums2[j];
            // Find where target should be inserted
            int k = 0;
            while(k < currentSize && nums1[k] <= target) {
                k++;
            }
            // Shift elements to the right
            for(int i = currentSize; i > k; i--) {
                nums1[i] = nums1[i - 1];
            }
            // Insert target
            nums1[k] = target;
            currentSize++;
        }
    }
}


