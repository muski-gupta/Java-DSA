// import java.util.*;
// public class Array2D{
// //     // make user defined 2D Array
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         int [][] arr = new int[r][c];
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                arr[i][j]=sc.nextInt();
//             }
//         }
//         Display(arr,r,c);

//     }
//     //print 2D array
//     public static void Display(int [][] muski,int r,int c){
//         // int r=muski.length; //length of row 
//         // int c=muski[0].length;  //length of any of the column bcwz length of each col. will be same
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print(muski[i][j] + " ");
//             }
//             System.out.println();

//         }
//     }
// }



// print this output 15 9 13 17 18 14 10 6 2 3 7 11 15 19 20 16 12 8 
import java.util.*;
public class Array2D{
//     // make user defined 2D Array
    public static void main(String [] args){
int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};

    for(int col=0;col<arr[0].length;col++){
        if(col%2==0){
         for(int row=0;row<arr.length;row++){
            System.out.print(arr[row][col]+ " ");
        }
        } 
        else{ 
        for(int row=arr.length-1;row>=0;row--){
             System.out.print(arr[row][col] + " ");
        }  
    } 
}
}
}