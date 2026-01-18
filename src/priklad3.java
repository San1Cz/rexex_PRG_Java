public class priklad3 {
    public static void main(String[] args) {
        String regex = "[1-9][ABCEHJKLMPSTUZ][0-9]\\s?\\d{4}";
        String SPZ = "1A1 2345";
        if (SPZ.matches(regex)) {
            System.out.println("Je SPZ");
        }
        else {
            System.out.println("Není SPZ");
        }
    }
}
