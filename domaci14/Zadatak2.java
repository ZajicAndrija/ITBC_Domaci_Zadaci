/*
        Napraviti metodu koja radi konverziju valuta. Valute koje se koriste su EUR, USD, GBP.
        Napisati konverzije preko switch-a, tako sto proveravate koju je valutu korisnik uneo kao parametar,
        a vracate (return) u toj nekoj novoj valuti izracunatu vrednost. U main-u preko skenera korisnik unosi
        broj dinara koji zeli da konvertuje u neku valutu, i samu valutu kao string. Ispisati nekoliko primera
        poziva u main-u. Valute su vrednosti double i njih mozete uzeti sa sajta NBS. (3-4 poziva dovoljno).
         */
package domaci14;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj dinara: ");
        double iznos = input.nextInt();
        System.out.println("Unesite valutu (EUR, USD, GBP)");
        String valuta = input.next();
        valuta = valuta.toUpperCase();

        System.out.println(iznos + " RSD = " + exchange(iznos, valuta) + " " + valuta);

        System.out.println("Primer1: ");
        double iznos1 = 1000.0;
        String valuta1 = "GBP";
        System.out.println(iznos1 + " RSD = " + exchange(iznos1, valuta1) + " " + valuta1);

        System.out.println("Primer2: ");
        double iznos2 = 3247.0;
        String valuta2 = "USD";
        System.out.println(iznos2 + " RSD = " + exchange(iznos2, valuta2) + " " + valuta2);

input.close();
    }
    public static String exchange(double iznos, String valuta){
        double kurs = 0;

        switch (valuta){
            case "EUR":
                kurs = 117.2954;
                break;
            case "USD":
                kurs = 106.1977;
                break;
            case "GBP":
                kurs = 133.8683;
                break;
            default:
                System.out.println("Nepoznata valuta");
        }
        double ukupno = iznos / kurs;
        return String.format("%.2f",ukupno);
    }


}
