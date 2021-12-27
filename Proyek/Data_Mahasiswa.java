

public class Data_Mahasiswa extends Data_Manusia {

    private String nim, nama;
    private double ipk;
    public int jumlahData;

    Data_Mahasiswa(String nim, String nama, Double ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return this.nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void setIpk(double ipk){
        this.ipk = ipk;
    }

    public double getIpk(){
        return this.ipk;
    }

    public void getHeader(){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();
        System.out.printf("%10s %20s %5s %5s", "NIM", "NAMA", "IPK", "TINGGI BADAN");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
    }
    public void getDetail(){
        System.out.println();
        System.out.printf("%10s %20s %5s %5s",  this.nim, this.nama.toUpperCase(), String.valueOf(this.ipk), String.valueOf(this.tinggiBadan));
        System.out.println();
    }
}
