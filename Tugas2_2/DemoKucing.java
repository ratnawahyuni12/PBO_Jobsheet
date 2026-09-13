public class DemoKucing {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        kucing1.nama = "Cuking";
        kucing1.warna = "Oren";
        kucing1.jenis = "Anggora";
        kucing1.umur = 2;
        kucing1.berat = 4.5;

        System.out.println("=== Data Kucing 1 ===");
        kucing1.makan();
        kucing1.tidur();
        kucing1.mengeong();
        kucing1.bermain();

        Kucing kucing2 = new Kucing();
        kucing2.nama = "Maung";
        kucing2.warna = "Hitam Putih";
        kucing2.jenis = "Domestik";
        kucing2.umur = 1;
        kucing2.berat = 3.2;

        System.out.println("=== Data Kucing 2 ===");
        kucing2.makan();
        kucing2.tidur();
        kucing2.mengeong();
        kucing2.bermain();

        Kucing kucing3 = new Kucing();
        kucing3.nama = "Simba";
        kucing3.warna = "Coklat";
        kucing3.jenis = "Persia";
        kucing3.umur = 3;
        kucing3.berat = 5.0;

        System.out.println("=== Data Kucing 3 ===");
        kucing3.makan();
        kucing3.tidur();
        kucing3.mengeong();
        kucing3.bermain();
    }
}