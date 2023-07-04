package domaci17;
/*
 Napraviti klasu laptop koja nasleđuje računar i ima dodatno polja za veličinu ekrana i enum za tastaturu (da li je internacionalna ili US).
  Isto implementirati toString, samo dodati još veličinu ekrana i tastaturu
  kao:  "Broj procesora: 4, ram: 16GB, memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"
 */
public class Laptop extends Racunar{
    private double velicinaEkrana;
    private Tastatura tastatura;

    public Laptop(){
    }

    public Laptop(double velicinaEkrana, Tastatura tastatura) {
        this.velicinaEkrana = velicinaEkrana;
        this.tastatura = tastatura;
    }

    public Laptop(int brojProcesora, int kolicinaRamMemorije, int kolicinaMemorije, double velicinaEkrana, Tastatura tastatura) {
        super(brojProcesora, kolicinaRamMemorije, kolicinaMemorije);
        this.velicinaEkrana = velicinaEkrana;
        this.tastatura = tastatura;
    }

    public double getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setVelicinaEkrana(double velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }

    public Tastatura getTastatura() {
        return tastatura;
    }

    public void setTastatura(Tastatura tastatura) {
        this.tastatura = tastatura;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ekran: " + velicinaEkrana +
                "\", tastatura: " + tastatura;
    }
}
