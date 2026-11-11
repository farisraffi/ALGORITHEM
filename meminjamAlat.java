public class meminjamAlat {
     public static void main(String[] args) {

        boolean kartuPelajar = true;
        boolean tanggungan = true;

        if (kartuPelajar && !tanggungan) {
            System.out.println("Siswa boleh meminjam alat.");
        } else {
            System.out.println("Siswa tidak boleh meminjam alat.");
        }
    }
}


