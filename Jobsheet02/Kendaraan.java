public class Kendaraan {
    String merek;
    int tahunProduksi;
    double kecepatanMaksimal;

    void tampilkanInfo() {
        System.out.println("Merek              : " + merek);
        System.out.println("Tahun Produksi     : " + tahunProduksi);
        System.out.println("Kecepatan Maksimal : " + kecepatanMaksimal);
    }
}