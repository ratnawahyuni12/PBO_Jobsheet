package Kuis01;

public class DemoReservasiRuangLab {
    public static void main(String[] args) {
        System.out.println("===- DATA AWAL RUANG -==="); // min 3 objek, kondisi awal true
        Ruang r1 = new Ruang("R01", "Lab Jaringan", 20);
        r1.cetakInfo();
        System.out.println();

        Ruang r2 = new Ruang("R02", "Lab Basis Data", 15);
        r2.cetakInfo();
        System.out.println();

        Ruang r3 = new Ruang("R03", "Lab Pemrograman", 25);
        r3.cetakInfo();
        System.out.println();

        System.out.println("===- PENGUJIAN ATURAH BISNIS -==="); // semua lewat method
        r1.pesan(15);
        r2.pesan(10);
        r3.pesan(0);
        r3.pesan(30);
        r1.pesan(5);
        r2.batalkan();
        r3.batalkan();

        System.out.println("\n===- PENGUJIAN: IDENTITAS RUANG TIDAK BOLEH DIUBAH -===");
        System.out.println("ID ruang r1 tetap: " + r1.getIdRuang() + " (tidak ada method untuk mengubahnya).");
        System.out.println("\n===- STATUS AKHIR RUANG -===");
        r1.cetakInfo();
        System.out.println();
        r2.cetakInfo();
        System.out.println();
        r3.cetakInfo();
        System.out.println();
    }
}