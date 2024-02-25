import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean hehe = true;
        while (hehe) {
            String nama = input.next();
            String NIM = input.next();
            String iml = input.next();
            try { 
               
                System.out.println("Masukkan NIM :");
                if (NIM.length() == 15) {
                    if (NIM.contains("10370311")) {
                        if (NIM.matches("[0-9]*")) {
                            System.out.println("data sesuai");
                            System.out.println("Ini datamu = " + NIM);
                            System.out.println("terimakasih data yang anda berikan sesuai");
                        } else {
                            System.out.println("terjadi kesalahan dalam import data");
                            throw new modul1a();
                        }
                        hehe = false;
                    } else {
                        throw new modul1();
                    }
                } else {
                    throw new modul1a();
                }
            } catch (modul1 | modul1a e) {
                System.out.println(e.getMessage());
            }
        System.out.print("Masukkan Email :");              
        try {
            if (iml.contains("webmail.umm.ac.id") && iml.matches("[a-z]")){
                System.out.print("data emailmu ="+ iml);
            }else {
                throw new ok();
            }
            } catch (ok e) {
                System.out.println(e.getMessage());
            }
        }
    }
}