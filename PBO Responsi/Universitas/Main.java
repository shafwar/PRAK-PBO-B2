public class Main {
    public static void main(String[] args) {
        // Membuat beberapa fakultas
        Fakultas teknik = new Fakultas("Teknik", 8000000.0, 5500000.0);
        Fakultas mipa = new Fakultas("MIPA", 7500000.0, 5200000.0);
        Fakultas ekonomi = new Fakultas("Ekonomi", 7000000.0, 4800000.0);

        // Membuat beberapa mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Ahmad Farhan", "ahmad@mail.com", "M12345", 1, teknik);
        Mahasiswa mhs2 = new Mahasiswa("Budi Santoso", "budi@mail.com", "M12346", 3, mipa);
        Mahasiswa mhs3 = new Mahasiswa("Citra Dewi", "citra@mail.com", "M12347", 5, ekonomi);

        // Membuat beberapa dosen
        Dosen dsn1 = new Dosen("Dr. Dharma", "dharma@univ.ac.id", "D10001", 5, teknik);
        Dosen dsn2 = new Dosen("Prof. Eka", "eka@univ.ac.id", "D10002", 10, mipa);

        // Membuat beberapa tenaga pendidikan
        TenagaPendidikan tendik1 = new TenagaPendidikan("Faisal", "faisal@univ.ac.id", "T20001", 3);
        TenagaPendidikan tendik2 = new TenagaPendidikan("Gita", "gita@univ.ac.id", "T20002", 7);

        // Menampilkan informasi
        System.out.println("\n=== DEMO SISTEM UNIVERSITAS ===\n");
        
        // Tampilkan info mahasiswa
        mhs1.tampilkanInfo();
        System.out.println();
        mhs2.tampilkanInfo();
        System.out.println();
        mhs3.tampilkanInfo();
        System.out.println();
        
        // Tampilkan info dosen
        dsn1.tampilkanInfo();
        System.out.println();
        dsn2.tampilkanInfo();
        System.out.println();
        
        // Tampilkan info tendik
        tendik1.tampilkanInfo();
        System.out.println();
        tendik2.tampilkanInfo();
    }
}