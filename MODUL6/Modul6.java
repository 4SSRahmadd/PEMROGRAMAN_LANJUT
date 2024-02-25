/**
@author Yaasir Rahmat Kautsar
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Modul6 {
    // Variabel untuk menampung data
    String[] inString = {};
    int[] inNumber = {};

    int indexString = 0, indexNumber = 0;

    public static void main(String[] args) {

        looping();
    }

    // Membuat method function untuk memfilter apakah inputan string mengandung integer
    
    static boolean convNumber(String text) {
        char[] chars = text.toCharArray();

        // Untuk setiap char c dalam chars
        for (char c : chars) {
            // Jika semua karakter dalam inputan angka, maka true
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    // Method function untuk menginput data
    void inputData() throws IOException {
        Scanner input = new Scanner(System.in);

        String inInput;

        System.out.println("\n===== Program Inputan Data =====");
        System.out.print("\nData: ");
        inInput = input.nextLine();

        // Proses jika inputan berupa String, akan di konversi ke data Integer
        if (convNumber(inInput)) {
            inNumber = Arrays.copyOf(inNumber, inNumber.length + 1); // Mengcopy array dan menambahkan panjang array +1
            inNumber[indexNumber] = Integer.parseInt(inInput); // parseInt untuk mengkonversi dari String ke Integer
            convNumber(inNumber);

        } else {
            inString = Arrays.copyOf(inString, inString.length + 1);
            inString[indexString] = inInput;
            convString(inString);
        }

        System.out.println("\n--- DATA BERHASIL DIINPUT -----");
        looping();
        input.close();
    }

    // Method function untuk menabahkan inputan integer ke database khusus integer
    static void convNumber(int[] x) throws IOException {
        FileWriter file = new FileWriter("iniNumber", true);

        for (int j : x) {
            file.write(String.format("%s\n", j));
        }
        file.flush();
        file.close();
    }

    // Method function untuk menambahkan inputan string ke database khusus string
    static void convString(String[] x) throws IOException {
        FileWriter file = new FileWriter("iniString", true);

        for (String s : x) {
            file.write(String.format("%s\n", s));
        }
        file.flush();
        file.close();
    }
    // Method loop untuk mengulang program aja
    static void looping() {
        try {
            Modul6 spawn = new Modul6();
            Scanner input = new Scanner(System.in);

            System.out.print("\nIngin menginput data? (Y/N): ");
            char pilih = input.next().charAt(0);

            if (pilih == 'y' || pilih == 'Y') {
                spawn.inputData();
            } else if (pilih == 'n' || pilih == 'N') {
                System.out.println("\n===== Program Selesai =====");
            } else if (pilih != 'y' || pilih != 'Y' || pilih != 'n' || pilih != 'N') {
                throw new Exception();
            }
            input.close();
        } catch (Exception e) {
            System.out.println("\n--- INPUTAN SALAH -----");
            looping();
        }
    }
}
