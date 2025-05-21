/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : BangunDatarGeneric.java
 * Tanggal : 10 Mei 2025
 */

package bangundatargenerik;
import java.util.Iterator;

/**
 *
 * @author noels
 */
public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T1 get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
    
    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }
    
}
