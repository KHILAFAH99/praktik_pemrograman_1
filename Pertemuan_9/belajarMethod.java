package Pertemuan_9;
import java.util.Scanner;

public class belajarMethod {
    public static void main(String[] args) {
        
        double x, y;
        Scanner inputNew = new Scanner(System.in);

            System.out.println("Masukan Nilai X = ");
                x = inputNew.nextDouble();
            System.out.println("Masukan Nilai y = ");
                y = inputNew.nextDouble();
        
        fungsiTambah(x, y);
        fungsiKurang(x, y);
        fungsiKali(x, y);
    }
        
    public static void fungsiTambah(double x, double y ){
        System.out.println("Hasil Tambah : " + (x+y));
        System.out.println();
    }
    public static void fungsiKurang(double x, double y ){
        System.out.println("Hasil Kurang: " + (x-y));
        System.out.println();
    }
    public static void fungsiKali(double x, double y ){
        System.out.println("Hasil Kali: " + (x*y));
        System.out.println();
    }
}
