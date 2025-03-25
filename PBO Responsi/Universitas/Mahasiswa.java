public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counter = 0;

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counter++;
    }

    public String getNim() {
        return nim;
    }

    public double hitungUKT() {
        // UKT berkurang 5% setiap semester
        double pengurangan = 0.05 * (semester - 1);
        // Memastikan pengurangan tidak lebih dari 100%
        pengurangan = Math.min(pengurangan, 1.0);
        return fakultas.getTarifUKT() * (1 - pengurangan);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("===== INFORMASI MAHASISWA =====");
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("UKT: Rp" + String.format("%,.2f", hitungUKT()));
        System.out.println("Jumlah Mahasiswa: " + counter);
    }
}