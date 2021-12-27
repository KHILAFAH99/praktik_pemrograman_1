package Pertemuan_6;

// panggil function input
import java.util.Scanner;

public class tugasKe6 {
    public static void main(String[] args) {
        // buat obj input baru
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Masukan deret maksimal yang akan ditampilkan = ");
        int n = scanner.nextInt();

        // kondisi perulangan
        int i = 0;
        int x = 0;
        while (i != n) {
            if (i == Math.pow(5, x)) {
                System.out.println(i);
                x++;
    
            }
            i++;
        }
    }
}