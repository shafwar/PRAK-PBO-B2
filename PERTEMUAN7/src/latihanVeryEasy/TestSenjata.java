/* Nama : Naufal Shafi Anwar - 24060122140185
 * File : TestSenjata.java
 * Tanggal : 29 Apr 2025
 */
package latihanVeryEasy;

/**
 *
 * @author noels
 */
public class TestSenjata {
  public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}
