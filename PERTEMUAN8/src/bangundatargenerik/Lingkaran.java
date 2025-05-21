/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : Lingkaran.java
 * Tanggal : 10 Mei 2025
 */
package bangundatargenerik;

/**
 *
 * @author noels
 */
public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    public double getJejari() {
        return this.jejari;
    }

    public void setJejari(double jejari) {
        this.jejari = jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }

    @Override
    public double hitungLuas(){
        return jejari*jejari*3.14;
    }
}
