public class mat {
    public static void main(String[] args) {
        try {
         int a=1, b=0;
         int c=a/b;
         
         System.out.println(c);
         
        }catch (ArithmeticException e) {
         System.out.println(e.getMessage());
         System.out.println("Tidak bisa membagi dengan 0");
        }
        
       }
}