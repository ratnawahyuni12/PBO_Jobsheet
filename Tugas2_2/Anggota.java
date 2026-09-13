public class Anggota {
    public String nama;
    public String nim;
    public String jurusan;

    public void tampilkanInfo() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
    }

    public void pinjamBuku(Buku buku) {
        System.out.println(nama + " meminjam buku: ");
        buku.pinjamBuku();
    }

    public void kembalikanBuku(Buku buku) {
        System.out.println(nama + " mengembalikan buku: ");
        buku.kembalikanBuku();
    }
}