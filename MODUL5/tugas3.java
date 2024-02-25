import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ukrn = 0; 
        float positif = 0, negatif = 0, nol = 0;

        System.out.print("Size : ");
        ukrn = input.nextInt();

        int[] data = new int[ukrn];
        
        System.out.print("Input Data : ");
        for(int i = 0; i <= (ukrn - 1); i++){
            data[i] = input.nextInt();
        }

        System.out.println("Result : ");
        for(int i = 0; i <= (ukrn - 1); i++){
            System.out.print(data[i] + " ");
            if(data[i] < 0)
            negatif++;

            if(data[i] == 0)
            nol++;

            if(data[i] > 0 )
            positif++;
        }

        System.out.println("\nPositif : " + (positif / ukrn));
        System.out.println("Negatif : " + (negatif / ukrn));
        System.out.println("Zero : " + (nol / ukrn));

    }
}
