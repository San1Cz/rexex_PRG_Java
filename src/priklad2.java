public class priklad2 {
    public static void main(String[] args) {
        String regex = "\\d{2}[015678]\\d(0[1-9]|[12][0-9]|3[01])/\\d{3,4}";;
        String RC = "705901/0002";
        if (RC.matches(regex)) {
            System.out.println("Je rodné číslo");
        }
        else {
            System.out.println("To, co řekl Martin");
        }
    }
}
