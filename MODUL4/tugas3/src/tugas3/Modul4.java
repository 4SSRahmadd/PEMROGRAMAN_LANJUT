package tugas3;
public class Modul4 {
    int hari = 586;

    public void ProgramKonversi (){
        int konvtahun = hari / 365;
        int sisatahun = hari % 365;
        
        int konvbulan = sisatahun / 30;
        int sisabulan = sisatahun % 30;
        
        int konvhari = sisabulan;
        
        hasilPrint(konvtahun, konvbulan, konvhari);
    }

    private void hasilPrint(int konvtahun, int konvbulan, int konvhari) {
        System.out.println("Jumlah hari = "+hari);
        System.out.println(hari + " Hari = " + konvtahun + " Tahun " + konvbulan + " Bulan " + konvhari + " Hari ");
    }

    public static void main(String[] args) {
        Modul4 run = new Modul4();
        run.ProgramKonversi();
    }

}

