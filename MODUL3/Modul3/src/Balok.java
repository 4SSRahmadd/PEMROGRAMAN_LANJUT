public class Balok {
    int panjang, lebar, tinggi;

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLebar() {
        return lebar;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    protected void hasil() {
        Perhitungan ph = new Perhitungan();
        // Beri satu arguman dengan nilai kelas ini sendiri saat memanggil metho luas
        System.out.println("Hasil luas balok : " + ph.luas(this));
        // Beri satu arguman dengan nilai kelas ini sendiri saat memanggil metho luas
        System.out.println("Hasil volume balok : " + ph.volume(this));
    }
}
