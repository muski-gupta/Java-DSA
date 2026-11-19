public class RichCusWealth1672 {
      public static void main(String [] args){
        int account[][]={{2,2,4},{1,1,1}};
        int m=account.length;
        int max=0;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<account[i].length;j++){
            sum=sum+account[i][j];  
            max=Math.max(sum,max);
            }
        }
        System.out.println(max);
      }
}
