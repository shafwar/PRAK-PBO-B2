/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : Persegi.java
 * Tanggal : 10 Mei 2025
 */
package bangundatargenerik;

/**
 *
 * @author noels
 */
public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi){
       this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling(){
        return 4*sisi;
    }
    
    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }
}
