package Kuis01;

public class Peserta {
    private String nama;
    private double nilaiPraktik;
    private double nilaiTeori;
    private double nilaiProyek;

    // constructor
    public Peserta(String nama, double nilaiPraktik, double nilaiTeori, double nilaiProyek) {
        this.nama = nama;
        // pakai setter disini agar validasi 0-100 berlaku sejak objek dibuat
        setNilaiPraktik(nilaiPraktik);
        setNilaiTeori(nilaiTeori);
        setNilaiProyek(nilaiProyek);
    }

    // getter
    public String getNama() {
        return nama;
    }

    public double getNilaiPraktik() {
        return nilaiPraktik;
    }

    public double getNilaiTeori() {
        return nilaiTeori;
    }

    public double getNilaiProyek() {
        return nilaiProyek;
    }

    // setter
    // setter nilai praktik
    public boolean setNilaiPraktik(double nilai) {
        if (!isValid(nilai)) {
            System.out.println("[DITOLAK] Nilai praktik " + nilai + " tidak valid (harus 0-100).");
            return false;
        }
        this.nilaiPraktik = nilai;
        return true;
    }

    // setter nilai teori
    public boolean setNilaiTeori(double nilai) {
        if (!isValid(nilai)) {
            System.out.println("[DITOLAK] Nilai teori " + nilai + " tidak valid (harus 0-100).");
            return false;
        }
        this.nilaiTeori = nilai;
        return true;
    }

    // setter nilai proyek
    public boolean setNilaiProyek(double nilai) {
        if (!isValid(nilai)) {
            System.out.println("[DITOLAK] Nilai proyek " + nilai + " tidak valid (harus 0-100).");
            return false;
        }
        this.nilaiProyek = nilai;
        return true;
    }

    // cek validitas nilai 0-100
    private boolean isValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    // menghitung nilai akhir dengan bobot: praktik 40%, teori 30%, proyek 30%
    public double hitungNilaiAkhir() {
        return nilaiPraktik *0.4 + nilaiTeori * 0.3 + nilaiProyek * 0.3;
    }
    
    // menentukan status kelulusan
    public boolean isLulus() {
        boolean semuaKomponenCukup = nilaiPraktik >= 60 && nilaiTeori >= 60 && nilaiProyek >= 60;
        return hitungNilaiAkhir() >= 70 && semuaKomponenCukup;
    }

    // cetak info
    public void cetakInfo() {
        System.out.println("Nama          : " + nama);
        System.out.println("Nilai Praktik : " + nilaiPraktik);
        System.out.println("Nilai Teori   : " + nilaiTeori);
        System.out.println("Nilai Proyek  : " + nilaiProyek);
        System.out.printf("Nilai Akhir   : %.2f%n", hitungNilaiAkhir());
        System.out.println("Status        : " + (isLulus() ? "LULUS" : "TIDAK LULUS"));
    }
}