import java.util.Scanner;

public class Nyoba2 {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan inputan angka
        int[] inNumber = new int[100];
        // Membuat array untuk menyimpan inputan string
        String[] inString = new String[100];
        // Membuat scanner untuk membaca input dari user
        Scanner sc = new Scanner(System.in);

        // Menyimpan indeks array yang terakhir diisi
        int inNumberIndex = 0;
        int inStringIndex = 0;

        // Meminta input kepada user sampai user memasukkan kata "stop"
        while (true) {
            System.out.print("Masukkan input: ");
            String input = sc.nextLine();

            // Jika input adalah kata "stop", maka keluar dari loop
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            // Mencoba mengonversi input menjadi angka
            try {
                int number = Integer.parseInt(input);
                inNumber[inNumberIndex] = number;
                inNumberIndex++;
            } catch (NumberFormatException e) {
                // Jika gagal mengonversi menjadi angka, maka asumsi input adalah string
                inString[inStringIndex] = input;
                inStringIndex++;
            }
        }

        // Menampilkan semua input yang telah diinput
        System.out.println("Input angka:");
        for (int i = 0; i < inNumberIndex; i++) {
            System.out.println(inNumber[i]);
        }
        System.out.println("Input string:");
        for (int i = 0; i < inStringIndex; i++) {
            System.out.println(inString[i]);
        }

        // Menutup scanner
        sc.close();
    }
}
