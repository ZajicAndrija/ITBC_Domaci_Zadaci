package domaci17;
/*
 Računar ima broj procesora, količinu ram memorije i količinu memorije.
 Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB".
 */
public class Racunar {
    private int brojProcesora;
    private int kolicinaRamMemorije;
    private int kolicinaMemorije;

    public Racunar(){
    }

    public Racunar(int brojProcesora, int kolicinaRamMemorije, int kolicinaMemorije) {
        this.brojProcesora = brojProcesora;
        this.kolicinaRamMemorije = kolicinaRamMemorije;
        this.kolicinaMemorije = kolicinaMemorije;
    }

    public int getBrojProcesora() {
        return brojProcesora;
    }

    public void setBrojProcesora(int brojProcesora) {
        this.brojProcesora = brojProcesora;
    }

    public int getKolicinaRamMemorije() {
        return kolicinaRamMemorije;
    }

    public void setKolicinaRamMemorije(int kolicinaRamMemorije) {
        this.kolicinaRamMemorije = kolicinaRamMemorije;
    }

    public int getKolicinaMemorije() {
        return kolicinaMemorije;
    }

    public void setKolicinaMemorije(int kolicinaMemorije) {
        this.kolicinaMemorije = kolicinaMemorije;
    }

    @Override
    public String toString() {
        return "BrojProcesora: " + brojProcesora +
                ", Ram: " + kolicinaRamMemorije + "GB" +
                ", Memorija: " + kolicinaMemorije + "GB, ";
    }
}
