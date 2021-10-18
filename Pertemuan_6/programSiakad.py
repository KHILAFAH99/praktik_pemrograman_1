# Keterangan Menu Program
print("==== PROGRAM SIAKAD ====")
print()
print("1. Tambah Data")
print("2. Edit Data")
print("3. Hapus Data")
print("4. Lihat Data")
print()
print("========================")

# variable untuk Input Menu
menu = input("Menu yang Anda pilih = ")
menu = int(menu)

# Program kondisi menu yang dipilih
if (menu == 1):
    print("1. Tambah Data Mahasiswa")
    print("2. Tambah Data Mata kuliah")
    print("3. Kembali")
    menuSatu = input("Menu yang Anda pilih = ")
    menuSatu = int (menuSatu)

    if (menuSatu == 1):
        namaAnda = input("Masukan nama Anda = ")
        print ("Nama Mahasiswa yang ditambahkan adalah  " + namaAnda )

    elif (menuSatu == 2):
        mataKuliah = input ("Masukan Mata Kuliah Anda = ")
        print ("Mata Kuliah yang ditambahkan adalah" + mataKuliah)

    elif (menuSatu == 3):
        print ("Terima Kasih ")

    else:
        print ("Menu Tidak Tersedia")

elif (int(menu) >=2 and int(menu) <=4 ):
    print ("Fitur Tidak Tersedia")

else :
    print ("Menu Tidak Tersedia")      