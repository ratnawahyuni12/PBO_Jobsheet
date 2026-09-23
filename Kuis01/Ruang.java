package Kuis01;

public class Ruang {
    private String idRuang;
    private String namaRuang;
    private int kapasitas;
    private boolean tersedia;

    // constructor
    public Ruang(String idRuang, String namaRuang, int kapasitas) {
        this.idRuang = idRuang;
        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
        this.tersedia = true; // kondisi awal selalu tersedia
    }

    // getter
    public String getIdRuang() {
        return idRuang;
    }

    public String getNamaRuang() {
        return namaRuang;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    // setter
    // setter nama ruang
    public void setNamaRuang(String namaRuangBaru) {
        this.namaRuang = namaRuangBaru;
        System.out.println("[OK] Nama ruang " + idRuang + " diperbarui menjadi " + namaRuangBaru + ".");
    }

    // setter kapasitas
    public void setKapasitas(int kapasitasBaru) {
        if (kapasitasBaru <= 0) {
            System.out.println("[GAGAL] Update kapasitas " + idRuang + ": kapasitas harus lebih dari 0.");
            return;
        }
        this.kapasitas = kapasitasBaru;
        System.out.println("[OK] Kapasitas ruang " + idRuang + " diperbarui menjadi " + kapasitasBaru + ".");
    }

    // mengubah status tersedia menjadi dipesan
    public boolean pesan(int jumlahPeserta) {
        if (jumlahPeserta <= 0) {
            System.out.println("[DITOLAK] Pemesanan " + idRuang + ": jumlah peserta harus lebih dari 0 (input=" + jumlahPeserta + ").");
            return false;
        }
        if (!tersedia) {
            System.out.println("[DITOLAK] Pemesanan " + idRuang + ": ruang sudah dipesan.");
            return false;
        }
        if (jumlahPeserta > kapasitas) {
            System.out.println("[DITOLAK] Pemesanan " + idRuang + ": jumlahPeserta (" + jumlahPeserta + ") melebihi kapasitas (" + kapasitas + ").");
            return false;
        }
        tersedia = false;
        System.out.println("[BERHASIL] Ruang " + idRuang + " dipesan untuk " + jumlahPeserta + " peserta.");
        return true;
    }

    // membatalkan ruang
    public boolean batalkan() {
        if (tersedia) {
            System.out.println("[DITOLAK] Pembatalan " + idRuang + ": ruang masih tersedia, belum dipesan.");
            return false;
        }
        tersedia = true;
        System.out.println("[BERHASIL] Pemesanan ruang " + idRuang + " dibatalkan.");
        return true;
    }

    // cetak info
    public void cetakInfo() {
        System.out.println ("ID Ruang     : " + idRuang);
        System.out.println ("Nama Ruang   : " + namaRuang);
        System.out.println ("Kapasitas    : " + kapasitas);
        System.out.println ("Status       : " + (tersedia ? "Tersedia" : "Dipesan"));
    }
}