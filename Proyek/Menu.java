
public class Menu {

    private int jumlahData;
    Data_Mahasiswa[] m = new Data_Mahasiswa[1000];
    Input input = new Input();

    // FUNGSI MENU TAMBAH DATA

    public void tambahData(){
        System.out.println();
        System.out.println("  :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("  :: >>>>>>>>>>>>>>>>>>>>>>>>>>> | TAMBAH DATA | <<<<<<<<<<<<<<<<<<<<<<< ::");
        System.out.println("  :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println();

        String nama = input.String       ("      Nama           : ");
        String nim = input.String        ("      NIM            : ");
        int semester = input.Int         ("      Semester       : ");
        double ipk = input.Double        ("      IPK            : ");
        double tinggiBadan = input.Double("      Tinggi Badan   : ");

        Data_Mahasiswa tambahMahasiswa = new Data_Mahasiswa(nim, nama, ipk, semester);
        tambahMahasiswa.setTinggiBadan(tinggiBadan);
        m[jumlahData] = tambahMahasiswa;
        jumlahData++;
        
        int index = noIndexNama(nama);
        String namaOut = m[index].getNama();

        System.out.println();
        System.out.println("      # Data " + namaOut + " Berhasil Ditambahkan! ^_^ ");
        System.out.println();
        lihatSeluruhData();
    }


    // FUNGSI MENU LIHAT DATA

    public int tampilLihatApa(){
        System.out.println();
        System.out.println();
        System.out.println("  ★ |================ |  M E N U  L I H A T  D A T A  | ================| ★");
        System.out.println();
        System.out.println("  1 |---------------- | Lihat Seluruh Data            | ----------------| 1 ");
        System.out.println("  2 |---------------- | Lihat Berdasar IPK            | ----------------| 2 ");
        System.out.println("  3 |---------------- | Lihat Berdasar Semester       | ----------------| 3 ");
        System.out.println("  4 |---------------- | Lihat Berdasar Semester & IPK | ----------------| 3 ");
        System.out.println("  0 |---------------- | Kembali                       | ----------------| 0 ");
        System.out.println();
        int menu = input.Int("  Pilih Nomor Menu : ---------------------------------------------------| ");
        System.out.println();
        return menu;
    }

    public void lihatData(){
        if (jumlahData == 0){
            System.out.println();
            System.out.println("      # Data Kosong ");
            System.out.println();
        }
        else{
            int menu = 100;
            while(menu !=0){
                menu = tampilLihatApa();

                if (menu == 1){
                    lihatSeluruhData();
                    sortSeluruhData();
                }
                else if (menu == 2){
                    cariDataIpkMulti();
                }
                else if (menu == 3){
                    cariDataSemesterMulti();
                }
                else if(menu == 4){
                    cariDataIpkSemester();
                }
                else if(menu > 4 || menu < 0){
                    System.out.println("      # Menu Tidak tersedia! ):");
                }
            }
        }
    }

    public void lihatSeluruhData() {
        System.out.println("      # Berikut Seluruh Data Terkini: ");
        m[0].getHeader();
        for (int i = 0; i < jumlahData ; i++){
            m[i].getDetail();
        }
        m[0].getFooter();
        
        rerataIPK();
    }

    public void sortSeluruhData(){
        int menu = 100;
        while (menu != 0){
            menu = InputSortingOrNo();
            if (menu == 1){
                menuSortData();
                break;
            }
            else if(menu > 1 || menu < 0){
                System.out.println("      # Menu Tidak tersedia! ):");
            }
        }
    }

    public int InputSortingOrNo(){
        System.out.println();
        System.out.println();
        System.out.println("  1 |------------------------- | Urutkan Data | ------------------------| 1 ");
        System.out.println("  0 |------------------------- | Kembali      | ------------------------| 0 ");
        System.out.println();
        int menu = input.Int("  Pilih Nomor Menu : ---------------------------------------------------| ");
        System.out.println();
        return menu;
    }
    
    public void tabelDetail(int index){
        m[0].getHeader();
        m[index].getDetail();
        m[0].getFooter();
    }



    // FUNGSI MENU CARI DATA

    public int tampilCariApa(){
        System.out.println();
        System.out.println();
        System.out.println("  ★ |================= |  M E N U  C A R I  D A T A | ==================| ★");
        System.out.println();
        System.out.println("  1 |---------------- | Cari Data Dengan NIM          | ----------------| 1 ");
        System.out.println("  2 |---------------- | Cari Data Dengan Nama         | ----------------| 2 ");
        System.out.println("  3 |---------------- | Cari Data Dengan IPK          | ----------------| 3 ");
        System.out.println("  4 |---------------- | Cari Data Semester            | ----------------| 4 ");
        System.out.println("  5 |---------------- | Cari Data Dengan Tinggi Badan | ----------------| 5 ");
        System.out.println("  0 |---------------- | Kembali                       | ----------------| 0 ");
        System.out.println();
        int menu = input.Int("  Pilih Nomor Menu : ---------------------------------------------------| ");
        System.out.println();
        return menu;
    }

    public void cariData(){
        int cariApa = 100;

        while (cariApa != 0){
            cariApa = tampilCariApa();

            if (cariApa == 1){
                cariDataNim();
            }
            else if (cariApa == 2){
                cariDataNama();
            }
            else if(cariApa == 3){
                cariDataIpkMulti();
            }
            else if(cariApa == 4){
                cariDataSemesterMulti();
            }
            else if(cariApa == 5){
                cariDataTinggiMulti();
            }
            else if (cariApa > 5 || cariApa < 0){
                System.out.println("      # Menu Tidak tersedia! ):");
            }
        }

    }

    public void cariDataNama(){
        System.out.println();
        System.out.println("      # Masukan Nama Untuk Mencari Data ");
        System.out.println();
        String cariNama = input.String("            Nama  :  ");
        int index = noIndexNama(cariNama);
        System.out.println();
        System.out.println();

        if (index == -1){
            System.out.println("      # Data Tidak Ditemukan! ):");
        }
        else {
            System.out.println("      # Berikut Data Mahasiwa Yang Tersedia:  ");
            System.out.println();
            tabelDetail(index);
        }
    }

    public void cariDataNim(){
        System.out.println();
        System.out.println("      # Masukan NIM Untuk Mencari Data ");
        System.out.println();
        String cariNim = input.String("            NIM  :  ");
        System.out.println();
        System.out.println();
        int index = noIndexNim(cariNim);

        if (index == -1){
            System.out.println("      # Data Tidak Ditemukan! ):");
        }
        else {
            System.out.println("      # Berikut Data Mahasiwa Yang Tersedia:  ");
            System.out.println();
            tabelDetail(index);
        }
    }

    public void cariDataIpkSemester(){
        System.out.println();
        System.out.println("      # [ Semester ≥ Data ≤ Semester ] ");
        System.out.println();
        int cariAwalSem = input.Int       ("         Rentang Semester Awal  :  ");
        System.out.println                ("                  s/d      ");
        int cariAkhirSem = input.Int      ("         Rentang Semester Akhir :  ");
        System.out.println();

        System.out.println();
        System.out.println("      # [ IPK ≥ Data ≤ IPK ] ");
        System.out.println();
        Double cariAwalIpk = input.Double ("         Rentang IPK Awal       :  ");
        System.out.println                ("               s/d      ");
        Double cariAkhirIpk = input.Double("         Rentang IPK Akhir      :  ");
        System.out.println();

        System.out.println();
        System.out.println("      # Berikut Data Mahasiswa Yang Tersedia :");
        System.out.println();

        m[0].getHeader();
        double totalIPK  = 0.0;
        int data = 0;

        for (int i = 0; i < jumlahData ; i++){
            if (m[i].getIpk() >= cariAwalIpk && m[i].getIpk() <= cariAkhirIpk && m[i].getSemester() >= cariAwalSem && m[i].getSemester() <= cariAkhirSem == true){
                data++;
                sortDataByIpk(i);
                m[i].getDetail();
                totalIPK += m[i].getIpk();
            }
        }
        m[0].getFooter();
        rerataIPK(totalIPK, data);
    }

    public void cariDataIpkMulti(){
        System.out.println();
        System.out.println("      # [ IPK ≥ Data ≤ IPK ] ");
        System.out.println();
        Double cariAwal = input.Double ("         Rentang IPK Awal  :  ");
        System.out.println             ("               s/d      ");
        Double cariAkhir = input.Double("         Rentang IPK Akhir :  ");
        System.out.println();
        System.out.println();

        System.out.println("      # Berikut Data Mahasiswa Yang Tersedia Antara IPK " + cariAwal + " s/d IPK " + cariAkhir + " :");
        System.out.println();

        double totalIPK  = 0.0;
        int data = 0;

        m[0].getHeader();
        for (int i = 0; i < jumlahData ; i++){
            if (m[i].getIpk() >= cariAwal && m[i].getIpk() <= cariAkhir){
                data++;
                sortDataByIpk(i);
                m[i].getDetail();
                totalIPK += m[i].getIpk();
            }
        }
        m[0].getFooter();
        rerataIPK(totalIPK, data);
    }

    public void cariDataSemesterMulti(){
        System.out.println();
        System.out.println("      # [ Semester ≥ Data ≤ Semester ] ");
        System.out.println();
        int cariAwal = input.Int ("         Rentang Semester Awal  :  ");
        System.out.println       ("                  s/d      ");
        int cariAkhir = input.Int("         Rentang Semester Akhir :  ");
        System.out.println();
        System.out.println();

        System.out.println("      # Berikut Data Mahasiswa Yang Tersedia Antara Semester " + cariAwal + " s/d " + cariAkhir + " :");
        System.out.println();

        double totalIPK  = 0.0;
        int data = 0;

        m[0].getHeader();
        for (int i = 0; i < jumlahData ; i++){
            if (m[i].getSemester() >= cariAwal && m[i].getSemester() <= cariAkhir){
                data++;
                sortDataBySemester(i);
                m[i].getDetail();
                totalIPK += m[i].getIpk();
            }
        }
        m[0].getFooter();
        rerataIPK(totalIPK, data);
    }

    public void cariDataTinggiMulti(){
        System.out.println();
        System.out.println("      # [ Tinggi Badan ≥ Data ≤ Tinggi Badan ] ");
        System.out.println();
        int cariAwal = input.Int ("         Rentang Tinggi Awal  :  ");
        System.out.println       ("                  s/d      ");
        int cariAkhir = input.Int("         Rentang Tinggi Akhir :  ");
        System.out.println();
        System.out.println();

        System.out.println("      # Berikut Data Mahasiswa Yang Tersedia Antara Tinggi " + cariAwal + " s/d " + cariAkhir + " :");
        System.out.println();

        double totalTinggi  = 0.0;
        int data = 0;

        m[0].getHeader();
        for (int i = 0; i < jumlahData ; i++){
            if (m[i].getTinggiBadan() >= cariAwal && m[i].getTinggiBadan() <= cariAkhir){
                data++;
                sortDataByTinggi(i);
                m[i].getDetail();
                totalTinggi += m[i].getTinggiBadan();
            }
        }
        m[0].getFooter();
        rerataTinggi(totalTinggi, data);

    }

    public int tampilSortApa(){
        System.out.println();
        System.out.println();
        System.out.println("  ★ |============== |   M E N U  U R U T K A N  D A T A  | =============| ★");
        System.out.println();
        System.out.println("  1 |--------------- | Urutkan Data Dengan NIM          | --------------| 1 ");
        System.out.println("  2 |--------------- | Urutkan Data Dengan Nama         | --------------| 2 ");
        System.out.println("  3 |--------------- | Urutkan Data Dengan IPK          | --------------| 3 ");
        System.out.println("  4 |--------------- | Urutkan Data Dengan Semester     | --------------| 4 ");
        System.out.println("  5 |--------------- | Urutkan Data Dengan Tinggi Badan | --------------| 5 ");
        System.out.println("  0 |--------------- | Kembali                          | --------------| 0 ");
        System.out.println();
        int menu = input.Int("  Pilih Nomor Menu : ---------------------------------------------------| ");
        System.out.println();
        return menu;
    }

    public void menuSortData(){
        int pilihMenu = 100;

        while (pilihMenu != 0){

            pilihMenu = tampilSortApa();
            if (pilihMenu == 1){
                sortDataByNim();
            }
            else if (pilihMenu == 2){
                sortDataByNama();
            }
            else if (pilihMenu == 3){
                sortDataByIpk();
            }
            else if (pilihMenu == 4){
                sortDataBySemester();
            }
            else if (pilihMenu == 5){
                sortDataByTinggi();
            }
            else if (pilihMenu > 5 || pilihMenu < 0){
                System.out.println("      # Menu Tidak tersedia! ):");
            }
        }
    }

    public void sortDataByNim(){
        for (int i = 0; i < jumlahData; i++){
            for (int j = i + 1; j < jumlahData; j++){
                if (m[i].getNim().compareTo(m[j].getNim()) > 0) {
                    sortData(i, j);
                }
            }
        }
        printSortData();
    }

    public void sortDataByNim(int i){
        for (int j = i + 1; j < jumlahData; j++){
            if (m[i].getNim().compareTo(m[j].getNim()) > 0) {
                sortData(i, j);  
            }
        }
    }

    public void sortDataByNama(){
        for (int i = 0; i < jumlahData; i++){
            for (int j = i + 1; j < jumlahData; j++){
                if (m[i].getNama().compareTo(m[j].getNama()) > 0) {
                    sortData(i, j);
                }
            }
        }
        printSortData();
    }

    public void sortDataByNama(int i){
        for (int j = i + 1; j < jumlahData; j++){
            if (m[i].getNama().compareTo(m[j].getNama()) > 0) {
                sortData(i, j);
            }
        }
    }

    public void sortDataByIpk(){
        for (int i = 0; i < jumlahData; i++){
            for (int j = i + 1; j < jumlahData; j++){
                if (m[i].getIpk() > m[j].getIpk()) {
                    sortData(i, j);
                }
            }
        }
        printSortData();
    }

    public void sortDataByIpk(int i){
        for (int j = i + 1; j < jumlahData; j++){
            if (m[i].getIpk() > m[j].getIpk()) {
                sortData(i, j);
            }
        }
    }

    public void sortDataBySemester(){
        for (int i = 0; i < jumlahData; i++){
            for (int j = i + 1; j < jumlahData; j++){
                if (m[i].getSemester() > m[j].getSemester()) {
                    sortData(i, j);
                }
            }
        }
        printSortData();
    }

    public void sortDataBySemester(int i){
        for (int j = i + 1; j < jumlahData; j++){
            if (m[i].getSemester() > m[j].getSemester()) {
                sortData(i, j);
            }
        }
    }

    public void sortDataByTinggi(){
        for (int i = 0; i < jumlahData; i++){
            for (int j = i + 1; j < jumlahData; j++){
                if (m[i].getTinggiBadan() > m[j].getTinggiBadan()) {
                    sortData(i, j);
                }
            }
        }
        printSortData();
    }

    public void sortDataByTinggi(int i){
        for (int j = i + 1; j < jumlahData; j++){
            if (m[i].getTinggiBadan() > m[j].getTinggiBadan()) {
                sortData(i, j);
            }
        }
    }

    public void printSortData(){
        m[0].getHeader();
        for (int i = 0; i < jumlahData - 1; i++){
            m[i].getDetail();
        }
        m[jumlahData-1].getDetail();
        m[0].getFooter();
    }

    public void sortData (int i, int j){
        String tempGetNimI = m[i].getNim();
        String tempGetNimJ = m[j].getNim();
        String tempGetNamaI = m[i].getNama();
        String tempGetNamaJ = m[j].getNama();
        double tempGetIpkI = m[i].getIpk();
        double tempGetIpkJ = m[j].getIpk();
        int tempGetSemesterI = m[i].getSemester();
        int tempGetSemesterJ = m[j].getSemester();
        Double tempGetTinggiI = m[i].getTinggiBadan();
        Double tempGetTinggiJ = m[j].getTinggiBadan();

        m[i].setNim(tempGetNimJ);
        m[j].setNim(tempGetNimI);
        m[i].setNama(tempGetNamaJ);
        m[j].setNama(tempGetNamaI);
        m[i].setIpk(tempGetIpkJ);
        m[j].setIpk(tempGetIpkI);
        m[i].setSemester(tempGetSemesterJ);
        m[j].setSemester(tempGetSemesterI);
        m[i].setTinggiBadan(tempGetTinggiJ);
        m[j].setTinggiBadan(tempGetTinggiI);
    }


    // FUNGSI MENU HAPUS DATA

    public void hapusData(){
        System.out.println("      # Pilih Data Yang Akan Di Hapus Menggunakan NIM ");
        System.out.println();
        String nimHapus = input.String("            NIM  :  ");
        System.out.println();
        int index = noIndexNim(nimHapus);

        if (index == -1){
            System.out.println("      # Data Tidak Ditemukan! ):");
        }
        else{
            for (int i = index; i < jumlahData; i++){
                System.out.println("      # Hapus Seluruh Data " + m[i].getNama() + " ?");
            
                int konfirmHapus = inputKonfirmasiHapus();

                if (konfirmHapus == 0){
                    System.out.println("      # Data Tidak Terhapus! ^_^ ");
                    lihatSeluruhData();
                    break;
                }
                else if (konfirmHapus == 1){
                    System.out.println("      # Data " + m[i].getNama() + " Terhapus! T_T ");
                    m[i] = m[i + 1];
                    jumlahData--;
                    lihatSeluruhData();
                    break;
                }
                else if (konfirmHapus < 0 || konfirmHapus > 1){
                    System.out.println("      # Menu Tidak tersedia! ):");
                    break;
                }
            }
        }
    }

    public int inputKonfirmasiHapus(){
        System.out.println();
        System.out.println();
        System.out.println("  1 |------------------------ | Ya, Hapus       | ----------------------| 1 ");
        System.out.println("  0 |------------------------ | Tidak, Batalkan | ----------------------| 0 ");
        System.out.println();
        int menu = input.Int("  Pilih Nomor Menu : ---------------------------------------------------| ");
        System.out.println();
        return menu;
    }

    // FUNGSI MENU EDIT

    public int editPilihNim(){
        System.out.println();
        System.out.println("      # Pilih Data Yang Akan Di Edit Menggunakan NIM ");
        System.out.println();
        String nim = input.String("            NIM  :  ");
        System.out.println();
        int indexNim = noIndexNim(nim);
        return indexNim;
    }

    public int editFailSelectNim(){
        System.out.println();
        System.out.println();
        System.out.println("  1 |------------------------- | Coba Lagi    | ------------------------| 1 ");
        System.out.println("  0 |------------------------- | Kembali      | ------------------------| 0 ");
        System.out.println();
        int menu = input.Int("  Pilih Nomor Menu : ---------------------------------------------------| ");
        System.out.println();
        return menu;
    }
    
    public void editData(){
        System.out.println();
        lihatSeluruhData();
        int indexNim = editPilihNim();

        if(indexNim == -1){
            System.out.println("      # Data Tidak Ditemukan ");

            int pilihMenu = 100;

            while (pilihMenu != 0){
                pilihMenu = editFailSelectNim();
                if(pilihMenu == 1){
                    editPilihNim();
                    break;
                }
                else{
                    System.out.println("      # Menu Tidak tersedia! ):");
                }
            }
        }

        else {
            System.out.println("      # Data " + m[indexNim].getNama() + " Terpilih! ^_^ ");
            tabelDetail(indexNim);
            int editApa = 100;

            while (editApa != 0){
                editApa = tampilEditApa();
                if (editApa == 1){
                    editDataNim(indexNim);
                }
                else if (editApa == 2){
                    editDataNama(indexNim);
                }
                else if (editApa == 3){
                    editDataIpk(indexNim);
                }
                else if (editApa == 4){
                    editDataSemester(indexNim);
                }
                else if (editApa == 5){
                    editDatTinggi(indexNim);
                }
            }
        }
    }

    public int tampilEditApa() {
        System.out.println();
        System.out.println();
        System.out.println("  ★ |================= |  M E N U  E D I T  D A T A  | =================| ★");
        System.out.println();
        System.out.println("  1 |---------------------- | Edit NIM          | ----------------------| 1 ");
        System.out.println("  2 |---------------------- | Edit Nama         | ----------------------| 2 ");
        System.out.println("  3 |---------------------- | Edit IPK          | ----------------------| 3 ");
        System.out.println("  4 |---------------------- | Edit Semester     | ----------------------| 4 ");
        System.out.println("  5 |---------------------- | Edit Tinggi Badan | ----------------------| 5 ");
        System.out.println("  0 |---------------------- | Kembali           | ----------------------| 0 ");
        System.out.println();
        int menu = input.Int("  Pilih Nomor Menu : ---------------------------------------------------| ");
        System.out.println();
        return menu;
    }

    public void editDataNim(int indexNim){  
        tabelDetail(indexNim);
        System.out.println();
        System.out.println           ("      # Masukan Data NIM Baru ");
        System.out.println();
        String nimBaru = input.String("            NIM            :  ");
        System.out.println();
        m[indexNim].setNim(nimBaru);
        System.out.println("      # Data NIM " + m[indexNim].getNama() + " Telah Ter-update! ^_^");
        tabelDetail(indexNim);
    }

    public void editDataNama(int indexNim){  
        tabelDetail(indexNim);
        System.out.println();
        System.out.println            ("      # Masukan Data Nama Baru ");
        System.out.println();
        String namaBaru = input.String("            Nama           :  ");
        System.out.println();
        System.out.println("      # Data Nama " + m[indexNim].getNama() + " Telah Ter-update! ^_^");
        m[indexNim].setNama(namaBaru);
        tabelDetail(indexNim);
    }

    public void editDataIpk(int indexNim){  
        tabelDetail(indexNim);
        System.out.println();
        System.out.println           ("      # Masukan Data IPK Baru ");
        System.out.println();
        double ipkBaru = input.Double("            IPK            :  ");
        System.out.println();
        m[indexNim].setIpk(ipkBaru);
        System.out.println("      # Data IPK " + m[indexNim].getNama() + " Telah Ter-update! ^_^");
        tabelDetail(indexNim);
    }
    
    public void editDataSemester(int indexNim){  
        tabelDetail(indexNim);
        System.out.println();
        System.out.println           ("      # Masukan Data Semester Baru ");
        System.out.println();
        int semBaru = input.Int("            Semester       :  ");
        System.out.println();
        m[indexNim].setSemester(semBaru);
        System.out.println("      # Data Semester " + m[indexNim].getNama() + " Telah Ter-update! ^_^");
        tabelDetail(indexNim);
    }
    
    public void editDatTinggi(int indexNim){  
        tabelDetail(indexNim);
        System.out.println();
        System.out.println           ("      # Masukan Data Tinggi Badan Baru ");
        System.out.println();
        double tinggiBaru = input.Double("            Tinggi Badan   :  ");
        System.out.println();
        m[indexNim].setTinggiBadan(tinggiBaru);
        System.out.println("      # Data Tinggi Badan " + m[indexNim].getNama() + " Telah Ter-update! ^_^");
        tabelDetail(indexNim);
    }

    // FUNGSI RATA RATA IPK

    public void rerataIPK(){
        double total = 0.0;
        for (int i = 0; i<jumlahData; i++){
            total += m[i].getIpk();
        }
        double average = total/jumlahData;
        System.out.println("      # Rata-rata IPK Mahasiswa Data Di Atas = " + average);
    }

    public void rerataIPK(double totalIPK, int data){
        double average = totalIPK/data;
        System.out.println();
        System.out.println("      # Rata-rata IPK Mahasiswa Data Di Atas = " + average);
    }

    public void rerataTinggi(double totalIPK, int data){
        double average = totalIPK/data;
        System.out.println();
        System.out.println("      # Rata-rata Tinggi Mahasiswa Data Di Atas = " + average);
    }
    
    public double totalIPK(int i){
        double total = 0.0;
        total += m[i].getIpk();
        return total;
    }


    // SEARCH NO INDEX

    public int noIndexNim(String nim){
        for(int i = 0; i < jumlahData; i++){
            if(m[i].getNim().equals(nim)){
                return i;
            }
        }
        return -1;
    }

    public int noIndexNama(String nama){
        for(int i = 0; i < jumlahData; i++){
            if(m[i].getNama().equals(nama)){
                return i;
            }
        }
        return -1;
    }

    public int noIndexIpk(double ipk){
        for(int i = 0; i < jumlahData; i++){
            if(m[i].getIpk() == ipk){
                return i;
            }
        }
        return -1;
    }
    
}
