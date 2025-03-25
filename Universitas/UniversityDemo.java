import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversityDemo {
    private static List<Fakultas> daftarFakultas = new ArrayList<>();
    private static List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static List<Dosen> daftarDosen = new ArrayList<>();
    private static List<TenagaPendidikan> daftarTendik = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Inisialisasi data awal
        initData();
        
        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Pilih menu (0-7): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline
            
            switch (pilihan) {
                case 1:
                    tambahFakultas();
                    break;
                case 2:
                    tambahMahasiswa();
                    break;
                case 3:
                    tambahDosen();
                    break;
                case 4:
                    tambahTendik();
                    break;
                case 5:
                    tampilkanSemuaData();
                    break;
                case 6:
                    cariMahasiswa();
                    break;
                case 7:
                    hitungRataRataGaji();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem Universitas!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
            System.out.println();
        } while (pilihan != 0);
        
        scanner.close();
    }
    
    private static void initData() {
        // Membuat beberapa fakultas
        daftarFakultas.add(new Fakultas("Teknik", 8000000.0, 5500000.0));
        daftarFakultas.add(new Fakultas("MIPA", 7500000.0, 5200000.0));
        daftarFakultas.add(new Fakultas("Ekonomi", 7000000.0, 4800000.0));
        
        // Membuat beberapa mahasiswa
        daftarMahasiswa.add(new Mahasiswa("Ahmad Farhan", "ahmad@mail.com", "M12345", 1, daftarFakultas.get(0)));
        daftarMahasiswa.add(new Mahasiswa("Budi Santoso", "budi@mail.com", "M12346", 3, daftarFakultas.get(1)));
        daftarMahasiswa.add(new Mahasiswa("Citra Dewi", "citra@mail.com", "M12347", 5, daftarFakultas.get(2)));
        
        // Membuat beberapa dosen
        daftarDosen.add(new Dosen("Dr. Dharma", "dharma@univ.ac.id", "D10001", 5, daftarFakultas.get(0)));
        daftarDosen.add(new Dosen("Prof. Eka", "eka@univ.ac.id", "D10002", 10, daftarFakultas.get(1)));
        
        // Membuat beberapa tenaga pendidikan
        daftarTendik.add(new TenagaPendidikan("Faisal", "faisal@univ.ac.id", "T20001", 3));
        daftarTendik.add(new TenagaPendidikan("Gita", "gita@univ.ac.id", "T20002", 7));
    }
    
    private static void tampilkanMenu() {
        System.out.println("======= SISTEM INFORMASI UNIVERSITAS =======");
        System.out.println("1. Tambah Fakultas");
        System.out.println("2. Tambah Mahasiswa");
        System.out.println("3. Tambah Dosen");
        System.out.println("4. Tambah Tenaga Pendidikan");
        System.out.println("5. Tampilkan Semua Data");
        System.out.println("6. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("7. Hitung Rata-rata Gaji Karyawan");
        System.out.println("0. Keluar");
        System.out.println("===========================================");
    }
    
    private static void tambahFakultas() {
        System.out.println("\n--- TAMBAH FAKULTAS ---");
        System.out.print("Nama Fakultas: ");
        String nama = scanner.nextLine();
        
        System.out.print("Tarif UKT: ");
        double tarifUKT = scanner.nextDouble();
        
        System.out.print("Gaji Pokok: ");
        double gajiPokok = scanner.nextDouble();
        scanner.nextLine(); // Membuang karakter newline
        
        Fakultas fakultasBaru = new Fakultas(nama, tarifUKT, gajiPokok);
        daftarFakultas.add(fakultasBaru);
        System.out.println("Fakultas " + nama + " berhasil ditambahkan!");
    }
    
    private static void tambahMahasiswa() {
        System.out.println("\n--- TAMBAH MAHASISWA ---");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        
        System.out.print("Semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline
        
        // Pilih fakultas
        Fakultas fakultas = pilihFakultas();
        if (fakultas == null) return;
        
        Mahasiswa mahasiswaBaru = new Mahasiswa(nama, email, nim, semester, fakultas);
        daftarMahasiswa.add(mahasiswaBaru);
        System.out.println("Mahasiswa " + nama + " berhasil ditambahkan!");
    }
    
    private static void tambahDosen() {
        System.out.println("\n--- TAMBAH DOSEN ---");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        System.out.print("NIP: ");
        String nip = scanner.nextLine();
        
        System.out.print("Masa Kerja (tahun): ");
        int masaKerja = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline
        
        // Pilih fakultas
        Fakultas fakultas = pilihFakultas();
        if (fakultas == null) return;
        
        Dosen dosenBaru = new Dosen(nama, email, nip, masaKerja, fakultas);
        daftarDosen.add(dosenBaru);
        System.out.println("Dosen " + nama + " berhasil ditambahkan!");
    }
    
    private static void tambahTendik() {
        System.out.println("\n--- TAMBAH TENAGA PENDIDIKAN ---");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        System.out.print("NIP: ");
        String nip = scanner.nextLine();
        
        System.out.print("Masa Kerja (tahun): ");
        int masaKerja = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline
        
        TenagaPendidikan tendikBaru = new TenagaPendidikan(nama, email, nip, masaKerja);
        daftarTendik.add(tendikBaru);
        System.out.println("Tenaga Pendidikan " + nama + " berhasil ditambahkan!");
    }
    
    private static Fakultas pilihFakultas() {
        if (daftarFakultas.isEmpty()) {
            System.out.println("Tidak ada fakultas yang tersedia. Silakan tambahkan fakultas terlebih dahulu!");
            return null;
        }
        
        System.out.println("Daftar Fakultas:");
        for (int i = 0; i < daftarFakultas.size(); i++) {
            System.out.println((i + 1) + ". " + daftarFakultas.get(i).getNama());
        }
        
        System.out.print("Pilih fakultas (1-" + daftarFakultas.size() + "): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline
        
        if (pilihan < 1 || pilihan > daftarFakultas.size()) {
            System.out.println("Pilihan tidak valid!");
            return null;
        }
        
        return daftarFakultas.get(pilihan - 1);
    }
    
    private static void tampilkanSemuaData() {
        System.out.println("\n--- DAFTAR FAKULTAS ---");
        for (Fakultas fakultas : daftarFakultas) {
            System.out.println("Nama: " + fakultas.getNama());
            System.out.println("Tarif UKT: Rp" + String.format("%,.2f", fakultas.getTarifUKT()));
            System.out.println("Gaji Pokok: Rp" + String.format("%,.2f", fakultas.getGajiPokok()));
            System.out.println();
        }
        
        System.out.println("\n--- DAFTAR MAHASISWA ---");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.tampilkanInfo();
            System.out.println();
        }
        
        System.out.println("\n--- DAFTAR DOSEN ---");
        for (Dosen dosen : daftarDosen) {
            dosen.tampilkanInfo();
            System.out.println();
        }
        
        System.out.println("\n--- DAFTAR TENAGA PENDIDIKAN ---");
        for (TenagaPendidikan tendik : daftarTendik) {
            tendik.tampilkanInfo();
            System.out.println();
        }
    }
    
    private static void cariMahasiswa() {
        System.out.println("\n--- CARI MAHASISWA ---");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        boolean ditemukan = false;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(nim)) {
                System.out.println("\nMahasiswa ditemukan:");
                mahasiswa.tampilkanInfo();
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan!");
        }
    }
    
    private static void hitungRataRataGaji() {
        System.out.println("\n--- RATA-RATA GAJI KARYAWAN ---");
        
        double totalGajiDosen = 0;
        for (Dosen dosen : daftarDosen) {
            totalGajiDosen += dosen.hitungGaji();
        }
        
        double totalGajiTendik = 0;
        for (TenagaPendidikan tendik : daftarTendik) {
            totalGajiTendik += tendik.hitungGaji();
        }
        
        int totalKaryawan = daftarDosen.size() + daftarTendik.size();
        
        if (totalKaryawan > 0) {
            double rataRataGaji = (totalGajiDosen + totalGajiTendik) / totalKaryawan;
            System.out.println("Rata-rata gaji dosen: Rp" + String.format("%,.2f", totalGajiDosen / daftarDosen.size()));
            System.out.println("Rata-rata gaji tendik: Rp" + String.format("%,.2f", totalGajiTendik / daftarTendik.size()));
            System.out.println("Rata-rata gaji semua karyawan: Rp" + String.format("%,.2f", rataRataGaji));
        } else {
            System.out.println("Tidak ada data karyawan yang tersedia!");
        }
    }
}