// panggil function input
import java.util.Scanner;

public class tugasKe7 {
    public static void main(String[] args) {

        // buat obj scanner baru
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int x = scan.nextInt();

        // kondisi perulangan
        int count = 0;
        if (x % 2 == 1) {
            for (int i = (x/2)+1; i > 1 ; i--){
                for (int j = x; j > i -1; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= (i*2)-2; k++) {
                    System.out.print("*");                    
                }
                System.out.println();
            }
            for (int i = 1; i <= (x/2)+1; i++) {
                for (int j = i; j <= x; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= (i*2)-2; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = (x/2)+1; i > 1 ; i--){
                for (int j = x; j > i -1; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= (i*2)-2; k++) {
                    if (k == i - 1) {
                        System.out.print("-");
                    } else {
                        System.out.print("*");
                    }                   
                }
                System.out.println();
            }
            for (int i = 1; i <= (x/2)+1; i++) {
                for (int j = i; j <= x; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= (i*2)-2; k++) {
                    if (k == i - 1) {
                        System.out.print("-");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}