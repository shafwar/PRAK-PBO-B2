/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : BangunDatarGenericTest.java
 * Tanggal : 10 Mei 2025
 */

package bangundatargenerik;
import java.util.ArrayList;

/**
 *
 * @author noels
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran L = new Lingkaran(2);
        Persegi P = new Persegi(2);
        PersegiPanjang PP = new PersegiPanjang(2, 3);
        Segitiga S = new Segitiga(2, 3);
        ArrayList<BangunDatar> ArrayOfBangunDatar = new ArrayList<>();
        
        ArrayOfBangunDatar.add(L);
        ArrayOfBangunDatar.add(P);
        ArrayOfBangunDatar.add(PP);
        ArrayOfBangunDatar.add(S);

        BangunDatarGeneric<BangunDatar> sigma = new BangunDatarGeneric<>();

        for (BangunDatar bd : ArrayOfBangunDatar) {
            sigma.set(bd);
            System.out.println(bd);
            System.out.println("Keliling: " + bd.hitungKeliling());
            System.out.println("Luas: " + bd.hitungLuas());
            System.out.println("Tipe generic: " + bd.getClass().getName());
            System.out.println();
        }
        
    }
}
