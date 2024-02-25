public class okey {
    public static void main(String[] args) {
        try {
            Integer b = null;

            if (b < 0) {
                System.out.println(b);
            }

        } catch (NullPointerException e) {
            System.out.println("Tidak dapat mengambil nilai value karena null");
        }
    }
}
