public class MissingNum268 {
    public static void main(String [] args){
        int nums[]={3,0,1};
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
          int newarr[]=new int[nums.length+2];
          int n=0;
          for(int i=0;i<newarr.length;i++){
            newarr[i]=n;
            n=n+1;
            if(n>max){
                break;
            }
          }
            for(int i=0;i<newarr.length;i++){
           System.out.println(newarr[i]);
          }

        }
    }

