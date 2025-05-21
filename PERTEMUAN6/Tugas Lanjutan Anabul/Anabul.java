/**
 * File         : Anabul.java
 * Deskripsi    : Program Tugas lanjutan Polimorfisme. Pembuatan Superclass Anabul
 * Pembuat      : Naufal Shafi Anwar - 24060122140185
 * Lab          : B2
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}
