/* Nama : Naufal Shafi Anwar - 24060122140185
 * File : Anjing.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

/**
 *
 * @author noels
 */
public class Anjing extends Anabul{
    public Anjing(String nama){
        super.setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Anjing : Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Anjing : Guk-guk");
    }
}
