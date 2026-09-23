package Kuis01;

public class DemoPenilaianSertifikasiMhs {
    public static void main(String[] args) {
        System.out.println("===- DATA PESERTA -==="); // minimal 3 objek
        Peserta p1 = new Peserta("Andi", 85, 75, 80);
        p1.cetakInfo();
        System.out.println();

        Peserta p2 = new Peserta("Budi", 65, 60, 62);
        p2.cetakInfo();
        System.out.println();

        Peserta p3 = new Peserta("Citra", 90, 90, 50);
        p3.cetakInfo();
        System.out.println();

        System.out.println("===- PENGUJIAN NILAI TIDAK VALID -===");
        p1.setNilaiTeori(150);
        p1.setNilaiProyek(-10);

        System.out.println("\n===- DATA SETELAH PENGUJIAN -==="); //tidak berubah karena input ditolak
        p1.cetakInfo();
    }
}