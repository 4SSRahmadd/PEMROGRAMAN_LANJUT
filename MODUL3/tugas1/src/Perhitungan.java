public class Perhitungan extends Balok {
        public int luas(Balok sisi) {
            int panjang = sisi.getPanjang();
            int lebar = sisi.getLebar();

            return panjang * lebar;
        }
        public int volume(Balok sisi) {
            int panjang = sisi.getPanjang();
            int lebar = sisi.getLebar();
            int tinggi = sisi.getTinggi();

            return panjang * lebar * tinggi;
        }
        //exrtra method membagi fungsi kan ada fungsi volume dan luas akan sama variabel juga sama maka dari itu dibagi dengan tujuan menghindari error
        //inline membuang variabel yg fungsinya sementara makanya di return
}

