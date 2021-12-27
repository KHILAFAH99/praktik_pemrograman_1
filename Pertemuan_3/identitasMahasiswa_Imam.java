public class identitasMahasiswa_Imam {
    public static void main (String[] args) {

        // Variable Data Diri
        String nama         = "Imam Pamuji";
        String nim          = "21537144010";
        String programStudi = "Teknologi Informasi";
        String jurusan      = "PTEI";
        String fakultas     = "Teknik";
        double ipk          =  3.65;
        int    angkatan     =  2021;

        // Komponen Tabel
        String listTutup    = "+---+---------------+---------------------+";
        String listLongkap  = "|                                         |";
        String listIsi      = "|---|---------------+---------------------|";
        String no1          = "| 1 ";
        String no2          = "| 2 ";
        String no3          = "| 3 ";
        String no4          = "| 4 ";
        String no5          = "| 5 ";
        String no6          = "| 6 ";
        String no7          = "| 7 ";

        // Header tabel
        System.out.println (listTutup);
        System.out.println (listLongkap);
        System.out.println ("|    DATA IDENTITAS MAHASISWA UNY 2021    |");
        System.out.println (listLongkap);
        System.out.println (listTutup);

        // Print data diri
        System.out.println ( no1 + "| Nama Lengkap  | " + nama + "         |");
        System.out.println (listIsi);
        System.out.println ( no2 + "| NIM           | " + nim + "         |");
        System.out.println (listIsi);
        System.out.println ( no3 + "| Angkatan      | " + angkatan + "                |");
        System.out.println (listIsi);
        System.out.println ( no4 + "| Program Studi | " + programStudi + " |");
        System.out.println (listIsi);
        System.out.println ( no5 + "| Jurusan       | " + jurusan + "                |");
        System.out.println (listIsi);
        System.out.println ( no6 + "| Fakultas      | " + fakultas + "              |");
        System.out.println (listIsi);
        System.out.println ( no7 + "| IPK Harapan   | " + ipk + "                |");
        System.out.println (listTutup);
    }
}