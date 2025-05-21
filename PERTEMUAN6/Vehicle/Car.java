/**
 * File         : Car.java
 * Deskripsi    : Program latihan penggunaan Polimorfisme Universal: Inclusion. Pembuatan Subclass Car
 * Pembuat      : Naufal Shafi Anwar - 24060122140185
 * Lab          : B2
 */

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak*harga;
        fare = fare-100.00f;
        System.out.println("Harga sewa mobil = "+ fare);
    }    
}
