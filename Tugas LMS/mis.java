import java.util.InputMismatchException;
import java.util.Scanner;

public class mis {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner("SYUKRON");
            int test = input.nextInt();
            
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("inputan tidak sesuai karena integer diisi String");
        }
    }
    }