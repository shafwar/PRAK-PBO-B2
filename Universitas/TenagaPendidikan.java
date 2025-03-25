public class TenagaPendidikan extends Karyawan {
    private static final double GAJI_POKOK = 4000000.0;
    private static int counter = 0;

    public TenagaPendidikan(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counter++;
    }

    @Override
    public double hitungGaji() {
        // Gaji = gaji pokok + (masa kerja * 1% * gaji pokok)
        return GAJI_POKOK + (getMasaKerja() * 0.01 * GAJI_POKOK);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("===== INFORMASI TENAGA PENDIDIKAN =====");
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIP: " + getNip());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("Gaji: Rp" + String.format("%,.2f", hitungGaji()));
        System.out.println("Jumlah Tenaga Pendidikan: " + counter);
    }
}