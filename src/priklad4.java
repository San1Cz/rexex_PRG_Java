public class priklad4 {
    public static void main(String[] args) {
        String jmeno = "Petr";
        String regex = "[A-Z][a-z]{2,}";
        if (jmeno.matches(regex)) {
            System.out.println("Je jméno");
        }
        else {
            System.out.println("Není jméno");
        }
    }
}
