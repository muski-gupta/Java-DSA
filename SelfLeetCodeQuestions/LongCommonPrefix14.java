import java.util.ArrayList;
import java.util.List;

public class LongCommonPrefix14 {
    public static void main(String [] args){
        // String [] strs = {"flower","flow","flight"};
        String [] strs = {"flower","flow"};
        prefix(strs);
    }
public static void prefix(String[] strs){
       String ans="";
for(int i=0;i<strs.length;i++){
    for(int j=i+1;j<strs.length;j++){
         if(strs[i].contains(strs[j])){
            System.out.println(strs[j]);
         }
    }
}
}
}


