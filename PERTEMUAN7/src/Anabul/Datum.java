/* Nama : Naufal Shafi Anwar - 24060122140185
 * File : ContohMetodeGenerik.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

/**
 *
 * @author noels
 */
public class Datum<G> {
   private G isi;
   
   public void setIsi(G isi){
       this.isi = isi;
   }
   
   public G getIsi(){
       return this.isi;
   }
}
