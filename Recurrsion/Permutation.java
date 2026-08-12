// public class Permutation {
//     public static void main(String [] args){
//       String ques="abc";
//       Permutation(ques," ");
//     }
//     public static void Permutation(String ques ,String ans){
//      //base casw
//      if(ques.length()==0){
//         System.out.print(ans + " ");
//         return ;
//      }
//         for(int i=0;i<ques.length();i++){
//        char ch=ques.charAt(i);
//         String s1=ques.substring(0,i);
//        String s2=ques.substring(i+1);
//         Permutation(s1+s2 , ans+ch);
//         }
//     }
// }

//duplicate permutations 
public class Permutation {
    public static void main(String [] args){
        String ques="abab";
        Permutation(ques, "");
        return;
    }
    public static void Permutation(String ques ,String ans){
        //base case hit 
        if(ques.length()==0){
            System.out.print(ans + " ");
            return ;
        }
        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            boolean flag=false;
            for(int j=i+1;j<ques.length();j++){
                if(ques.charAt(j)==ch){
                    flag=true;
                    break;
                }  
            }
            if(flag==false){
                String s1=ques.substring(0,i);
                String s2=ques.substring(i+1);
                Permutation(s1+s2,ans + ch);
            }
        }

    }
}
