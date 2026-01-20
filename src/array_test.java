public class array_test {
    public static void main(String[] args) {
        int[][] tabulka = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("řádků: " + tabulka.length);
        System.out.println("sloupců: " + tabulka[0].length);
        for (int[] radky : tabulka){
            for (int prvky:radky){
                System.out.print(" " + prvky);
            }
        }
    }
}
