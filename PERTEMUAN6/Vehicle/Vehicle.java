/**
 * File         : Vehicle.java
 * Deskripsi    : Program latihan penggunaan Polimorfisme Universal: Inclusion. Pembuatan Superclass Vehicle
 * Pembuat      : Naufal Shafi Anwar - 24060122140185
 * Lab          : B2
 */

public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance*price;
        System.out.println("Vehicle price = "+fare);
    }
}