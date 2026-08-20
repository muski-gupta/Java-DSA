import java.util.*;
public class StringMatching1408 {
    public static void main (String[] args) {
        String [] words={"mass","as","hero","superhero"};
         Stringmatch(words);
       
    }
    public static void Stringmatch(String [] words){
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i==j){
                    continue;
                }
                else if(words[j].contains(words[i])){
                    System.out.println(words[i]);
                }
            }
        }
    }
//    public static List<String> stringMatching(String [] words){
//           List<String> ans = new ArrayList<> ();
//         for(int i=0;i<words.length;i++){
//             for(int j=0;j<words.length;j++){
//                 if(i==j){
//                    continue;
//                 }

//                  if (words[j].contains(words[i])){
//                     ans.add(words[i]);
//                  }
//             }
//         }
//         return ans;
//     }
}
