public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang();
        p1.panjang = 10;
        p1.lebar = 5;

        p1.displayInfo();
        System.out.println("Luas     : " + p1.getLuas());
        System.out.println("Keliling : " + p1.getKeliling());
    }
}