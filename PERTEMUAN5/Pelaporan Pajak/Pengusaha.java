/**
 * File         : Pengusaha.java
 * Deskripsi    : Program penggunaan Abstract dan Interface. Pembuatan Subclass Pengusaha
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int countPengusaha = 0;

    public Pengusaha(String nama, LocalDate tgl, String alamat, double pendapatan,String npwp){
        super(nama,tgl,alamat,pendapatan);
        this.npwp = npwp;
        countPengusaha += 1;
    }

    /* Mutator */
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    /* Selektor */
    public String getNpwp() {
        return npwp;
    }
    public static int getCounterPengusaha(){
        return countPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 2;
    }

    public double hitungPajak(){
        return (15.0/100.0) * pendapatan;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NPWP: " + getNpwp());
        System.out.println("Count Pengusaha: " + getCounterPengusaha());
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());;
    }

}
