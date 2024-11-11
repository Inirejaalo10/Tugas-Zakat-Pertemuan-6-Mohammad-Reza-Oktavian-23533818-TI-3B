package tugas.pkg1.zakat;

public class Muzaki {
    private String nama;
    private String alamat;
    private double jumlahZakat;

    public Muzaki(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahZakat = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getJumlahZakat() {
        return jumlahZakat;
    }

    public void setJumlahZakat(double jumlahZakat) {
        this.jumlahZakat = jumlahZakat;
    }
}
