public class DemoPerpustakaan {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java Dasar";
        buku1.penulis = "Andi Setiawan";
        buku1.tahunTerbit = 2022;
        buku1.kategori = "Teknologi";

        Anggota anggota1 = new Anggota();
        anggota1.nama = "Ratna Wahyuni";
        anggota1.nim = "254107060082";
        anggota1.jurusan = "Teknologi Informasi";

        System.out.println("=== Data Buku ===");
        buku1.tampilkanInfo();

        System.out.println("\n=== Data Anggota ===");
        anggota1.tampilkanInfo();

        System.out.println("\n=== Proses Peminjaman ===");
        anggota1.pinjamBuku(buku1);
        buku1.tampilkanInfo();

        System.out.println("\n=== Proses Pengembalian ===");
        anggota1.kembalikanBuku(buku1);
        buku1.tampilkanInfo();
    }
}