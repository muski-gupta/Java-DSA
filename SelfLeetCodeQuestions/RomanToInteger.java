public class RomanToInteger {
    public static void main(String [] args){
        String s="LVIII";
        // String s="MCMXCIV";
      String [] a=s.split("");
        //  int arr[]={1,5,10,50,100,500,1000};
        int  arr[]={1,5,10,50,100,500,1000};
        String arr1[]={"I","V","X","L","C","D","M"};
        int sum=0;
        for(int i=0;i<a.length;i++){
            int current=0;
            int next=0;
                //find the current val 
                for(int j=0;j<arr1.length;j++){
                      if(a[i].equals(arr1[j])){
                        current=arr[j];
                        break;
                }
            }
            //find the next value 
            if(i+1 < a.length){
              for(int j=0;j<arr1.length;j++){
                if(a[i+1].equals(arr1[j])){
                        next=arr[j];
                        break;
                }
            }
            }
            if(current<next){
               sum=sum-current;
            }
            else{
                sum=sum+current;
            }
        } 
        System.out.println(sum);       
                   }
                }
  
