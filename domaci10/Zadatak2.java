/*
        Napraviti promenljive "username" i "password" i definisati neke vrednosti po zelji. Korisnik unosi
        preko skenera dve vrednosti koje bi trebale da predstavljaju username i password i program treba da ih uporedi.
         Ako su username i password tačni, ispisati "Uspešno ste se ulogovali", a ako je jedno od ta dva pogrešno
         ispisati istu poruku "Pogrešan username ili password".
         */

package domaci10;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite vas username");//Andrija
        String username = input.nextLine();

        System.out.println("Unesite vas password");//Zajic
        String password = input.nextLine();

        if(username.equals("Andrija") && password.equals("Zajic")){
            System.out.println("Uspesno ste se ulogovali");
        } else {
            System.out.println("Pogresan username ili password");
        }
        input.close();
    }
    }



