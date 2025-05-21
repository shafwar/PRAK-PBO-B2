/* Nama : Naufal Shafi Anwar - 24060122140185
 * File : Kucing.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

/**
 *
 * @author noels
 */
public class Kucing extends Anabul{
    public Kucing(String nama){
        setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Kucing : Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Kucing : Meong");
    }
}