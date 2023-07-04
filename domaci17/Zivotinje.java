package domaci17;

public abstract class Zivotinje {

    private String ime;
    private String nadimak;

    public Zivotinje(String ime, String nadimak) {
        this.ime = ime;
        this.nadimak = nadimak;
    }
    public abstract String zvuk();

    @Override
    public String toString() {
        return "ime: " + ime +
                ", nadimak: " + nadimak +
                ", zvuk: " + zvuk() +
                ", ";
    }
}


