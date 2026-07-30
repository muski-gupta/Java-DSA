// public class Add2Num {
    // public static void main (String [] args){
    //    int arr1[]={2,3,4,5};
    //    int arr2[]={6,3,8,9,1,7};
    //     AddNum(arr1,arr2);
         
    // }
    // public static void AddNum(int arr1[], int arr2[]){
    //   ArrayList <Integer> ll= new ArrayList <>();
    //   int i=arr1.length - 1;
    //   int j=arr2.length - 1;

    //   int carry=0;
    //   while(i>=0 && j>=0){
    //     int sum=arr1[i] + arr2[j] + carry;
    //     ll.add(sum%10);  //remainder
    //     carry=sum/10;    //quotient (carry)
    //     i--;
    //     j--;
    //   }

    //     while(i>=0 ){
    //     int sum=arr1[i] + carry;
    //     ll.add(sum%10);  //remainder
    //     carry=sum/10;    //quotient (carry)
    //     i--;
    //     }

    //     while(j>=0 ){
    //     int sum= arr2[j] + carry;
    //     ll.add(sum%10);  //remainder
    //     carry=sum/10;    //quotient (carry)
    //     j--;
    //     }

    //     if(carry>0){
    //         ll.add(carry);
    //     }


    //     for(int k=ll.size() - 1;k>=0;k--){
    //         System.out.print(ll.get(k) + " ");
    //     } 

    // }


//brute force approach = check all possible pairs 
import java.util.Scanner;
public class twosum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] ans = twoSum(nums, target);
        System.out.println("Indices are: " + ans[0] + " " + ans[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = i+1;
                    return result;
                }
            }
        }
        return result;
    }
}
