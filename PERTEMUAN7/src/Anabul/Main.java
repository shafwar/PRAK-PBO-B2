/* Nama : Naufal Shafi Anwar - 24060122140185
 * File : Main.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

import java.util.ArrayList;

/**
 *
 * @author noels
 */
public class Main {
    public static void main(String[] args) {
            System.out.println("--------------------------------");
            System.out.println("Generik");
            System.out.println("--------------------------------");
            
            Datum<Anabul> Anubul = new Datum<>();
            ContohMetodeGenerik Contoh = new ContohMetodeGenerik();
            
            Anubul.setIsi(new Anjing("Hachiko"));
            Contoh.fungsi(Anubul).gerak();
            Contoh.fungsi(Anubul).bersuara();
            
            Anubul.setIsi(new Kucing("Momo"));
            Contoh.fungsi(Anubul).gerak();
            Contoh.fungsi(Anubul).bersuara();
            
            Anubul.setIsi(new Burung("Wanto"));
            Contoh.fungsi(Anubul).gerak();
            Contoh.fungsi(Anubul).bersuara();
            
            System.out.println("--------------------------------");
            System.out.println("Bukan generik");
            System.out.println("--------------------------------");

            Anabul Anabul1 = new Kucing("Ciko");
            Anabul Anabul2 = new Anjing("Oci");
            Anabul Anabul3 = new Burung("Jhonny");

            ArrayList<Anabul> kewn = new ArrayList<>();
            kewn.add(Anabul1);
            kewn.add(Anabul2);
            kewn.add(Anabul3);

            for (Anabul haiwan : kewn) {
                // haiwan.getNama();
                haiwan.gerak();
                haiwan.bersuara();
                System.out.println();
                }
        }
}
