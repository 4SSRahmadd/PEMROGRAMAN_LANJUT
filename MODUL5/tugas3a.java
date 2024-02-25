import java.util.Scanner;

public class tugas3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ukrn = 0;
        int[] array = new int[]{ukrn};
        System.out.println("Size : ");
        ukrn = input.nextInt();
        //int[] array = new int[ukrn];


        System.out.println("Input data :");
        ukrn = input.nextInt();
        for (int i = 0; i < ukrn; i++) {
            array[i] = input.nextInt();
        }
float positif = 0, negatif = 0, nol = 0;
            int n = 0;
            
            for (int i = 0; i < n; i++){
                if(array[i] >0){
                    positif++;
                }
                else if (array[i]<0){
                    negatif++;
                }
                else{
                    nol++;
                }
            }
        System.out.println("Positif :" + positif +"\n");
        System.out.println("Negatif :" + negatif + "\n");
        System.out.println("Nol :" + nol + "\n");
    }
}
