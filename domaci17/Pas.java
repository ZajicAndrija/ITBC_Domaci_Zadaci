package domaci17;

public class Pas extends Zivotinje{

    private boolean goodBoy;

    public Pas(String ime, String nadimak, boolean goodBoy) {
        super(ime, nadimak);
        this.goodBoy = goodBoy;
    }

    public String isGoodBoy() {
        if (goodBoy) {
            return "I am a good boy.";
        } else {
            return "I am a bad boy.";
        }
    }
    @Override
    public String zvuk() {
        return "woof";
    }

    @Override
    public String toString() {
        return super.toString() +
                isGoodBoy();
    }
}
