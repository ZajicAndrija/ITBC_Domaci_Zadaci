package domaci13;
/*
        Napraviti metodu koja vraca boolean tip i prihvata kao parametre 2 integer-a. Metoda vraća true samo ako su
        ta dva integer-a jedan za drugim, na primer 16 17 ili 24 25. U main metodi ispisati sa println nekoliko
        primera kako bi ste testirali (4-5 poziva je dovoljno)
         */
public class Zadatak1 {
    public static void main(String[] args) {

        System.out.println(convert(5,6));
        System.out.println(convert(4,7));
        System.out.println(convert(23,23));
        System.out.println(convert(56,57));
        System.out.println(convert(-2,-1));
    }

    public static boolean convert(int a, int b) {
        if(b==a+1){
            return true;
        } else {
            return false;
        }
    }
}
