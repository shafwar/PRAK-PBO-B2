/**
 * File         : Main.java
 * Deskripsi    : Program Tugas lanjutan Polimorfisme. Pembuatan Main Class
 * Pembuat      : Naufal Shafi Anwar - 24060122140185
 * Lab          : B2
 */

 public class Main {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Kucing");
        Anabul anjing = new Anjing("Anjing");
        Anabul burung = new Burung("Burung");

        kucing.gerak();
        kucing.bersuara();

        System.out.println();

        anjing.gerak();
        anjing.bersuara();

        System.out.println();

        burung.gerak();
        burung.bersuara();
    }
}

