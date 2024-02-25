import java.util.Scanner;

public class ori2 {
   static String[][] book = new String[10][100];
   static String place[][] = new String[1][10];

    static int cekdate(int date) {
        if (date < 2018 || date > 2022) {

        }
        return date;
    }

    static int cekFrom(String from) {
        for (int i = 0; place[i][0] != null; i++) {
            if (from.compareTo(place[i][0]) == 0) {
                return i;
            }
        }
        return 0;
    }

    static int cekName(String name) {
        for (int i = 0; book[i][0] != null ; i++) {
            if (name.compareTo(book[i][0]) == 0) {
                return i;
            }
        }
        return 0;
    }

    static int list() {
        for (int i = 0; book[i][0] != null; i++) {
            System.out.println(book[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        book[0][0] = "This is Book, Malang. 2022";
        place[0][0] = "Malang";
        place[0][1] = "Bandung";
        place[0][2] = "Surabaya";

        Scanner input = new Scanner(System.in);
        String inName, inFrom;
        int inIndex=1, inDate;

        System.out.println("Welcome to Library");
        System.out.println("Nama : ");
        inName = input.nextLine();
        cekName(inName);
        System.out.println("From : ");
        inFrom = input.nextLine();
        cekName(inFrom);
        System.out.println("Date : ");
        inDate = input.nextInt();
        cekdate(inDate);
        System.out.println(inName + " " + inFrom + " " + inDate);
        book[1][inIndex] = new String(inName);
        System.out.println("Buku berhasil ditambahkan");
    }
}