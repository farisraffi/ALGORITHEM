public class periksasuhu {
    public static void main(String[] args) {

        int suhu = 25;

        System.out.println("Suhu: " + suhu + "°C");

        if (suhu > 27) {
            System.out.println("Terlalu Panas");
        } else if (suhu > 18 && suhu < 27) {
            System.out.println("Normal");
        }else {
            System.out.println("Dingin");
        }
    }
}