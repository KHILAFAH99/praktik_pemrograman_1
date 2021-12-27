
import java.util.Scanner;

public class Main_siakad {
    public static void main(String[] args) {
        Menu func = new Menu();
        int menu = 0;

        while(menu != 7){
            menu = tampilMenu();

            if(menu == 1){
                func.tambahData();
            }
            else if(menu == 2) {
                func.lihatData();
            }
            else if(menu == 3){
                func.hapusData();
            }
            else if(menu == 4) {
                func.editData();
            }
            else if(menu == 5) {
                func.cariData();
            }
            else if(menu == 6) {
                func.rerataIPK();
            }
        }
    }
        
    public static int tampilMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("=== MENU ===");
        System.out.println("1. Tambah data");
        System.out.println("2. Lihat data");
        System.out.println("3. Hapus data");
        System.out.println("4. Edit data");
        System.out.println("5. Cari data");
        System.out.println("6. Rerata IPK");
        System.out.println("7. Keluar");
        System.out.println();
        System.out.print("Pilih menu = ");
        int menu = scan.nextInt();
        return menu;
    }   
}