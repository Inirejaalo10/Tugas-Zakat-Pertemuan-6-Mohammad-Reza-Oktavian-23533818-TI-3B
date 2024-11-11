package tugas.pkg1.zakat;

import java.util.ArrayList;

public class KalkulatorZakat {
    private ArrayList<Muzaki> muzakiList;
    private ArrayList<Penerima> penerimaList;
    private ZakatFitrah zakatFitrah;
    private ZakatMal zakatMal;

    public KalkulatorZakat(ZakatFitrah zakatFitrah, ZakatMal zakatMal) {
        this.muzakiList = new ArrayList<>();
        this.penerimaList = new ArrayList<>();
        this.zakatFitrah = zakatFitrah;
        this.zakatMal = zakatMal;
    }

    public void tambahMuzaki(Muzaki muzaki) {
        muzakiList.add(muzaki);
        System.out.println("Muzaki " + muzaki.getNama() + " berhasil ditambahkan.");
    }

    public void tambahPenerima(Penerima penerima) {
        penerimaList.add(penerima);
        System.out.println("Penerima " + penerima.getNama() + " berhasil ditambahkan.");
    }

    public void tampilkanMuzaki() {
        System.out.println("Daftar Muzaki:");
        for (Muzaki muzaki : muzakiList) {
            System.out.println("Nama: " + muzaki.getNama() + ", Alamat: " + muzaki.getAlamat() + ", Jumlah Zakat: Rp" + muzaki.getJumlahZakat());
        }
    }

    public void tampilkanPenerima() {
        System.out.println("Daftar Penerima:");
        for (Penerima penerima : penerimaList) {
            System.out.println("Nama: " + penerima.getNama() + ", Kebutuhan: " + penerima.getKebutuhan());
        }
    }

    public void hitungZakatFitrah(Muzaki muzaki, int anggotaKeluarga) {
        double totalZakat = zakatFitrah.hitungZakatFitrah(anggotaKeluarga);
        muzaki.setJumlahZakat(totalZakat);
        System.out.println("Total zakat fitrah untuk " + muzaki.getNama() + ": Rp" + totalZakat);
    }

    public void hitungZakatMal(Muzaki muzaki, double totalHarta) {
        double zakat = zakatMal.hitungZakatMal(totalHarta);
        if (zakat > 0) {
            muzaki.setJumlahZakat(zakat);
            System.out.println("Zakat mal untuk " + muzaki.getNama() + ": Rp" + zakat);
        } else {
            System.out.println("Harta tidak memenuhi nisab. Tidak wajib zakat.");
        }
    }
}
