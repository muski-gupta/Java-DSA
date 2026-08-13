// public class IntegerToRoman12 {
//     public static void main(String [] args){
//         int a=1994;
//         int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
//         String arr2[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//         for (int i=0;i<arr.length;i++){
//            int count=a/arr[i];
//            a=a%arr[i];
//            if(count==0){

//            }
//             for(int k=0;k<count;k++){
//                 System.out.print(arr2[i]);
//                }
//         }
// }
// }
class Solution {
    public String intToRoman(int num) {
        int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String arr2[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
      return  InttoRoman(num,arr,arr2);
    }
        public static String InttoRoman(int num,int arr[],String arr2[]){
        String result="";
        for (int i=0;i<arr.length;i++){
           int count=num/arr[i];
           num=num%arr[i];
            for(int k=0;k<count;k++){
              result=result+arr2[i];
               }
        }
        return result;
        }
}
    

