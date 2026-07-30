import java.util.*;
// It is Alex's birthday and she wants to go shopping. She only has 'A' units of money
//  and she wants to spend all of her money. However, she can only purchase one kind of item. 
// She goes to a shop which has 'n types items with prices Ao.A,,A2...,An-1.
//  The shopkeeper claims that he has at least 'k' items she can choose from.
//  Help her find out if the shopkeper is correct or not.
// Input Format
// The first line contains an integer 'n' denoting the number of items in the shop.
//  The second line contains 'n' space-separated integers describing the respective price of each item. 
// The third line contains an integer 'a' denoting the number of queries.
//  Each of the subsequent lines contains two space-separated integers 'A' and 'k'
// Constraints
// 1 <=n, A, A <= 105 where 0<=i
// 1<= q <= 2*n
// 1 < k<= n
// The array may contain duplicate elements.
// Output Format
// For each query, print Yes on a new line if the shopkeeper is correct; 
// otherwise, print No instead.



public class Birthday {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
     int n=sc.nextInt(); //no of items in shop
     int price[]=new int[n];
     for(int i=0;i<price.length;i++){
        price[i]=sc.nextInt();
     }
     int q=sc.nextInt();
      while(q>0){
      int A=sc.nextInt(); //query wise price 
      int K=sc.nextInt();
      if (Purchase(price,A,K)==true){
         System.out.println("yes");
      }
      else{
         System.out.println("No");
      }
      q--;
    }
    sc.close();
    }


    public static boolean Purchase(int []price,int A,int K){
        int count=0;
        for(int i=0;i<price.length;i++){
            if(A%price[i]==0){
             count++;
            }
         }
         if(count>=K){
            return true;
         }
         else{
            return false;
         }
    }
}
