
    # Penjelasan Fungsi Kalkulator
print("======================================")
print("SELAMAT DATANG DI SISTEM KALKULATORMU")
print("======================================")
print("Kalulator sederhana ini akan menghitung hasil dari operasi: ")
print("a. Tambah")
print("b. Kurang")
print("c. Kali")
print("d. Bagi", "(disertai hasil sisa bagi)")
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
operasiKali          = angkaPertama *  angkaKedua
operasiBagi          = angkaPertama /  angkaKedua
operasiModulus       = angkaPertama %  angkaKedua
operasiModulusRevers = angkaKedua   %  angkaPertama

    # Output berupa hasil operasi dari dua buah bilangan yang di berikan oleh pengguna 
print("========================================================")
print("Berikut adalah hasil dari operasi hitung yang tersedia:")
print("========================================================")
print()
print(a + str(" + ") + b, " = ",  str(operasiTambah))
print(a + str(" - ") + b, " = ",  str(operasiKurang))
print(a + str(" x ") + b, " = ",  str(operasiKali))
print(a + str(" / ") + b, " = ",  str(operasiBagi) + str(" sisa ") + str(operasiModulus) )
print()
print("================================================")
print("Terima kasih telah menggunakan KALKULATORMU >_< ")
print("================================================")
print()
