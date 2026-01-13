public class priklad1 {
    public static void main(String[] args) {
        String regex = "[1-7]\\d\\d \\d\\d";
        String PSC = "320 00";
        if (PSC.matches(regex)) {
            System.out.println("Je PSČ");
        }
        else {
            System.out.println("To, co řekl Martin");
        }
    }
}
