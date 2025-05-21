/**
 * File         : Programmer.java
 * Deskripsi    : Subclass Programmer
 * Pembuat      : Naufal Shafi Anwar - 24060122140185
 * Lab          : B2
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println();
        System.out.println("Bonus : " + bonus);
    }
}
