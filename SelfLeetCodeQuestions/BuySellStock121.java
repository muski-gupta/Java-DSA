public class BuySellStock121 {
    public static void main(String [] args){
        int arr[]={7,1,5,3,6,4};
        // int arr[]={7,6,4,3,1};
        BuySell(arr);
    }

     //error -TLE
       //  public static int  BuySell(int [] prices){
    //     int ans=0;

    //     for(int i=0;i<prices.length;i++){
    //         for(int j=i+1;j<prices.length;j++){
    //             if(prices[j]>prices[i]){
    //                 int result=prices[j]-prices[i];
    //                 ans=Math.max(ans,result);
    //                 result=ans;
    //             }
    //         }
    //     }
    //     return ans;
    // }
     

    //optimized
    public static void BuySell(int [] arr){
          int min=arr[0];
        int max = 0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
           int maxprofit=arr[i]-min;
            max=Math.max(maxprofit, max);          
        }
        System.out.println(max);
        }
    }

