/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : PersegiPanjang.java
 * Tanggal : 10 Mei 2025
 */
package bangundatargenerik;

/**
 *
 * @author noels
 */
public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double hitungKeliling(){
        return (2*panjang)+(2*lebar);
    }
    
    @Override
    public double hitungLuas(){
        return panjang*lebar;
    }
}
