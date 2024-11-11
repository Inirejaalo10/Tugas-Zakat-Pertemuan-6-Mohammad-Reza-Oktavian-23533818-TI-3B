package tugas.pkg1.zakat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ZakatFitrah zakatFitrah = new ZakatFitrah(35000);
        ZakatMal zakatMal = new ZakatMal(85000000, 0.025);

        KalkulatorZakat kalkulatorZakat = new KalkulatorZakat(zakatFitrah, zakatMal);

        System.out.println("==== Data Muzaki ====");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        Muzaki muzaki = new Muzaki(nama, alamat);
        kalkulatorZakat.tambahMuzaki(muzaki);

        int pilihan;
        boolean ulang = true;

        while (ulang) {
            System.out.println("\n==== Kalkulator Zakat ====");
            System.out.println("1. Zakat Fitrah");
            System.out.println("2. Zakat Mal");
            System.out.println("3. Tampilkan Daftar Muzaki");
            System.out.println("4. Tambah Penerima Zakat");
            System.out.println("5. Tampilkan Daftar Penerima");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline setelah nextInt()

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah anggota keluarga: ");
                    int anggotaKeluarga = input.nextInt();
                    kalkulatorZakat.hitungZakatFitrah(muzaki, anggotaKeluarga);
                    break;
                case 2:
                    System.out.print("Masukkan total harta (dalam Rupiah): ");
                    double totalHarta = input.nextDouble();
                    kalkulatorZakat.hitungZakatMal(muzaki, totalHarta);
                    break;
                case 3:
                    kalkulatorZakat.tampilkanMuzaki();
                    break;
                case 4:
                    tambahPenerima(input, kalkulatorZakat);
                    break;
                case 5:
                    kalkulatorZakat.tampilkanPenerima();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan kalkulator zakat.");
                    ulang = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }

        input.close();
    }

    // Method untuk menambahkan data penerima zakat
    private static void tambahPenerima(Scanner input, KalkulatorZakat kalkulatorZakat) {
        System.out.println("==== Tambah Penerima Zakat ====");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Kebutuhan: ");
        String kebutuhan = input.nextLine();
        
        Penerima penerima = new Penerima(nama, kebutuhan);
        kalkulatorZakat.tambahPenerima(penerima);
    }
}
