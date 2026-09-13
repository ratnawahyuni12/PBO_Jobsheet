public class Buku {
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public String kategori;
    public boolean sedangDipinjam;

    public void tampilkanInfo() {
        System.out.println("Judul         : " + judul);
        System.out.println("Penulis       : " + penulis);
        System.out.println("Tahun Terbit  : " + tahunTerbit);
        System.out.println("Kategori      : " + kategori);
        System.out.println("Status        : " + (sedangDipinjam? "Dipinjam" : "Tersedia"));
    }

    public void pinjamBuku() {
        if (!sedangDipinjam) {
            sedangDipinjam = true;
            System.out.println(judul + " berhasil dipinjam");
        } else {
            System.out.println(judul + " sedang tidak tersedia");
        }
    }

    public void kembalikanBuku() {
        if (sedangDipinjam) {
            sedangDipinjam = false;
            System.out.println(judul + " berhasil dikembalikan");
        } else {
            System.out.println(judul + " belum dipinjam");
        }
    }
}