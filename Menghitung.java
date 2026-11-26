import java.util.Scanner;

public class Menghitung{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        int jumlahA = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == 'a' || kalimat.charAt(i) == 'A') {
                jumlahA++;
            }
        }

        System.out.println("Jumlah karakter: " + kalimat.length());
        System.out.println("Jumlah huruf a: " + jumlahA);
        System.out.println("Huruf kapital: " + kalimat.toUpperCase());
        System.out.println("Karakter pertama: " + kalimat.charAt(0));
        System.out.println("Karakter terakhir: " + kalimat.charAt(kalimat.length() - 1));

        input.close();
    }
}
