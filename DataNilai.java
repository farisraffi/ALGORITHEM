public class DataNilai {
    
    public static void main(String[] args) {

        int[] nilai = {76, 90, 65, 88, 72};

        System.out.println("Sebelum diurutkan:");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }

        // Proses Bubble Sort
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {

                if (nilai[j] > nilai[j + 1]) {
                    int sementara = nilai[j];

                    nilai[j] = nilai[j + 1];

                    nilai[j + 1] = sementara;
                }
            }
        }

        System.out.println("\n\nSesudah diurutkan:");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
    }
}
 

