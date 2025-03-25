public abstract class Karyawan extends CivitasAkademika {
    private String nip;
    private int masaKerja;

    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    public String getNip() {
        return nip;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    // Method abstract untuk menghitung gaji
    public abstract double hitungGaji();
}