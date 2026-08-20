public class ValidAnagram125 {
    public static void main(String [] args){
       String s = "A man, a plan, a canal: Panama";
    //    String s = "race a car";
       System.out.println(Anagram(s));
    }
    public static boolean Anagram(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str += Character.toLowerCase(ch);
            }
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
    // public static boolean Anagram(String s){
    //     int left = 0;
    //     int right = s.length() - 1;
    //     while (left < right) {
    //         // Skip non-alphanumeric characters
    //         while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
    //             left++;
    //         }
    //         while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
    //             right--;
    //         }
    //         // Compare characters ignoring case
    //         if (Character.toLowerCase(s.charAt(left)) != 
    //             Character.toLowerCase(s.charAt(right))) {
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }

