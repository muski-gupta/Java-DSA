import java.util.*;
public class ReverseVowelString345 {
    public static void main(String [] args){
        String s="IceCreAm";
        System.out.println(s);
        char [] arr=s.toCharArray();
        int low=0;
        int high=s.length()-1;
    while(low<=high){

    if((arr[low]=='a'||arr[low]=='e'||arr[low]=='i'||arr[low]=='o'||arr[low]=='u'||
        arr[low]=='A'||arr[low]=='E'||arr[low]=='I'||arr[low]=='O'||arr[low]=='U')
        &&
       (arr[high]=='a'||arr[high]=='e'||arr[high]=='i'||arr[high]=='o'||arr[high]=='u'||
        arr[high]=='A'||arr[high]=='E'||arr[high]=='I'||arr[high]=='O'||arr[high]=='U')){

        char temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;

        low++;
        high--;
    }

    else if(!(arr[low]=='a'||arr[low]=='e'||arr[low]=='i'||arr[low]=='o'||arr[low]=='u'||
              arr[low]=='A'||arr[low]=='E'||arr[low]=='I'||arr[low]=='O'||arr[low]=='U')){

        low++;
    }

    else{
        high--;
    }

            }
            String str=new String(arr);
            System.out.println(str);
        }
    }




