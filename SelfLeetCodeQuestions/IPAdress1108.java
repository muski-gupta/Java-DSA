public class IPAdress1108 {
    public static void main(String [] args){
       String address = "1.1.1.1";
      Address(address);
    }
    public static void Address(String address){
        address=address.replace(".","[.]");
        System.out.println(address);
    }
}
