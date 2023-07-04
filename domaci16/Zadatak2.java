package domaci16;
/*
Napraviti klasu Konverter koja kao atribute ima rsd i valutu. Valuta je enum, dok je rsd celi broj. Valuta treba da bude jedna od:
EUR, USD, AUD, CAD, RUB i GBP. Kroz konstruktor se unose vrednosti za dinare (rsd) i valutu, i postoje seteri, ali ne postoje geteri.
Napraviti metodu koja služi za konvertovanje valute u onu koja je prosleđena kroz konstruktor ili seter.
Znači rsd pretvara u tu neku valutu. U metodi koristiti iif else ili switch za poređenje.
Pogledati kako se porede enum-i u javi najpravilnije.
U main-u testirati tako što će te napraviti jedan objekat tipa Konverter i isprobati za sve valute.

 */
public class Zadatak2 {
    public static void main(String[] args) {

        Zad2Konverter rsd = new Zad2Konverter();
        rsd.setRsd(10000);

        for (Zad2Valuta valuta : Zad2Valuta.values()) {
            rsd.setValuta(valuta);
            rsd.konvertuj();
        }

    }
}
