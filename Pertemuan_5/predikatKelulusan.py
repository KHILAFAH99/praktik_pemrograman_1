# Deklarasikan Variable IPK untuk memberi input
ipk = input("Masukan IPK Anda = ")
ipk = float(ipk)

# Deklarasikan Variable waktuStudi untuk memberi input
waktuStudi = input("Masukan Waktu Studi = ")
waktuStudi = float(waktuStudi)

# Program untuk menyatakan sebuah konsidi yang akan di jalankan
if   (ipk >= 3.51 and ipk <=4 and waktuStudi <=4):
    print("Selamat! Anda Meraih Predikat Summa Cumlaude")
elif (ipk >= 3.51 and ipk <=4 and waktuStudi > 4):
    print("Selamat! Anda Meraih Predikat Cumlaude")
elif (ipk >= 3.01 and ipk < 3.51):
    print("IPK Anda Sangat Memuaskan")
elif (ipk >= 2.76 and ipk < 3.01):
    print("IPK Anda Memuaskan")
elif (ipk >= 2.00 and ipk < 2.76):
    print("IPK Anda Cukup")
elif (ipk < 2.00):
    print("Anda Tidak Lulus")
else:
    print("IPK Tidak Valid")