/*
        Kreirati niz proizvoljne duzine celobrojnih vrednosti i pomnoziti poslednji clan
        sa ukupnim brojem clanova (Koristiti .length, ne fiksnu vrednost)
         */

package domaci12;

public class Zadatak2 {
    public static void main(String[] args) {

        int[] niz = {3, 6, 35, 15, 27, 8, 45, 22};

        int poslednjiClan = niz[niz.length - 1];
        int sum = poslednjiClan * niz.length;

        System.out.println("Proizvod je: " + sum);
    }
}
