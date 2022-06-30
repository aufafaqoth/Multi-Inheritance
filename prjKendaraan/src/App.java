public class App {
    public static void main(String[] args) {
        minibus a = new minibus("E 7654 AH", "Toyota", 2500000.0f, "CCTV, GPS", "AC, Double Blower", 20, 20, 50, "Wagon");
        minibus b = new minibus("R 9061 AF", "Honda", 3200000.0f, "CCTV, GPS, Wi-Fi", "AC, Double Blower", 60, 5, 30, "Pribadi");
        
        a.hitungPajak();
        a.tampilInfo();

        b.tampilInfo();
        b.hitungPajak();
    }
}
