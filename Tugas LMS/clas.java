public class clas {
    public static void main(String[] args) {
        try {
            Class a = Class.forName("Cek");
        } catch (ClassNotFoundException e) {
            System.out.println("Ini Adalah Error Class Not Found Exception, yang berarti Class yang dipanggil tidak tersedia");
        }

    }
}
