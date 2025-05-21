/* Nama : Naufal Shafi Anwar - 24060122140185
 * File : Anjing.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama); // Memanggil konstruktor Anabul untuk menyetel nama
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Anjing : Guk-guk");
    }

    @Override
    public void gerak() {
        System.out.println("Anjing sedang melata.");
    }
}
