/**
 * File         : Burung.java
 * Deskripsi    : Program Tugas lanjutan Polimorfisme. Pembuatan Subclass Burung
 * Pembuat      : Naufal Shafi Anwar - 24060122140185
 * Lab          : B2
 */

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak: terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: cuit!");
    }
}
