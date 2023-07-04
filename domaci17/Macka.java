package domaci17;

public class Macka extends Zivotinje{

    private double tezina;

    public Macka(String ime, String nadimak, double tezina) {
        super(ime, nadimak);
        this.tezina = tezina;
    }

    public String chonk(){
        if(tezina < 5){
            return "I'm not a chonk";
        } else {
            return "I'm a chonk";
        }
    }

    @Override
    public String zvuk() {
        return "meow";
    }

    @Override
    public String toString() {
        return super.toString() +
                " tezina: " + tezina + "Kg, " +
                chonk();
    }
}
