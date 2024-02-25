import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pjg;
        Boolean hehe = true;
        while (hehe) {
            try {
                // Nama
                System.out.print("Masukkan NAMA :");
                String name = input.next();
                // Email
                System.out.print("Masukkan Email :");
                String iml = input.next();
                pjg = iml.length();
                if (iml.indexOf("@webmail.umm.ac.id") == (pjg - 18)) {
                    hehe = false;
                } else {
                    hehe = true;
                    throw new ok();
                }
                // NIM
                System.out.print("Masukkan NIM =");
                String NIM = input.next();
                if (NIM.length() == 15) {
                    if (NIM.contains("10370311")) {
                        if (NIM.matches("[0-9]*")) {

                            hehe = false;
                        } else {
                            System.out.println("terjadi kesalahan dalam import data");
                            hehe = true;
                            throw new modul1a();
                        }
                    } else {
                        hehe = true;
                        throw new modul1();
                    }
                } else {
                    hehe = true;
                    throw new modul1a();
                }
                //Telepon
                System.out.print("Masukkan Nomor Telepon :");
                String tlp = input.next();
                if(tlp.matches("[0-9]*")){
                    hehe = false;
                }
                 else{
                    hehe = true;
                    throw new yo();
                }
                System.out.println("Data Telah di input \n" + name + "\n" + iml + "\n" + NIM + "\n"+ tlp);
            } catch (modul1 | modul1a | ok |yo e) {
                System.out.println(e.getMessage());
            }
        }
    }
}