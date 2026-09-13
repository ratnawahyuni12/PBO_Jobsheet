public class DemoKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.merek = "Toyota Avanza";
        kendaraan1.tahunProduksi = 2023;
        kendaraan1.kecepatanMaksimal = 160;

        System.out.println("=== Data Kendaraan 1 ===");
        kendaraan1.tampilkanInfo();

        Kendaraan kendaraan2 = new Kendaraan();
        kendaraan2.merek = "Honda Beat";
        kendaraan2.tahunProduksi = 2022;
        kendaraan2.kecepatanMaksimal = 100;

        System.out.println("\n=== Data Kendaraan 2 ===");
        kendaraan2.tampilkanInfo();
    }
}