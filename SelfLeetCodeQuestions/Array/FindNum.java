import java.util.ArrayList;
public class FindNum {
    public static void main(String [] args){
        // int [] nums={4,3,2,7,8,2,3,1};
        // int [] nums={1,1};
        int [] nums={2,2};
       ArrayList<Integer> list = new ArrayList<>();
        // int smallest=nums[0];
        int n=nums.length;
        // int largest=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     // if(nums[i]>largest){
        //     //     largest=nums[i];
        //     // }
        //     if(nums[i]<smallest){
        //         smallest=nums[i];
        //     }

        // }
       
        for(int i=1;i<=n;i++){
            boolean found=false;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                 found = true;
                 break;
                }
            }
            if(!found){
                list.add(i);
            }
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
