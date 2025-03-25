public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // membuat objek titik T1 (0,0)
        Titik T2 = T1; // membuat objek titik T2 yang bernilai sama dengan T1
        T1.setAbsis(3); // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // Mencetak koordinat T1 ke layar
        T1.geser(3, 4); // menggeser T1 sejauh (3,4)
        T1.printTitik(); // menampilkan koordinat T1 setelah digeser
        T2.printTitik(); // menampilkan koordinat T2 ke layar
        T1.setAbsis(10); // mengeset absis T1 dengan nilai 10
        T1.setOrdinat(10); // mengeset ordinat T1 dengan nilai 10
        T2.printTitik(); // menampilkan koordinat T2 ke layar
        System.out.println("Berada di kuadran: " + T1.getKuadran()); // menampilkan titik T1 berada kuadran berapa
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat()); // menampilkan jarak titik T1 dengan pusat(0,0)
        System.out.println("Jarak ke pusat: " + T1.getJarak(T2)); // menampilkan jarak titik T1 dengan T2
        T1.setRefelksiX(); // merefleksikan titik pada sumbu x
        T1.printTitik(); // menampilkan koordinat T1 ke layar
        T1.setRefelksiY(); // merefleksikan titik pada sumbu y
        T1.printTitik(); // menampilkan koordinat T1 ke layar
        System.out.println("Berada di kuadran: " + T1.getKuadran()); // menampilkan titik T1 berada kuadran berapa
        Titik reflekX = T1.getRefleksiX(); // membuat titik baru yang diisi dengan T1 yang direfleksikan pada sumbu X
        reflekX.printTitik(); // menampilkan koordinat reflekX ke layar
        Titik reflekY = T1.getRefleksiY(); // membuat titik baru yang diisi dengan T1 yang direfleksikan pada sumbu y
        reflekY.printTitik();  // menampilkan koordinat reflekY ke layar

        

        



        /* Titik T1 = new Titik();
        Titik T2 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());
        

        T1.printCounterTitik();
         */
    }
}
