
    # Penjelasan Fungsi Kalkulator
print("======================================")
print("SELAMAT DATANG DI SISTEM KALKULATORMU")
print("======================================")
print("Kalulator sederhana ini akan menghitung hasil dari operasi: ")
print("a. Tambah")
print("b. Kurang")
print("c. Kurang invers")
print("d. Kali")
print("e. Bagi", "(disertai hasil sisa bagi)")
print("f. Bagi Invers", "(disertai hasil sisa bagi)")
print()
print("Pengguna hanya perlu memasukan dua buah angka yang akan di operasikan")
print()

    # Memberi input pada variabel
a            = input("Masukan Angka Pertama: ")
b            = input("Masukan Angka Kedua: " )
angkaPertama = int(a)
angkaKedua   = int(b)

    # Operasi hitung diberikan dalam masing masing variabel
operasiTambah        = angkaPertama +  angkaKedua
operasiKurang        = angkaPertama -  angkaKedua
operasiKurangRevers  = angkaKedua   -  angkaPertama
operasiKali          = angkaPertama *  angkaKedua
operasiBagi          = angkaPertama /  angkaKedua
operasiBagiRevers    = angkaKedua   /  angkaPertama
operasiModulus       = angkaPertama %  angkaKedua
operasiModulusRevers = angkaKedua   %  angkaPertama

    # Output berupa hasil operasi dari dua buah bilangan yang di berikan oleh pengguna 
print("========================================================")
print("Berikut adalah hasil dari operasi hitung yang tersedia:")
print("========================================================")
print()
print(a + str(" + ") + b, " = ",  str(operasiTambah))
print(a + str(" - ") + b, " = ",  str(operasiKurang))
print(b + str(" - ") + a, " = ",  str(operasiKurangRevers))
print(a + str(" x ") + b, " = ",  str(operasiKali))
print(a + str(" / ") + b, " = ",  str(operasiBagi) + str(" sisa ") + str(operasiModulus) )
print(b + str(" / ") + a, " = ",  str(operasiBagiRevers) + str(" sisa " ) + str(operasiModulusRevers))
print()
print("================================================")
print("Terima kasih telah menggunakan KALKULATORMU >_< ")
print("================================================")
