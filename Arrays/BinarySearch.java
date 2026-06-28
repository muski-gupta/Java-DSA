public class BinarySearch {

    //find the index of a number
//     public static void main(String [] args){
//         int [] arr={2,3,4,5,6,7,8,9,11,13,15,18};
//         int item =11;
//        int result= Search(arr,item);
//        System.out.println(result);
//     }


//     public static int  Search(int [] arr ,int item){
//        int low=0;
//         int high=arr.length-1;
//      while(low<=high){
//         int mid=(low+high)/2;
//         if(arr[mid]>item){
//             high=mid-1;
//         }
//         else if(arr[mid]<item){
//             low=mid+1;
//         }
//         else{
//             return mid;
//         }
//       }
//       return -1;
//     }
// }

//satisfy this condition [x^3 <= n]
// public static void main(String [] args){
//       int n=87;
//       int k=3;
//       System.out.println(Search(n,k));
//     }
//     public static int  Search(int n,int k){
//        int low=1;
//         int high=n;
//         int ans=0;
//      while(low<=high){
//         int mid=(low + high)/2;
//         if(Math.pow(mid,k)<=n){
//            ans =mid;
//         low=mid+1;
//        }
//        else {
//         high =mid-1;
//        }
//        }
//          return ans;
// }
//     }