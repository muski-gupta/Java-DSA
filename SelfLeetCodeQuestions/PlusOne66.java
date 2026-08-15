// import java.util.*;
// public class PlusOne66 {
//     public static void main(String [] args){
//         int arr[]={9,8,7,6,5,4,3,2,1,0};
//         PlusOne(arr);
//     }
//     public static void PlusOne(int [] arr){
//        long[] newArr = new long[arr.length];
//        //making array into a number
//         long n=0;
//         for(int i=0;i<arr.length;i++){
//            n=n*10+arr[i];
//            System.out.println(n);
//         }
//         n=n+1;  //adding one
//     // //adding number into new array 
//         for(int i=arr.length-1;i>=0;i--){
//             long d=n%10;
//             newArr[i]=d;
//             n=n/10;
//     }
//     System.out.println(Arrays.toString(newArr)); 
// }
// }

import java.util.*;
public class PlusOne66{
    public static void main(String [] args){
        int arr [] = {9,9,9};
        AddOne(arr);
    }
    public static int AddOne(int [] arr){
        ArrayList<Integer> ll=new ArrayList<>();
        int m = arr.length-1;
        arr[m]+=1;
        int sum=0;
        int carry=0;
        for(int i=m;i>=0;i--){
            sum=arr[i]+carry;
            if(sum>9){
            int rem=sum%10;
            ll.add(rem);
            carry=sum/10;
        }
        else{
            ll.add(sum);
            carry=0;
        }
        }
        if(carry!=0){
            ll.add(carry);
        }
        Collections.reverse(ll);
        System.out.println(ll);
        
    //    int []result=new int[ll.size()];
    //    for(int i=0;i<result.length;i++){
    //     result[i]=ll.get(i);
    //    }
    //    return result;
    return 0;
    }
}




