/**
 * File         : TestPolimorfisme.java
 * Deskripsi    : Main class
 * Pembuat      : Naufal Shafi Anwar - 24060122140185
 * Lab          : B2
 */

import java.util.ArrayList;

public class TestPolimorfisme{
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer ("Mira");
        Pegawai pegawai2 = new Manajer ("Joko");
        Manajer pegawai3 = new Manajer ("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add (pegawai);
        emps.add (pegawai2);
        emps.add (pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData ();
        }
    }
}

// 2. Jelaskan manfaat polimorfisme pada kasus ini.
//     Polimorfisme memungkinkan objek Manajer dan Programmer diperlakukan sebagai Pegawai, sehingga kita bisa menyimpan semua 
// jenis pegawai dalam satu array dan memanggil metode tampilData() tanpa perlu mengetahui tipe spesifiknya. 
// Ini membuat program lebih fleksibel, efisien, dan mudah dikembangkan.


// 3. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
//      Tanpa polimorfisme, setiap jenis pegawai harus ditangani secara terpisah. Kita tidak bisa menyimpan semua pegawai dalam satu array atau memprosesnya 
// dengan satu perulangan. Akibatnya, kode menjadi lebih panjang, kurang fleksibel, dan sulit untuk diperluas saat jumlah pegawai bertambah.