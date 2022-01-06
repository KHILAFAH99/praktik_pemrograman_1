
public class Data_Mahasiswa extends Data_Manusia {

    private String nim, nama;
    private double ipk;
    public int jumlahData, semester;
    public int urutan;

    Data_Mahasiswa(String nim, String nama, double ipk, int semester){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
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

    public void setSemester(int semester){
        this.semester = semester;
    }

    public int getSemester(){
        return this.semester;
    }

    public void getHeader(){
        System.out.println("+---------------+--------------------+-------+------------+----------------+");
        System.out.printf("%1s %8s %6s %11s %8s %4s %2s %9s %2s %13s %2s", "|", "NIM", "|", "NAMA", "|", "IPK", "|", "SEMESTER", "|", "TINGGI BADAN", "|");
        System.out.println();
        System.out.println("+---------------+--------------------+-------+------------+----------------+");
    }

    public void getDetail(){
        System.out.printf("%1s %13s %1s %18s %1s %5s %1s %6s %5s %10s %5s", "|", this.nim,"|", this.nama.toUpperCase(),"|", String.valueOf(this.ipk), "|", String.valueOf(this.semester), "|", String.valueOf(this.tinggiBadan), "|");
        System.out.println();
    }

    public void getFooter(){
        System.out.println("+---------------+--------------------+-------+------------+----------------+");
    }
}
