

public class Login extends Menu{

    Data_akun[] akun = new Data_akun[1000];
    Input input = new Input();
    int jumlahAkun = 0;

    public int tampilMenu() {
        System.out.println();
        System.out.println();
        System.out.println("  ★ |================ |  M E N U  H O M E  S I A K A D  | ==============| ★");
        System.out.println();
        System.out.println("  1 |-------------------------- | Tambah Data | ------------------------| 1 ");
        System.out.println("  2 |-------------------------- | Lihat Data  | ------------------------| 2 ");
        System.out.println("  3 |-------------------------- | Edit Data   | ------------------------| 3 ");
        System.out.println("  4 |-------------------------- | Cari Data   | ------------------------| 4 ");
        System.out.println("  5 |-------------------------- | Hapus Data  | ------------------------| 5 ");
        System.out.println("  6 |-------------------------- | Kembali     | ------------------------| 6 ");
        System.out.println("  0 |-------------------------- | Keluar      | ------------------------| 0 ");
        System.out.println();
        int menu = input.Int("  Pilih Nomor Menu : ---------------------------------------------------| ");
        return menu;
    }
    
    public void runSistem(){
        int menu = 100;
        while(menu != 0){
            menu = tampilMenu();
            if(menu == 1){
                tambahData();
            }
            else if(menu == 2) {
                lihatData();
            }
            else if(menu == 3){
                editData();
            }
            else if(menu == 4) {
                cariData();
            }
            else if(menu == 5) {
                hapusData();
            }
            else if(menu == 6){
                pageLogin();
                break;
            }
            else if(menu < 0 || menu > 6){
                System.out.println("      # Menu Tidak tersedia! ):");
            }
        }
    }

    public int menuAkses(){
        System.out.println();
        System.out.println("  ★ |====================== |  M E N U  A K S E S | ====================| ★");
        System.out.println();
        System.out.println("  1 |--------------------------- | Login     | -------------------------| 1 ");
        System.out.println("  2 |--------------------------- | Buat akun | -------------------------| 2 ");
        System.out.println("  0 |--------------------------- | Keluar    | -------------------------| 0 ");
        System.out.println();
        int pilihMenu = input.Int("  Pilih Nomor Menu Akses: ----------------------------------------------| ");
        System.out.println();
        return pilihMenu;
    }

    public void pageLogin(){
        int pilihMenu = 100;
        
        while (pilihMenu != 0){
            pilihMenu = menuAkses();

            if(pilihMenu == 1){
                loginAkun();
                break;
            }
            else if(pilihMenu == 2){
                buatAkun();
                break;
            }
            else if (pilihMenu > 2 || pilihMenu < 0){
                System.out.println("      # Menu Tidak tersedia! ):");
            }
        }
    }

    public void buatAkun(){
        System.out.println();
        System.out.println("  :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("  :: >>>>>>>>>>>>>>>>>>>>>>>>>>> | BUAT AKUN | <<<<<<<<<<<<<<<<<<<<<<<<< ::");
        System.out.println("  :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println();

        String userName =  input.String("      User Name    : ");
        String email = input.String    ("      Email        : ");
        String passwd = input.Pass     ("      Password     : ");

        Data_akun tambahAkun = new Data_akun(userName, passwd, email);
        akun[jumlahAkun] = tambahAkun;
        jumlahAkun++;
        
        System.out.println();
        System.out.println("  ✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓  Akun Berhasil Dibuat! Silahkan Login  ✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓" );
        System.out.println();
        pageLogin();
    }

    public void loginAkun(){
        System.out.println();
        System.out.println("  :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("  :: >>>>>>>>>>>>>>>>>>>>>>>>>>> | LOGIN AKUN | <<<<<<<<<<<<<<<<<<<<<<<< ::");
        System.out.println("  :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println();

        String email = input.String("      Email        : ");
        String pass = input.Pass   ("      Password     : ");

        
        int indexEmail = indexEmail(email);
        int indexPass = indexPass(pass);

        if (indexPass == -1 || indexEmail == -1){
            failLogin();
        }
        else {
            String cekEmail = akun[indexEmail].getEmail();
            String cekPass = akun[indexPass].getPass();
            if (cekEmail.equalsIgnoreCase(email) && cekPass.equals(pass)){
                System.out.println();
                System.out.println();
                System.out.println("  ✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓  Berhasil Login  ✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓✓" );
                runSistem();
            }
            else{
                System.out.println("      # User / Password Salah");
                failLogin();
            }
        }
    }

    public int menuLoginApa() {
        System.out.println();
        System.out.println("  ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠   !!! Login Gagal !!!  ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ");
        System.out.println();
        System.out.println();
        System.out.println("  1 | -------------------------- | Coba Lagi | ------------------------ | 1 ");
        System.out.println("  2 | -------------------------- | Buat akun | ------------------------ | 2 ");
        System.out.println("  0 | -------------------------- | Keluar    | ------------------------ | 0 ");
        System.out.println();
        int menuApa = input.Int("  Pilih Nomor Menu Akses: ----------------------------------------------| ");
        System.out.println();
        return menuApa;
    }

    public void failLogin(){
        int menuLogin = 100;

        while(menuLogin != 0){
            menuLogin = menuLoginApa();
            if (menuLogin == 1){
                loginAkun();
                break;
            }
            else if (menuLogin == 2){
                buatAkun();
                break;
            }
            else if (menuLogin < 0 || menuLogin > 2){
                System.out.println("      # Menu Tidak tersedia! ):");
            }
        }
    }

    public void bannerProgram(){
        System.out.println("||========================================================================||");
        System.out.println("||========================================================================||");
        System.out.println("||========================== SISTEM INFORMASI AKADEMIK ===================||");
        System.out.println("||========================================================================||");
        System.out.println("||========================================================================||");
        System.out.println();
    }

    public void urlUser(){
        String url = "  " + "https://siakad.uny.ac.id/user/login" + "  ";
        System.out.println();
        System.out.println("+---+---+---+-----------------------------------------+---+");
        System.out.println( "| " + "⬅" + " | " + "→" + " | " + "⟳" + " | " + url + " | " + "★" + " | ");
        System.out.println("+---+---+---+-----------------------------------------+---+");
        System.out.println();
    }

    public int indexUser(String user){
        for(int i = 0; i < jumlahAkun; i++){
            if(akun[i].getUserName().equals(user)){
                return i;
            }
        }
        return -1;
    }

    public int indexPass(String pass){
        for(int i = 0; i < jumlahAkun; i++){
            if(akun[i].getPass().equals(pass)){
                return i;
            }
        }
        return -1;
    }

    public int indexEmail(String email){
        for(int i = 0; i < jumlahAkun; i++){
            if(akun[i].getEmail().equalsIgnoreCase(email)){
                return i;
            }
        }
        return -1;
    }
}
