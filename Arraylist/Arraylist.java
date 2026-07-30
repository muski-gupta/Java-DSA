import java.util.*;
public class Arraylist {
    public static void main(String [] args){
        ArrayList<Integer> ll = new ArrayList<> (); //blank arraylist
        System.out.println(ll);        //1.print blank array
        System.out.println(ll.size()); //2..print the size of array 


        //mwthods of arraylist

        // 1.add element into arraylist 
        ll.add(10);
        ll.add(20);    
        ll.add(2,-6);   //.adding at particular index 
        Collections.sort(ll);    //sort arraylist 
        Collections.reverse(ll);
    

       // 2.get (range 0 to size-1)
       System.out.println(ll.get(2));
       System.out.println(ll);


       //3.set (replace value at a particular index)
       ll.set(1,90);
       System.out.println(ll);
       for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
         }

         //4.remove(delete data of particular index)
         System.out.println(ll.remove(1));
         System.out.println(ll);
         

        // for-each loop example
         for(int v : ll){
            System.out.print(v + " ");
         }
          System.out.println() ;
         int [] arr = {1,2,3,4,5,89};
         for(int v : arr){
            System.out.print(v + " ");
         }

         char [] a = {'a', 'b' ,'c' };
         for(char v : a){
            System.out.print(v + " ");  
         }

    }
}