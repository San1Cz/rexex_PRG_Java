public class priklad6 {
    public static void main(String[] args) {
        String regex = "[+-]?\\d+([.,])?\\d*";
        String cislo = "-123.123";
        if (cislo.matches(regex)) {
            System.out.println("Je číslo");
        }
        else {
            System.out.println("Není číslo");
        }

    }
}
