
//Napisati program gde korisnik unese dan pa mesec rodjenja i program vrati koji je to horoskopski znak.

package domaci10;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite dan rodjenja: ");
        int dan = input.nextInt();

        System.out.println("Unesite mesec rodjenja: ");
        int mesec = input.nextInt();


        if (mesec == 1 && dan >= 21 && dan <= 31) {
            System.out.println("Vi ste vodolija");
        } else if (mesec == 2 && dan < 20 && dan >0) {
            System.out.println("Vi ste vodolija");
        } else if (mesec == 2 && dan >= 20 && dan <=30) {
            System.out.println("Vi ste ribe");
        } else if (mesec == 3 && dan < 21 && dan >0) {
            System.out.println("Vi ste ribe");
        } else if (mesec == 3 && dan >= 21 && dan <=31) {
            System.out.println("Vi ste ovan");
        } else if (mesec == 4 && dan < 20 && dan >0) {
            System.out.println("Vi ste ovan");
        } else if (mesec == 4 && dan >= 21 && dan <=30) {
            System.out.println("Vi ste bik");
        } else if (mesec == 5 && dan <= 21 && dan >0) {
            System.out.println("Vi ste bik");
        } else if (mesec == 5 && dan >= 22 && dan <=31) {
            System.out.println("Vi ste blizanac");
        } else if (mesec == 6 && dan <= 21 && dan >0) {
            System.out.println("Vi ste blizanac");
        } else if (mesec == 6 && dan >= 22 && dan <=30) {
            System.out.println("Vi ste rak");
        } else if (mesec == 7 && dan <= 22 && dan >0) {
            System.out.println("Vi ste rak");
        } else if (mesec == 7 && dan >= 23 && dan <=31) {
            System.out.println("Vi ste lav");
        } else if (mesec == 8 && dan <= 22 && dan >0) {
            System.out.println("Vi ste lav");
        } else if (mesec == 8 && dan >= 23 && dan <=31) {
            System.out.println("Vi ste devica");
        } else if (mesec == 9 && dan <= 22 && dan >0) {
            System.out.println("Vi ste devica");
        } else if (mesec == 9 && dan >= 23 && dan <=30) {
            System.out.println("Vi ste vaga");
        } else if (mesec == 10 && dan <= 23 && dan >0) {
            System.out.println("Vi ste vaga");
        } else if (mesec == 10 && dan >= 24 && dan <=31) {
            System.out.println("Vi ste skorpija");
        } else if (mesec == 11 && dan <= 22 && dan >0) {
            System.out.println("Vi ste skorpija");
        } else if (mesec == 11 && dan >= 23 && dan <=30) {
            System.out.println("Vi ste strelac");
        } else if (mesec == 12 && dan <= 21 && dan >0) {
            System.out.println("Vi ste strelac");
        } else if (mesec == 12 && dan >= 22 && dan <= 31) {
            System.out.println("Vi ste jarac");
        } else if (mesec == 1 && dan <= 20 && dan>0) {
            System.out.println("Vi ste jarac");
        } else {
            System.out.println("Unesite validne podatke");
        }
        input.close();
    }
}

