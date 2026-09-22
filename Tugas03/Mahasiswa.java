package Tugas03;

public class Mahasiswa {
    // semua atribut private (enkapsulasi)
    private String nim;
    private String nama;
    private String alamat;
    private double ipk;

    // constructor berparameter (menggunakan this)
    public Mahasiswa (String nim, String nama, String alamat, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        setIpk(ipk);
    }

    // getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getIpk() {
        return ipk;
    }

    // setter
    // NIM sengaja tidak memiliki setter = read only
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setIpk(double ipk) {
        if (ipk < 0.00 || ipk > 4.00) {
            System.out.println("IPK tidak valid! Harus di antara 0.00 - 4.00. Nilai diabaikan.");
            return;
        }
        this.ipk = ipk;
    }

    // method tampilkan data
    public void tampilkanData() {
        System.out.println("NIM       : " + getNim());
        System.out.println("Nama      : " + getNama());
        System.out.println("Alamat    : " + getAlamat());
        System.out.println("IPK       : " + getIpk());
        System.out.println("-------------------------");
    }
}