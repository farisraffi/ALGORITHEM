

public class daftarDurasiBelajar {
    public static void main(String[] args) {

        int[] durasi = {45, 60, 30, 90, 75};
        int total = 0;
        int terbesar = durasi[0];
        int terkecil = durasi[0];

        System.out.println("=== DURASI BELAJAR ===");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": " + durasi[i] + " menit");

            total = total + durasi[i];

            if (durasi[i] > terbesar) {
                terbesar = durasi[i];
            }

            if (durasi[i] < terkecil) {
                terkecil = durasi[i];
            }
        }

        System.out.println();

        System.out.println("Total durasi: " + total + " menit");
        System.out.println("Rata-rata: " + (total / 5) + " menit");
        System.out.println("Paling lama: " + terbesar + " menit");
        System.out.println("Paling singkat: " + terkecil + " menit");
    }
}
