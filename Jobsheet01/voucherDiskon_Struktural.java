package Jobsheet01;

public class voucherDiskon_Struktural {
    public static void main(String[] args) {
        
        // deklarasi variabel untukk 10 objek voucher diskon
        double potonganPersen, potonganPersen2, potonganPersen3, potonganPersen4, potonganPersen5,
               potonganPersen6, potonganPersen7, potonganPersen8, potonganPersen9,potonganPersen10;
        int tanggalBerlaku, tanggalBerlaku2, tanggalBerlaku3, tanggalBerlaku4, tanggalBerlaku5,
            tanggalBerlaku6, tanggalBerlaku7, tanggalBerlaku8, tanggalBerlaku9, tanggalBerlaku10;
        String tempatBerlaku, tempatBerlaku2, tempatBerlaku3, tempatBerlaku4, tempatBerlaku5,
               tempatBerlaku6, tempatBerlaku7, tempatBerlaku8, tempatBerlaku9, tempatBerlaku10;
        
        // inisialisasi 10 objek voucher diskon
        potonganPersen = 10.0;
        tanggalBerlaku = 30; // berlaku 30 hari lagi
        tempatBerlaku = "Indomaret";

        potonganPersen2 = 15.0;
        tanggalBerlaku2 = 15;
        tempatBerlaku2 = "Alfamart";

        potonganPersen3 = 5.0;
        tanggalBerlaku3 = 7;
        tempatBerlaku3 = "Tokopedia";

        potonganPersen4 = 20.0;
        tanggalBerlaku4 = 45;
        tempatBerlaku4 = "Shopee";

        potonganPersen5 = 12.5;
        tanggalBerlaku5 = 10;
        tempatBerlaku5 = "KFC";

        potonganPersen6 = 25.0;
        tanggalBerlaku6 = 20;
        tempatBerlaku6 = "McDonald's";

        potonganPersen7 = 8.0;
        tanggalBerlaku7 = 14;
        tempatBerlaku7 = "Gramedia";

        potonganPersen8 = 30.0;
        tanggalBerlaku8 = 60;
        tempatBerlaku8 = "Uniqlo";

        potonganPersen9 = 10.0;
        tanggalBerlaku9 = 5;
        tempatBerlaku9 = "Starbucks";

        potonganPersen10 = 40.0;
        tanggalBerlaku10 = 90;
        tempatBerlaku10 = "Traveloka";

        // hitung harga setelah diskon dan perpanjang masa berlaku
        double hargaSetelahDiskon = hitungHargaSetelahDiskon(100000, potonganPersen);   // memanggil method hitungHargaSetelahDiskon, lalu memberinya 2 informasi yaitu 10000 dan potonganPersen. lalu disimpan hasilnya ke variabel baru bernama hargaSetelahDiskon
        double hargaSetelahDiskon2 = hitungHargaSetelahDiskon(150000, potonganPersen2);

        tanggalBerlaku = perpanjanganMasaBerlaku(tanggalBerlaku, 10);  // ambil nilai tanggalBerlaku sekarang ditambah 10 hari, terus timpa nilai lama tanggalBerlaku dengan hasil barunya
        tanggalBerlaku2 = perpanjanganMasaBerlaku(tanggalBerlaku2, 5);

        // cetak hasil semua voucher ke layar
        System.out.println("Tempat: " + tempatBerlaku + " | Diskon: " + potonganPersen + "% | Berlaku: " + tanggalBerlaku + " hari lagi | Harga Setelah diskon (dari 100000): " + hargaSetelahDiskon);
        System.out.println("Tempat: " + tempatBerlaku2 + " | Diskon: " + potonganPersen2 + "% | Berlaku: " + tanggalBerlaku2 + " hari lagi | Harga Setelah diskon (dari 150000): " + hargaSetelahDiskon2);
        System.out.println("Tempat: " + tempatBerlaku3 + " | Diskon: " + potonganPersen3 + "% | Berlaku: " + tanggalBerlaku3);
        System.out.println("Tempat: " + tempatBerlaku4 + " | Diskon: " + potonganPersen4 + "% | Berlaku: " + tanggalBerlaku4);
        System.out.println("Tempat: " + tempatBerlaku5 + " | Diskon: " + potonganPersen5 + "% | Berlaku: " + tanggalBerlaku5);
        System.out.println("Tempat: " + tempatBerlaku6 + " | Diskon: " + potonganPersen6 + "% | Berlaku: " + tanggalBerlaku6);
        System.out.println("Tempat: " + tempatBerlaku7 + " | Diskon: " + potonganPersen7 + "% | Berlaku: " + tanggalBerlaku7);
        System.out.println("Tempat: " + tempatBerlaku8 + " | Diskon: " + potonganPersen8 + "% | Berlaku: " + tanggalBerlaku8);
        System.out.println("Tempat: " + tempatBerlaku9 + " | Diskon: " + potonganPersen9 + "% | Berlaku: " + tanggalBerlaku9);
        System.out.println("Tempat: " + tempatBerlaku10 + " | Diskon: " + potonganPersen10 + "% | Berlaku: " + tanggalBerlaku10);
    }
    
    // method 1: menghitung akhir harga setelah dipotong diskon persen
    public static double hitungHargaSetelahDiskon(double hargaAwal, double persen) {
        return hargaAwal - (hargaAwal * persen / 100);
    }

    // method 2: 
    public static int perpanjanganMasaBerlaku(int hari, int tambahanHari) {
        hari += tambahanHari;
        return hari;
    }
}