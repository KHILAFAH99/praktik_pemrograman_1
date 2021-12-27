
# Variable Data Diri
nama         = "Imam Pamuji"
nim          = "21537144010"
programStudi = "Teknologi Informasi"
jurusan      = "PTEI"
fakultas     = "Teknik"
ipk          =  3.65
angkatan     =  2021


# Komponen Tabel
listTutup    = "+---+---------------+---------------------+"
listLongkap  = "|                                         |"
listIsi      = "|---|---------------+---------------------|"
no1          = "| 1 "
no2          = "| 2 "
no3          = "| 3 "
no4          = "| 4 "
no5          = "| 5 "
no6          = "| 6 "
no7          = "| 7 "

# Buat Function untuk Header tabel
def header():
    print(listTutup)
    print(listLongkap)
    print("|    DATA IDENTITAS MAHASISWA UNY 2021    |")
    print(listLongkap)
    print(listTutup)

# Panggil Function Header
header()

# Print data diri dalam bentuk tabel
print ( no1 + "| Nama Lengkap  | " + nama + "         |")
print (listIsi)
print ( no2 + "| NIM           | " + nim + "         |")
print (listIsi)
print ( no3 + "| Angkatan      | " + str(angkatan) + "                |")
print (listIsi)
print ( no4 + "| Program Studi | " + programStudi + " |")
print (listIsi)
print ( no5 + "| Jurusan       | " + jurusan + "                |")
print (listIsi)
print ( no6 + "| Fakultas      | " + fakultas + "              |")
print (listIsi)
print ( no7 + "| IPK Harapan   | " + str(ipk) + "                |")
print (listTutup)

