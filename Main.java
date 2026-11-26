import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] anggota = {"shofwan", "reksa", "nopal", "qois", "faris"};

        System.out.print("Masukkan nama anggota: ");
        String nama = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < anggota.length; i++) {
            if (anggota[i].equals(nama)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Nama " + nama + " terdaftar sebagai anggota.");
        } else {
            System.out.println("Nama " + nama + " tidak terdaftar.");
        }

        input.close();
    }
}
