// import java.util.*;
// public class Search2Dmatrix74 {
//     public static void main(String[] args){
//     int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//     int target=3;
//     System.out.println(Search(arr,target));
//     }

//     public static boolean Search(int [][] arr,int target){
//       for(int i=0;i<arr.length;i++){
//         for(int j=0;j<arr[0].length;j++){
//             if(arr[i][j]==target){
//                 return true;
//             }
//         }
//       }
//       return false;
//     }
// }


public class Search2Dmatrix74 {
    public static void main(String[] args){
    int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target=15;
    System.out.println(Search(arr,target));
    }

    public static boolean Search(int [][] arr,int target){
        int r=0;
        int c=arr[0].length-1;
     while(r<arr.length && c >=0){
      if(arr[r][c]==target)
      {
        return true;
      }
      else if (arr[r][c]>target){
        c--;
      }
      else {
        r++;
      }
     }
       return false;
    }
}


