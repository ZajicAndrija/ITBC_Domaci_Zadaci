package domaci16;

public class Zad2Konverter {
    private int rsd;
    private Zad2Valuta valuta;

    public Zad2Konverter(){
    }

    public Zad2Konverter(int rsd, Zad2Valuta valuta) {
        this.rsd = rsd;
        this.valuta = valuta;
    }

    public void setRsd(int rsd) {
        this.rsd = rsd;
    }

    public void setValuta(Zad2Valuta valuta) {
        this.valuta = valuta;
    }
    public void konvertuj() {
        int zamena = 0;
        switch (valuta) {
            case EUR:
                zamena = rsd / 117;
                break;
            case USD:
                zamena = rsd / 109;
                break;
            case AUD:
                zamena = rsd / 71;
                break;
            case CAD:
                zamena = rsd / 80;
                break;
            case RUB:
                zamena = rsd / 1;
                break;
            case GBP:
                zamena = rsd / 134;
                break;
        }
        System.out.println(rsd + " RSD = " + zamena + " " + valuta);
    }
    @Override
    public String toString() {
        return "Zad2Konverter{" +
                "rsd=" + rsd +
                ", valuta=" + valuta +
                '}';
    }
}
