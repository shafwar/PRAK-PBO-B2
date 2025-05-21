/**
 * File         : Person.java
 * Deskripsi    : Program latihan penggunaan Polimorfisme Universal: Inclusion. Pembuatan Superclass Person
 * Pembuat      : Naufal Shafi Anwar - 24060122140185
 * Lab          : B2
 */

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean isAsleep(int hr) {
        return hr < 7 || hr > 22;
    }

    public String toString() {
        return name;
    }

    public void status(int hr) {
        if (this.isAsleep(hr)) {
            System.out.println("Now offline: " + this);
        } else {
            System.out.println("Now online: " + this);
        }
    }
}