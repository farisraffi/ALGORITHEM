import java.util.Scanner;

public class MenghitungKelipatan {

    static int hitungKelipatan(int angka) {
        int jumlah = 0;

        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        System.out.println("Jumlah kelipatan 3: " + hitungKelipatan(angka));

        input.close();
    }
}

