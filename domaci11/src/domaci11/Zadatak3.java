/*
Sa do while petljom uraditi sumu brojeva koje korisnik unese. Minimum jedan broj mora da se unese (to do while
svakako obezbedjuje).Program ispisuje koja je suma kada upisete 0 ili negativan broj
 */
package domaci11;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Uneti broj: ");
        int i = input.nextInt();
        int sum = 0;

        do {
            sum = sum + i;
            System.out.println("Uneti broj: ");
            i = input.nextInt();
        }
        while (i > 0);
        System.out.println("Zbir je: " + sum);

        input.close();
    }
}
