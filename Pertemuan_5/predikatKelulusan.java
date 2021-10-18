package Pertemuan_5;

// Panggil Function Input
import java.util.Scanner;

public class predikatKelulusan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // deklarasikan Variable input ipk
        System.out.print("Masukan IPK Anda = ");
        double ipk = scanner.nextDouble();

        // deklarasikan Variable input waktuStudi
        System.out.print("Masukan waktu studi = ");
        double waktuStudi = scanner.nextDouble();

        // Program untuk menyatakan sebuah konsidi yang akan di jalankan
        if (ipk >= 3.51 && ipk <= 4 && waktuStudi <= 4) {
            System.out.println("Selamat Anda Meraih Predikat Summa Cumlaude");
        }else if (ipk >= 3.51 && ipk <= 4 && waktuStudi > 4)  {
            System.out.println("Selamat Anda Meraih Predikat Cumlaude");
        }else if (ipk >= 3.01 && ipk < 3.51)  {
            System.out.println("IPK Anda Sangat Memuaskan");
        }else if (ipk >= 2.76 && ipk < 3.01)  {
            System.out.println("IPK Anda Memuaskan");
        }else if (ipk >= 2.00 && ipk < 2.76 ) {
            System.out.println("IPK Anda Cukup");   
        }else if (ipk < 2.00) {
            System.out.println("Anda Tidak Lulus");
        }else {
            System.out.println("Tidak Valid");
        }
    }
}
    
