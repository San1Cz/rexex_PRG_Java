public class test {
    public static void main(String[] args) {
        String regex = "\\d{3}@.";
        String email = "1111@m";
        if (email.matches(regex)) {
            System.out.println(email);
        }
        else {
            System.out.println("ne");
        }
    }
}

