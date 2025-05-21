/**
 * File         : Kucing.java
 * Deskripsi    : Program Tugas lanjutan Polimorfisme. Pembuatan Subclass Kucing
 * Pembuat      : Naufal Shafi Anwar - 24060122140185
 * Lab          : B2
 */

public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak: melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }
}