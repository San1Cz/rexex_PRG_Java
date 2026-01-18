public class priklad7 {
    public static void main(String[] args) {
        String regex = "(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[0-2])\\.\\d{4}";
        String datum = "31.12.2005";
        if (datum.matches(regex)) {
            System.out.println("Je datum");
        }
        else {
            System.out.println("Není datum");
        }
    }
}
