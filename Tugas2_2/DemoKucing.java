public class DemoKucing {
    public static void main(String[] args) {

        // pakai constructor tanpa berparameter
        Kucing meng = new Kucing();
        System.out.println("=== Kucing dari konstruktor tanpa parameter ===");
        meng.makan();
        
        // pakai constructor berparameter
        Kucing kucing1 = new Kucing("Cuking", "Oren", "Anggora", 2, 4.5);
        System.out.println("\n=== Kucing dari constructor berparameter ===");
        kucing1.makan();
        kucing1.tidur();
        kucing1.mengeong();
        kucing1.bermain();
    }
}