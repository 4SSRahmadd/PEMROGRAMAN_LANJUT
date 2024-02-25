public class IsCube {
    static boolean IsCube (long input){
        long round = Math.round(Math.cbrt(input));
        return(round * round * round) == input;
    }

    public static void main(String[] args) {
        System.out.println(IsCube(3 ));
    }
}
