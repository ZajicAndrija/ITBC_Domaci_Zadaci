/*
Napisati for petlju koja ide od 0 do 1000 i prikazuje sve brojeve deljive sa 3
*/
package domaci11;

public class Zadatak1 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i <= 1000; i++){
            if( i % 3 == 0){
                count = count + 1;
            }
        }
        System.out.println("Ukupno ima " + count + " brojeva deljivih sa 3.");
    }
}
