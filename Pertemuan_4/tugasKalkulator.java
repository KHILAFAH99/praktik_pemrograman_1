package Pertemuan_4;
// mengambil class import
import java.util.Scanner;

class tugaskalkulator{
    public static void main(String[] args) {

        // Penjelasan Fungsi Kalkulator
        System.out.println("======================================");
        System.out.println("SELAMAT DATANG DI SISTEM KALKULATORMU");
        System.out.println("======================================");
        System.out.println("Kalulator sederhana ini akan menghitung hasil dari operasi: ");
        System.out.println("a. Tambah");
        System.out.println("b. Kurang");
        System.out.println("c. Kali");
        System.out.println("d. Bagi" + " (disertai hasil sisa bagi)");
        System.out.println();
        System.out.println("Pengguna hanya perlu memasukan dua buah angka yang akan di operasikan");
        System.out.println();

        // Membuat sistem Input
        Scanner myScanner = new Scanner(System.in); // Object Scanner untuk input

        System.out.print("Masukkan Angka Pertama: "); // Input 1
        int a = myScanner.nextInt();
        System.out.print("Masukkan Angka Kedua  : "); // Input 2
        int b = myScanner.nextInt();

        // Operasi hitung diberikan dalam masing masing variabel
        int operasiTambah  = a + b;
        int operasiKurang  = a - b;
        int operasiKali    = a * b;
        int operasiModulus = a % b;
        double aCast       = a; // Ubah type data int ke double untuk operasi pembagian
        double bCast       = b;
        double operasiBagi = aCast / bCast;
        

        // Output berupa hasil operasi dari dua buah bilangan yang di berikan oleh pengguna 
        System.out.println("========================================================");
        System.out.println("Berikut adalah hasil dari operasi hitung yang tersedia:");
        System.out.println("========================================================");
        System.out.println();
        System.out.println(a + " + " + b + " = " + operasiTambah);
        System.out.println(a + " - " + b + " = " +  operasiKurang);
        System.out.println(a + " x " + b + " = " +  operasiKali);
        System.out.println(aCast + " / " + bCast + " = " +  operasiBagi + " sisa " + operasiModulus );
        System.out.println();
        System.out.println("================================================");
        System.out.println("Terima kasih telah menggunakan KALKULATORMU >_< ");
        System.out.println("================================================");
        System.out.println();

    }
}

