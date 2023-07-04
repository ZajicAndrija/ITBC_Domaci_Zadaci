package domaci17;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        Pas pas1 = new Pas("Dzeki", "Dzeks", false);
        Pas pas2 = new Pas("Beta", "Betica", true);
        Macka macka1 = new Macka("Garfield", "Garfi", 15);
        Macka macka2 = new Macka("Tom", "Tomi", 3);

        ArrayList<Zivotinje> zivotinje = new ArrayList<>();
        zivotinje.add(pas1);
        zivotinje.add(pas2);
        zivotinje.add(macka1);
        zivotinje.add(macka2);

        for (Zivotinje zivotinja : zivotinje) {
            if (zivotinja instanceof Pas) {
                System.out.println("Dog: " + zivotinja.toString());
            } else if (zivotinja instanceof Macka) {
                System.out.println("Cat: " + zivotinja.toString());
            }
        }

    }
}
