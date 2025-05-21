/**
 * File         : Petani.java
 * Deskripsi    : Program penggunaan Abstract dan Interface. Pembuatan Subclass Petani
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int countPetani = 0;

    public Petani(String nama, LocalDate tgl, String alamat, double pendapatan,String asalKota){
        super(nama,tgl,alamat,pendapatan);
        this.asalKota = asalKota;
        countPetani += 1;
    }

    /* Mutator */
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    /* Selektor */
    public String getAsalKota() {
        return asalKota;
    }
    public static int getCounterPetani(){
        return countPetani;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 0;
    }
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Asal Kota: " + getAsalKota());
        System.out.println("Count Petani: " + getCounterPetani());
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Hitung Pajak: " + hitungPajak());
    }
}
