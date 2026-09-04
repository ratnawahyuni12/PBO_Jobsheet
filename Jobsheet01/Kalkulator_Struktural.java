package Jobsheet01;

import java.util.Scanner;

public class Kalkulator_Struktural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input angka1, operator, angka2
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        String operator = input.next(); // pakai .next() karena operatornya hanya 1 karakter

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        // hitung hasil sesuai operator yang dipilih
        double hasil = hitung(angka1, operator, angka2);

        // tampilkan hasil ke layar
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);

        input.close();
    }

    // method: menghitung hasil operasi berdasarkan operator yang diberikan
    public static double hitung(double angka1, String operator, double angka2) {
        double hasil = 0;

        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            case "/":
                hasil = angka1 / angka2;
                break;
            case "%":
                hasil = angka1 % angka2;
                break;
            default:
                System.out.println("Operator tidak dikenali!");
        }

        return hasil;
    }
}