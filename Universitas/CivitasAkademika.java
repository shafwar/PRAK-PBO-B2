public abstract class CivitasAkademika {
    private String nama;
    private String email;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    // Method abstract untuk menampilkan informasi
    public abstract void tampilkanInfo();
}