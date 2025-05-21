/**
 * File         : Lingkaran.java
 * Deskripsi    : Program penggunaan Inheritance. Pembuatan Subclass Lingkaran
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

// Kelas Lingkaran yang merupakan turunan dari BangunDatar
public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(){
        setJmlSisi(1);
        printCounterBangunDatar();
    }

    public Lingkaran(double jari, String warna, String border){
        super(1,warna,border);
        this.jari = jari;
        printCounterBangunDatar();
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(1);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return Math.PI * jari * 2;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari: " + jari);
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }
    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }
    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }

}
