import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        int data[] = { -75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30 };
        Scanner in = new Scanner (System.in);
        System.out.println("Data Awal :");
        for (int i = 0; i < 12; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\nSetelah di sorting : ");

        int len = data.length - 1;

        for (int x = 0; x <= len - 1; x++) {
            for (int y = 0; y <= len - 1; y++)
                if (data[y] > data[y + 1]) {
                    int i = data[y];
                    data[y] = data[y + 1];
                    data[y + 1] = i;
                }
        }

        for (int z = 0; z <= len; z++) {
            System.out.print(data[z] + " ");
        }
    System.out.print("\nCari data ke = ");
    int v = in.nextInt();
    System.out.println("Index ke-" + v + " " + data[v]);
    }
}