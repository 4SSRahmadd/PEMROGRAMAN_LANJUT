public class panjang {
    public static void main(String[] args) {
        try {
         int[] a= new int[5];
         
         System.out.println(a[25]);
         
        }catch (IndexOutOfBoundsException e) {
         System.out.println(e.getMessage());
        }
      }
}
