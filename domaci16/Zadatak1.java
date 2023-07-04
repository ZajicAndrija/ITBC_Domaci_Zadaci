package domaci16;

import java.util.ArrayList;

/*
Napraviti static metodu u main koje rade kao sql min, max, sum, avg i
distinct u SQLu koristeci ArrayList<Integer>. Ne morate praviti drugu
klasu sem main, a metode prihvataju ArrayList<Integer> kao parametar.
 Distinct vraća novi ArrayList<Integer> dok ostale metode imaju povratne
 tipove tipa int (za min, max i sum) i double (za avg)

 */
public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Integer> niz = new ArrayList<>();
        niz.add(5);
        niz.add(4);
        niz.add(10);
        niz.add(15);
        niz.add(5);

        System.out.println("Najmanji broj u nizu je: " + min(niz));
        System.out.println("Najveci broj u nizu je: " + max(niz));
        System.out.println("Zbir brojeva u nizu je: " + sum(niz));
        System.out.println("Prosecna vrednost brojeva u nizu je: " + avg(niz));
        System.out.println("Jedinstveni niz je: " + distinct(niz));

    }
    public static int min (ArrayList<Integer> najmanji){
        int min = najmanji.get(0);
        for (int broj : najmanji){
            if(broj < min){
                min = broj;
            }
        }
        return min;
    }
    public static int max (ArrayList<Integer> najveci){
        int max = najveci.get(0);
        for (int broj : najveci){
            if (broj > max){
                max = broj;
            }
        }
        return max;
    }
    public static int sum (ArrayList<Integer> suma){
        int sum = 0;
        for (int broj : suma){
            sum += broj;
        }
        return sum;
    }
    public static double avg (ArrayList<Integer> prosek){
        double avg = 0;
        int sum = 0;
        for(int broj : prosek){
            sum += broj;
            avg =(double) sum / prosek.size();
        }
        return avg;
    }
    public static ArrayList<Integer> distinct (ArrayList<Integer> jedinstveni) {
        ArrayList<Integer> distinct = new ArrayList<>();
        for (Integer integer : jedinstveni) {
            if (!distinct.contains(integer)) {
                distinct.add(integer);
            }
        }
        return distinct;
    }
}
