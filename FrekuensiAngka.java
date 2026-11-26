public class FrekuensiAngka {

    public static void main(String[] args) {

        int[] angka = {2, 5, 2, 7, 5, 2, 8, 5};

        int jumlah2 = 0;
        int jumlah5 = 0;
        int jumlah7 = 0;

        for (int i = 0; i < angka.length; i++) {

            if (angka[i] == 2) {
                jumlah2++;
            }

            if (angka[i] == 5) {
                jumlah5++;
            }

            if (angka[i] == 7) {
                jumlah7++;
            }
        }

        System.out.println("Angka 2 muncul " + jumlah2 + " kali");
        System.out.println("Angka 5 muncul " + jumlah5 + " kali");
        System.out.println("Angka 7 muncul " + jumlah7 + " kali");
    }
}
