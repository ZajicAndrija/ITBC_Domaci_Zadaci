package domaci17;
/*
Napraviti klasu mobilni telefon koji nasleđuje računar i ima dodatno polja za jačinu kamere u megapikselima i enum za mrežu koju
   podržava (3G, 4G, 5G). Implementirati toString metodu da ispisuje
   "Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
 */
public class MobilniTelefon extends Racunar{
    private int jacinaKamereMpx;
    private Mreza mreza;

    public MobilniTelefon(){
    }

    public MobilniTelefon(int jacinaKamereMpx, Mreza mreza) {
        this.jacinaKamereMpx = jacinaKamereMpx;
        this.mreza = mreza;
    }

    public MobilniTelefon(int brojProcesora, int kolicinaRamMemorije, int kolicinaMemorije, int jacinaKamereMpx, Mreza mreza) {
        super(brojProcesora, kolicinaRamMemorije, kolicinaMemorije);
        this.jacinaKamereMpx = jacinaKamereMpx;
        this.mreza = mreza;
    }

    public int getJacinaKamereMpx() {
        return jacinaKamereMpx;
    }

    public void setJacinaKamereMpx(int jacinaKamereMpx) {
        this.jacinaKamereMpx = jacinaKamereMpx;
    }

    public Mreza getMreza() {
        return mreza;
    }

    public void setMreza(Mreza mreza) {
        this.mreza = mreza;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Kamera: " + jacinaKamereMpx + "Megapixela" +
                ", mreza: " + mreza.toString().replaceAll("_", "");
    }
}
