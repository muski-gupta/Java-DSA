public class factorial {

  //factorial head
    // public static void main(String [] args){
    //     int n=4;
    //     System.out.println(fact(n));
    // }

    // private static int  fact(int n) {
    //   if(n==0){
    //     return 1;
    //   }
    //   int fn=fact(n-1);
    //   return n*fn;
    // }


    //factorial tail 
    // public static void main (String [] args){
    //   int n=5;
    //   System.out.println(fact(n,1));
    // }
    // public static int fact(int n,int ans){
    //   if(n==0){
    //     return ans;
    //   }
    //   return fact(n-1,ans*n);
    // }



    public static void main(String [] args){
      int n=5;
      int arr[]={3,2,5,7,5,6,5,15,5};
      System.out.println(find(arr,n));
    }
    public static int find(int arr[],int n){
      for(int i=0;i<arr.length;i++){
        if(arr[i]==5){
        return i;
        }        
      }
      return -1;
    }
    }
