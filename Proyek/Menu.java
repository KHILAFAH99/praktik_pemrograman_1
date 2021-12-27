
import java.util.Scanner;

public class Menu {
    private int jumlahData;
    Data_Mahasiswa[] m = new Data_Mahasiswa[1000];

    public void tambahData(){
        Scanner scan = new Scanner(System.in);
        System.out.print("MASUKAN DATA NAMA: ");
        String nama = scan.nextLine();

        System.out.print("MASUKAN DATA NIM: ");
        String nim = scan.nextLine();
        System.out.println("===============");
        System.out.println();

        System.out.print("MASUKAN DATA IPK: ");
        double ipk = scan.nextDouble();
        System.out.println("===============");
        System.out.println();

        System.out.print("MASUKAN TINGGI BADAN: ");
        double tinggiBadan = scan.nextDouble();
        System.out.println("===============");
        System.out.println();

        Data_Mahasiswa tambahMahasiswa = new Data_Mahasiswa(nim, nama, ipk);
        tambahMahasiswa.setTinggiBadan(tinggiBadan);
        m[jumlahData] = tambahMahasiswa;
        jumlahData++;
        System.out.println("Berikut data terkini: ");
        lihatDataNoHeader();
    }

    public void lihatData(){
        if (jumlahData == 0){
            System.out.println();
            System.out.println("Data kosong");
            System.out.println();
        }
        else{
            m[1].getHeader();
            for (int i = 0; i < jumlahData ; i++){
                m[i].getDetail();
            }
        }
    }

    public void lihatDataNoHeader(){
        if (jumlahData == 0){
            System.out.println();
            System.out.println("Data kosong");
            System.out.println();
        }
        else{
            for (int i = 0; i < jumlahData ; i++){
                m[i].getDetail();
            }
        }
    }
    
    public void cariData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("MASUKAN NIM YANG DICARI");
        String cariNim = scan.nextLine();
        int index = noIndexNim(cariNim);
        if (index == -1){
            System.out.println("Data tidak ditemukan.");
        }
        else {
            m[index].getDetail();
        }
    }
    

    public void hapusData(){
        System.out.println("ini hapus data");
        System.out.print("Masukkan NIM mahasiswa untuk menghapus data = ");
        Scanner scan = new Scanner(System.in);
        String nimHapus = scan.nextLine();
        int index = noIndexNim(nimHapus);
        if (index == -1){
            System.out.println("Data tidak ditemukan.");
        }
        else{
            for (int i = index; i < jumlahData; i++){
                m[i] = m[i + 1];
            }
            jumlahData--;
            lihatData();
        }

    }

    public void editData(){
        lihatData();
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("MASUKAN DATA APA YANG AKAN EDIT");
        System.out.println("1. NIM");
        System.out.println("2. Nama");
    
        System.out.println("Pilih data dengan NIM = ");
        String nimBaru = scan.nextLine();
        int indexNim = noIndexNim(nimBaru);

        if(indexNim == -1){
            System.out.println("Data tidak ditemukan.");
        }
        else {
            m[indexNim].getDetail();
            System.out.println("Masukkan data nama baru = ");
            String namaBaru = scan.nextLine();
            m[indexNim].setNama(namaBaru);
            m[indexNim].getDetail();
        }
    }

    public void rerataIPK(){
        double total = 0.0;
        for (int i = 0; i<jumlahData; i++){
            total += m[i].getIpk();
        }
        double average = total/jumlahData;
        System.out.println("Rata-rata IPK mahasiswa = " + average);
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
            if(m[i].getNama().equals(ipk)){
                return i;
            }
        }
        return -1;
    }
    
}
