public class Handphone {
    public String merek;
    public String warna;
    public int kapasitasBaterai;
    public double ukuranLayar;
    public String jenisJaringan;

    public void menelepon() {
        System.out.println("Sedang melakukan panggilan telepon");
    }

    public void mengirimPesan() {
        System.out.println("Pesan berhasil dikirim");
    }

    public void mengambilFoto() {
        System.out.println("Foto berhasil diambil");
    }

    public void mengisiDaya() {
        System.out.println("Baterai sedang diisi daya");
    }
}