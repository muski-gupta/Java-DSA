import java.util.Arrays;

public class ContainDUplicates217 {
    public static void main(String [] args){
    //    int [] arr={1,2,3,1};
    //    int [] arr={1,2,3,4};
       int [] arr={2,14,18,22,22};
     CheckDuplicates(arr);
    }
    // public static boolean CheckDuplicates(int [] arr){
    //     int count=0;
    //    for(int i=0;i<arr.length;i++){
    //     for(int j=1;j<arr.length;j++){
    //         if(arr[j]==arr[i]){
    //             count=count+1;
    //         }
    //     }
    //     System.out.println(count);
    //    }
    //    if(count>0){
    //     return true;
    //    }
    //    return false;
    // }
//     public static void CheckDuplicates(int [] arr){
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[i]==arr[j]){
//                count=count+1;
//             }
//         }
//         System.out.println(count);
//         if(count>0){
//             System.out.println("true");
//         }
//     }
//     }
// }

    public static void CheckDuplicates(int [] arr){
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
               count=count+1;
            }
        }
        if(count>0){
            System.out.println("true");
        }
    }
    }

