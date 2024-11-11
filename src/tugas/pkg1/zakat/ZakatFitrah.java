package tugas.pkg1.zakat;

public class ZakatFitrah {
    private int zakatPerOrang;

    public ZakatFitrah(int zakatPerOrang) {
        this.zakatPerOrang = zakatPerOrang;
    }

    public double hitungZakatFitrah(int anggotaKeluarga) {
        return anggotaKeluarga * zakatPerOrang;
    }
}
