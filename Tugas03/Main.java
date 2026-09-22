package Tugas03;

public class Main {
    public static void main(String[] args) {
        // membuat 2 objek mahasiswa dan menampilkan data
        Mahasiswa m1 = new Mahasiswa("2341760001", "Nana", "Cikarang, Jawa Timur", 3.75);
        Mahasiswa m2 = new Mahasiswa("2341760002", "Rangga", "Malang, Jawa Timur", 3.20);

        // menampilkan data menggunakan getter
        m1.tampilkanData();
        m2.tampilkanData();

        // mengubah data menggunakan setter
        System.out.println("Data setelah diubah: ");
        m1.setNama("Ratna Wahyuni");
        m1.setAlamat("Bekasi, Jawa Barat");
        m1.setIpk(3.90);
        m1.tampilkanData();

        // mencoba akses atribut private secara langsung
        // m1.nim = "0000000000";

        // menguji validasi ipk (harus 0.00 - 4.00)
        System.out.println("Uji Validasi IPK:");
        m2.setIpk(4.50);
        m2.setIpk(-1.00);
        m2.tampilkanData(); // ipk m2 harusnya tetap 3.20
    }
}