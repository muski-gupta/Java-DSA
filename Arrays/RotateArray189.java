//optimized code
class Solution {
    public void rotate(int[] nums, int k) {
        Rotate(nums, k);
    }

    public static void Rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        Reverse(nums, 0, n - k - 1);
        Reverse(nums, n - k, n - 1);
        Reverse(nums, 0, n - 1);
    }

public static void Reverse(int[] nums,int i,int j) {
    while(i<j){
int temp=nums[i];
nums[i]=nums[j];
nums[j]=temp;
i++;
j--;
    }
}
}




//non optimized code 

// public class RotateArray189 {

//     public void rotate(int[] nums, int k) {
//         int n = nums.length;

//         k = k % n;

//         reverse(nums, 0, n - k - 1);
//         reverse(nums, n - k, n - 1);
//         reverse(nums, 0, n - 1);
//     }

//     public static void reverse(int[] nums, int i, int j) {
//         while (i < j) {
//             int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
//             i++;
//             j--;
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {1,2,3,4,5,6,7};

//         RotateArray189 obj = new RotateArray189();
//         obj.rotate(nums, 3);

//         for (int x : nums) {
//             System.out.print(x + " ");
//         }
//     }
// }


