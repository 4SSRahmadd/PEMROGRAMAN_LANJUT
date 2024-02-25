import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Buat array list untuk menampung inputan angka dan string
        ArrayList<Integer> inNumber = new ArrayList<>();
        ArrayList<String> inString = new ArrayList<>();

        // Buat scanner untuk menerima input dari user
        Scanner scanner = new Scanner(System.in);

        // Buat variabel untuk menandai apakah program masih berjalan atau sudah dihentikan
        boolean running = true;

        // Jalankan loop sampai program dihentikan
        while (running) {
            try {
                // Tampilkan prompt kepada user
                System.out.print("Masukkan input (angka atau string): ");

                // Baca input dari user
                String input = scanner.nextLine();

                // Cek apakah input merupakan angka atau string
                if (isNumeric(input)) {
                    // Masukkan input ke dalam array list inNumber
                    inNumber.add(Integer.parseInt(input));
                } else {
                    // Masukkan input ke dalam array list inString
                    inString.add(input);
                }
            } catch (Exception e) {
                // Jika terjadi error, tampilkan pesan error dan lanjutkan loop
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Tampilkan semua input yang telah diinput
        System.out.println("Input angka: " + inNumber);
        System.out.println("Input string: " + inString);

        // Tutup scanner
        scanner.close();
    }

    // Method untuk mengecek apakah string merupakan angka atau tidak
    public static boolean isNumeric(String str) {
        try {
            // Coba parse string ke dalam tipe data integer
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
