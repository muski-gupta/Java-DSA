//optimized code

import java.util.Scanner;
public class BookAllocation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t>0){
               int n=sc.nextInt();
               int m=sc.nextInt();
               int page[]=new int[n];
               for(int i=0;i<page.length;i++){
                   page[i]=sc.nextInt();
               }
        System.out.println(MinPages(page, m));
        t--;
         }
    }
    public static int MinPages(int[] page, int m) {

        // Edge Case: More students than books
        if (m > page.length) {
            return -1;
        }

        int lo = 0;
        int hi = 0;

        // lo = maximum pages in a single book
        // hi = sum of all pages
        for (int i = 0; i < page.length; i++) {
            lo = Math.max(lo, page[i]);
            hi += page[i];
        }

        int ans = hi;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (isItPossible(page, m, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }

    public static boolean isItPossible(int[] page, int m, int mid) {

        int student = 1;
        int readPage = 0;

        for (int i = 0; i < page.length; i++) {

            // If a single book has more pages than mid,
            // allocation is impossible.
            if (page[i] > mid) {
                return false;
            }

            if (readPage + page[i] <= mid) {
                readPage += page[i];
            } else {
                student++;
                readPage = page[i];

                if (student > m) {
                    return false;
                }
            }
        }

        return true;
    }
}










//non optimized code 


// import java.util.Scanner;

// public class BookAllocation {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//          int nos=2; //no of students
//         int [] page={10,20,30,40};
//  System.out.print(MinPages(page,nos)); 
// }
//     public static int MinPages(int [] page,int nos){
//           int lo=0;
//           int hi=0; //sum of all elements
//           for(int i=0;i<page.length;i++){
//             hi=hi+page[i];    
//           }
//           int ans=0;
//           while(lo<=hi){
//             int mid=(lo+hi)/2;
//             if(isitPossible(page,nos,mid)==true){
//                  ans=mid;
//                  hi=mid-1;
//             }
//             else{
//                 lo=mid+1;
//             }
//           }
//           return ans;
//     }
//     public static boolean isitPossible(int [] page,int nos,int mid){
//         int student =1;
//         int readpage=0;
//         for(int i=0;i<page.length;i++){
//             if(readpage+page[i]<=mid){
//                 readpage+=page[i];
//             }
//             else{
//                  student++;
//                  readpage=page[i];
//             }
//             if(student>nos){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

