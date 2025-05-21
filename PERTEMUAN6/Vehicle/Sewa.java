/**
 * File         : Sewa.java
 * Deskripsi    : Program latihan penggunaan Polimorfisme Universal: Inclusion. Pembuatan Class Main
 * Pembuat      : Naufal Shafi Anwar - 24060122140185
 * Lab          : B2
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50,1000);
    }
}

// Keuntungan kita mempunyai method hitungSewa(Vehicle v):
// Membuat kode lebih modular, fleksibel, dan mudah dikembangkan. Mengurangi duplikasi dan ketergantungan antar kode. Method serbaguna untuk objek dari berbagai subclass Vehicle