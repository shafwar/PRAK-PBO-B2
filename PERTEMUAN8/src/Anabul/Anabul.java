/* Nama : Naufal Shafi Anwar - 24060122140185
 * File : Anabul.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

/**
 *
 * @author noels
 */
public class Anabul {

    private String nama;

    // Constructor
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama
    public String getNama() {
        return this.nama;
    }

    public void gerak() {
        // Default gerakan, bisa didefinisikan lebih lanjut di subclass
    }

    public void bersuara() {
        // Default suara, bisa didefinisikan lebih lanjut di subclass
    }
}
