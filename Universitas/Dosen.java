public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counter = 0;

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counter++;
    }

    @Override
    public double hitungGaji() {
        // Gaji = gaji pokok + (masa kerja * 1% * gaji pokok)
        return fakultas.getGajiPokok() + (getMasaKerja() * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("===== INFORMASI DOSEN =====");
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIP: " + getNip());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Gaji: Rp" + String.format("%,.2f", hitungGaji()));
        System.out.println("Jumlah Dosen: " + counter);
    }
}