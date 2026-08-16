import java.util.ArrayList;
import java.util.List;

public class LongCommonPrefix14 {
    public static void main(String [] args){
        String [] strs = {"flower","flow","flight","roweee"};
        prefix(strs);
    }
//     public static void prefix(String [] strs){
//         for(int i=0;i<strs.length;i++){
//               if(strs[i+1].contains(strs[i]) && strs[i+2].contains(strs[i])){
//                 System.out.println(strs[i].charAt(i));
//               }
//               break;
//          }
// }
public static void prefix(String[] strs) {
    for (int i = 0; i < strs[0].length(); i++) {
        if (strs[0].charAt(i) == strs[1].charAt(i)
                && strs[0].charAt(i) == strs[2].charAt(i)) {
            System.out.println(strs[0].charAt(i));
        } else {
            break;
        }
    }
}
}

