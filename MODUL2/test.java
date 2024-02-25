import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        System.out.println("Masukkan Nomor Telepon");
        Scanner input = new Scanner(System.in);
        boolean hehe;
        String NIM = input.nextLine();
        // System.out.println(tlp.matches("[0-9]"));
        System.out.println(NIM.matches("[0-9]*"));
    }
}
