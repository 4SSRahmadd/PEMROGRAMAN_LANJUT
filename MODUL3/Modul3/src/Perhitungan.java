public class Perhitungan {

    // Di method luas beri satu parameter yaitu sisi dengan tipe data Balok
    public int luas(Balok sisi) {
        // Mengambil nilai yang ada di kelas balok
        int panjang = sisi.getPanjang();
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();
        return panjang * lebar * tinggi;
    }

    // Di method volume beri satu parameter yaitu sisi dengan tipe data Balok
    public int volume(Balok sisi) {
        // Mengambil nilai yang ada di kelas balok
        int panjang = sisi.getPanjang();
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();
        return 4 * panjang * lebar * tinggi;
    }

}
