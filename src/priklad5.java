public class priklad5 {
    public static void main(String[] args) {
        String jmeno = "pan Petr Matejka";
        String regex = "(paní|pan|slečna) [A-Z][a-z]{2,} [A-Z][a-z]{2,}";
        if (jmeno.matches(regex)) {
            System.out.println("Je jméno");
        }
        else {
            System.out.println("Není jméno");
        }
    }
}
