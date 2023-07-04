/*
        Kreirati dva niza i prikazati koji niz ima vise clanova
        (Ne morate petlju koristiti vec mozete if statement)
        */

package domaci12;

public class Zadatak3 {
    public static void main(String[] args) {

        int[] niz1 = {23, 3, 5, 12, 34, 22, 66, 45};
        int[] niz2 = {2, 4, 1, 89, 65, 35, 44};

        if(niz1.length > niz2.length){
            System.out.println("Prvi niz ima vise clanova.");
        } else if(niz1.length < niz2.length){
            System.out.println("Drugi niz ima vise clanova");
        } else {
            System.out.println("Imaju isto clanova.");
        }
    }
}
