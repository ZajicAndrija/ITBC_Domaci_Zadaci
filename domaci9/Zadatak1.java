/*
        Napraviti paket domaci9 i klasu Zadatak1 i u njoj napraviti
        main metodu (public static void main...) preko skenera uneti
        svoje ime i prezime (odvojeno) i godinu rodjenja, ispisati
        ime i prezime i koliko godina imate.
         */
package domaci9;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite vase ime: ");
        String ime = input.nextLine();
        //Andrija

        System.out.println("Unesite vase prezime: ");
        String prezime = input.nextLine();
        //Zajic

        System.out.println("Unesite vasu godinu rodjenja: ");
        int godinaRodjenja = input.nextInt();
        //1993

        System.out.println("Vi se zovete " + ime  + " " + prezime + " i imate " + (2023 - godinaRodjenja) + " godina.");
        //Vi se zovete Andrija Zajic i imate 30 godina.

        input.close();

    }
}
