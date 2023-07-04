/*
Pomocu while petlje, korisnik neprestano unosi brojeve i oni se sabiraju. Kada korisnik upise 0,
program ispisuje sumu prethodno unetih brojeva i program se zavrsava.
*/
package domaci11;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Uneti broj: ");
        int i = input.nextInt();
        int sum = i;

        while (i != 0 ) {
            System.out.println("Uneti broj: ");
            i = input.nextInt();
            sum = sum + i;
        }
            System.out.println("Zbir je: " + sum);

            input.close();
    }

    }
