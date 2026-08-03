public class Firstindex {

//finding index from start 

    // public static void main(String [] args){
    //     int item=12;
    //     int arr[]={3,2,5,7,5,6,5,15,5};
    //     System.out.println(findindex(arr,0,item));

    // }
    // public static int findindex(int arr[],int i,int item){
    //        if(i==arr.length){          //negative base case
    //         return -1;
    //        }
    //        if(arr[i]==item){          //base case
    //         return i;
    //        }
    //        return findindex(arr, i+1, item);
    // }

//find index from the end 
       public static void main(String [] args){
        int item=13;
        int arr[]={3,2,5,7,5,6,5,15,13};
        System.out.println(findindex(arr,arr.length-1,item));

    }
    public static int findindex(int arr[],int i,int item){
        if(i<0){
            return -1;
        }
           if(arr[i]==item){          //base case
            return i;
           }
           return findindex(arr, i-1, item);
    }
}


  

