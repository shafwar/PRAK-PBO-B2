/* Nama : Naufal Shafi Anwar - 24060122140185
 * File : TestSenjata.java
 * Tanggal : 29 Apr 2025
 */
package latihanMedium;

/**
 *
 * @author noels
 */
public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(m16);

        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);

        System.out.println("================================");

        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.menembak(2);
    }
}
