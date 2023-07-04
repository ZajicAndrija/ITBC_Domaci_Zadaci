/*
        Napraviti metodu koja ispisuje niz i kao parametre prihvata niz. Unutar metode pronaći najveću vrednost u nizu,
         a zatim tu vrednost postaviti kao vrednost svakog elementa u nizu. Koristiti scanner za popunjavanje
         početnog niza. (3-4 poziva dovoljno).
         */
package domaci14;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite veličinu niza: ");
        int n = input.nextInt();

        int[] nizA = new int[n];
        int[] nizB = new int[n];
        int[] nizC = new int[n];

        System.out.println("Unesite elemente niza A: ");
        for (int i = 0; i < nizA.length; i++) {
            nizA[i] = input.nextInt();
        }
        max(nizA);

        System.out.println("Unesite elemente niza B: ");
        for(int i = 0; i < nizB.length; i++){
            nizB[i] = input.nextInt();
        }
        max(nizB);

        System.out.println("Unesite elemente niza C: ");
        for (int i = 0; i < nizC.length; i++){
            nizC[i] = input.nextInt();
        }
        max(nizC);

        input.close();
}
public static void max (int[] niz) {
    int max = niz[0];
    for (int i = 0; i < niz.length; i++) {
        if (niz[i] > max) {
            max = niz[i];
        }
    }
    for (int i = 0; i < niz.length; i++) {
        niz[i] = max;

    }
    System.out.println(Arrays.toString(niz));
}
}
