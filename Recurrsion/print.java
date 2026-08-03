public class print {

    //print decreasing order
        // 5 4 3 2 1
//     public static void main(String [] args){
//         int n=5;
//         print(n);
//     }

//     public static void print(int n) {
//         if(n==0){
//             return ;
//         }
//        System.out.print(n + " ");
//        print(n-1);
// }


//print increasing order 
// 1 2 3 4 5
    public static void main(String [] args){
        int n=5;
        print(n);
    }

    public static void print(int n) {
        if(n==0){
            return ;
        }
        print(n-1);
        System.out.println(n); 
}
}



