public class Kucing {
    public String nama;
    public String warna;
    public String jenis;
    public int umur;
    public double berat;

    // constructor tanpa parameter
    public Kucing() {
        nama = "Meng";
        warna = "Abu-abu";
        jenis = "Domestik";
        umur = 1;
        berat = 2.5;
    }

    // constructor berparameter
    public Kucing(String nama, String warna, String jenis, int umur, double berat) {
        this.nama = nama;
        this.warna = warna;
        this.jenis = jenis;
        this.umur = umur;
        this.berat = berat;
    }

    public void makan() {
        System.out.println(nama + " sedang makan");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur");
    }

    public void mengeong() {
        System.out.println(nama + " mengeong: Meong!");
    }

    public void bermain() {
        System.out.println(nama + " sedang bermain");
    }
}