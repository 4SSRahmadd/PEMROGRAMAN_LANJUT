import java.util.Arrays;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        int data[] = { -75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30 };
        int v;
        System.out.println("Data Awal : "+ Arrays.toString(data));
        Arrays.sort(data);
        System.out.print("Data setelah di sorting "+ Arrays.toString(data));
        Scanner in = new Scanner(System.in);
        System.out.print("\nCari data ke = ");
        v = in.nextInt();
        System.out.print("Index ke-" + v + " " + data[v]);
    }
}