package tugas.pkg1.zakat;

public class Penerima {
    private String nama;
    private String kebutuhan;

    public Penerima(String nama, String kebutuhan) {
        this.nama = nama;
        this.kebutuhan = kebutuhan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKebutuhan() {
        return kebutuhan;
    }

    public void setKebutuhan(String kebutuhan) {
        this.kebutuhan = kebutuhan;
    }
}
