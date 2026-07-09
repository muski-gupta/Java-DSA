public class Basic {
    public static void main(String [] args){
        String str = "hello"; //inside string pool
        String str2 = "hello"; //not inside (dulicates are not alloweded without new keyword)
        String str1 = new String("hello"); //outside
        String str3 = new String("hello");  //outside (duplicates are alloweded)
    //     System.out.println(str);
    //     System.out.println(str1);
    //     System.out.println(str2);
    //     System.out.println(str3);

    //     //methods in array 

        System.out.println(str.length()); //string.length() is a function here
        System.out.println(str.charAt(2));  //to find char at particular index
        // str1=str1+str2;
        str1=str1.concat(str2);   //to add two or more strings
        System.out.println(str1);
           System.out.println(str == str1);         //address check
           System.out.println(str == str2);
           System.out.println(str3 == str1);
           System.out.println(str.equals(str2));   //value check 
           System.out.println(str.substring(1,3));   //do not include the ending index 
           System.out.println(str.substring(2));   //from start till end 
           System.out.println(str.substring(2,2));   //blind string 
          
           
            System.out.println(10+str+20+30); //string phle aagyi to add nhi honge 
            System.out.println(10+20+30+str); //str baad m h to add ho ajynge
            System.out.println(10+str+(20+30)); //bracket h isliye add honge
            System.out.println(str+10+20+30);  //str phle agyi to string m cnvert ho jyenge
    }
}
