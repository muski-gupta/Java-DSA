public class RunningSum1480 {
    public static void main(String [] args){
        int [] nums={1,2,3,4};
        int m=nums.length;
        int [] sum=new int[m];
        int j=0;
        int hold=0;
        for(int i=0;i<m;i++){
            sum[j]=hold + nums[i];
            hold=sum[j];
            j++;
        }

        for(int i=0;i<m;i++){
            System.out.println(sum[i]);
        }
    }
}
