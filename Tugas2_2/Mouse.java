public class Mouse {
    public String merek;
    public String bentuk;
    public String warna;
    public int jumlahTombol;
    public String jenisKoneksi;

    public void memindahkanKursor() {
        System.out.println("Kursor berpindah mengikuti gerakan mouse");
    }

    public void mengklik() {
        System.out.println("Tombol mouse diklik");
    }

    public void menggulung() {
        System.out.println("Scroll wheel digulung");
    }

    public void mengubahSensitivitas() {
        System.out.println("Sensitivitas mouse diubah");
    }
}