import java.util.*;
public class method {
    public static void main(String [] args){
      int nums[]={0,1,2,3,4};
      String name="muski";
      char ch='P';
    char[] result = {'a', 'b', 'c'};
    ArrayList<Integer> list = new ArrayList<>();
    //   System.out.println(Arrays.toString(method(nums))); //int
    // System.out.println(getName(name));  //String
    // System.out.print(getCharacter(ch));   //Char
    // System.out.println(getCharacters(result)); //char type of array
    // System.out.println(getList(list));  //arraylist
    // printArray(nums); //void
    System.out.println(Arrays.toString(getMatrix())); //2d matrix

    }

    //1... int and its return type
    // public static int method(int [] nums){
    //     int max=0;
    //     for(int i=0;i<nums.length;i++){
    //        max=nums[i];
    //     }
    //     return max;
    // }

    //2....array and its return type
    //  public static int[] method(int [] nums){
    //  int result[]={1,2,4};
    //  return result;  //on leetcode it will work but if want to do it on vs code i have to
     //  System.out.println(Arrays.toString(method(nums)));   //in main method


     //3...String and its return type 
    // public static String getName(String name){
    //  return name; 
    // }}
     
     //4...char
    // public static  char getCharacter(char ch) {
    //     return ch;
    // }

    //5...array
    // public char[] getCharacters(char [] result) {
    // return result;
    // }


    //6..boolean type similarly for doublr float etc
    // public boolean isValid(int[] nums) {
    //     if(nums.length > 0) {
    //         return true;
    //     }

    //     return false;
    // }

    // 7.ArrayList<Integer> 
    //  public static ArrayList<Integer> getList(ArrayList<Integer> list) {
    //     list.add(10);
    //     list.add(20);
    //     list.add(30);
    //     return list;
    // }


    // 8.void 
//     public static void printArray(int[] nums) {
//         for(int i = 0; i < nums.length; i++) {
//             System.out.println(nums[i]);
//         }
//     }
// }


    public static int[][] getMatrix() {
        int[][] result = {
            {1, 2},
            {3, 4}
        };

        return result;
    }
}







