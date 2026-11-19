
import java.util.Scanner;

public class switchHARGA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MINUMAN ===");
        System.out.println("1. Air Mineral");
        System.out.println("2. Teh");
        System.out.println("3. Kopi");
        System.out.println("4. Jus");

        System.out.print("Pilih minuman: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Harga Rp3.000");
                break;
            case 2:
                System.out.println("Harga Rp5.000");
                break;
            case 3:
                System.out.println("Harga Rp7.000");
                break;
            case 4:
                System.out.println("Harga Rp8.000");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }

        input.close();
    }
}

