/* Nama : Naufal Shafi Anwar - 24060122140185
 * File : Anjing.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama); // Memanggil konstruktor Anabul untuk menyetel nama
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Burung : Cuit");
    }

    @Override
    public void gerak() {
        System.out.println("Burung sedang terbang.");
    }
}
