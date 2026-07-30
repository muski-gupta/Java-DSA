public class RemoveDuplicates26 {
    public static void main(String [] args){
     int [] arr={0,0,1,1,1,2,2,3,3,4};
     Duplicates(arr);
    }
    public static void Duplicates(int [] arr){
        int n=arr.length;
        int [] Expected=new int[n];
        int m=Expected.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i]!=Expected[j]{
                Expected[j]=arr[i];
            })
            }
    }
      for(int i=0;i<n;i++){
       System.out.println(Expected[i]);
    }
}
}
