//optimized soltuion 


//non optimized solution 
// public class FirstBadVersion278 {

//     public static void main(String [] args){
//         int n=5;
//        System.out.print(firstBadVersion(n));
//     }
//      public static int firstBadVersion(int n) {
//         int low=1;
//         int high=n;
//         int ans=0;
//         while(low<=high){
//             // int mid=(low+high)/2;
//             int mid=low+(high-low)/2;     //bcwz of the high contraints so that the value will not go out of range
//             if(isBadVersion(mid)==true){
//                 ans=mid;
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//             }
//         }
//         return ans;
//     }
//      private static boolean isBadVersion(int mid) {
//         int bad=4;
//       if (mid >= bad) {
//     return true;
// } else {
//     return false;
// }
//      }
// }



