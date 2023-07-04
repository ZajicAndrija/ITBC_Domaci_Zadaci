/*
       Napraviti metodu koja ispisuje tekst i prihvata kao parametre dva String-a. Ispis je u sledećem formatu:
       “Ime: “ text1 “i Prezime: “ text 2. text1 treba da budu sva velika slova, dok text2 treba da budu sva mala slova.
        U main metodi pozvati nekoliko primera kako bi ste testirali (2-3 poziva je dovoljno)
        */
package domaci13;

public class Zadatak2 {
    public static void main(String[] args) {

        slova("Andrija","Zajic");
        slova("pera","perIC");
        slova("STevaN","STEVANOVIC");
    }
    public static void slova(String ime, String prezime){

        String text1 = ime.toUpperCase();
        String text2 = prezime.toLowerCase();
        System.out.println("Ime: " + text1 + " i Prezime: " + text2);
    }


}
