import java.util.*;
public class StringMatching1408 {
    public static void main (String[] args) {
        String [] words={"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));
       
    }
   public static List<String> stringMatching(String [] words){
          List<String> ans = new ArrayList<> ();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i==j){
                   continue;
                }

                 if (words[j].contains(words[i])){
                    ans.add(words[i]);
                 }
            }
        }
        return ans;
    }
}
