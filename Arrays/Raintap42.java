

// import javax.swing.plaf.synth.SynthOptionPaneUI;
//optimized 
class Solution {
    public int trap(int[] height) {
    return  Raintap(height);
    }
public static int Raintap(int []arr){
    int n=arr.length;
    int[]left = new int[n];
    left[0]=arr[0];
    for(int i=1;i<n;i++){
    left[i]=Math.max(left[i-1],arr[i]);
    }
    int[] right=new int[n];
    right[n-1]=arr[n-1];
    for(int i=n-2;i>=0;i--){
        right[i]=Math.max(right[i+1],arr[i]);
    }

    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+Math.min(left[i],right[i])-arr[i];
    }
    return sum;
}
}

// non optimized
// public class Raintap42 {
//     public static void main(String[] args){
//         int []arr={2,3,1,8,2,4,5};  
//         System.out.println(Raintap(arr));
// }
// public static int Raintap(int []arr){
//     int n=arr.length;
//     int[]left = new int[n];
//     left[0]=arr[0];
//     for(int i=1;i<n;i++){
//     left[i]=Math.max(left[i-1],arr[i]);
//     }
//     int[] right=new int[n];
//     right[n-1]=arr[n-1];
//     for(int i=n-2;i>=0;i--){
//         right[i]=Math.max(right[i+1],arr[i]);
//     }

//     int sum=0;
//     for(int i=0;i<n;i++){
//         sum=sum+Math.min(left[i],right[i])-arr[i];
//     }
//     return sum;
// }
// }