package tugas.pkg1.zakat;

public class ZakatMal {
    private double nisab;
    private double persentaseZakat;

    public ZakatMal(double nisab, double persentaseZakat) {
        this.nisab = nisab;
        this.persentaseZakat = persentaseZakat;
    }

    public double hitungZakatMal(double totalHarta) {
        if (totalHarta >= nisab) {
            return totalHarta * persentaseZakat;
        } else {
            return 0;
        }
    }
}
