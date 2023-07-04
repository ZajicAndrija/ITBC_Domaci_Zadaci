package domaci17;

import java.util.ArrayList;

/*
Napraviti klasu koja predstavlja računar. Računar ima broj procesora, količinu ram memorije i količinu memorije.
 Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB".
  Napraviti klasu laptop koja nasleđuje računar i ima dodatno polja za veličinu ekrana i enum za tastaturu (da li je internacionalna ili US).
  Isto implementirati toString, samo dodati još veličinu ekrana i tastaturu
  kao:  "Broj procesora: 4, ram: 16GB, memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"
  Napraviti klasu mobilni telefon koji nasleđuje računar i ima dodatno polja za jačinu kamere u megapikselima i enum za mrežu koju
   podržava (3G, 4G, 5G). Implementirati toString metodu da ispisuje
   "Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
   U main metodi napraviti listu računara, provući kroz jednu petlju i ispisati klasu kojoj objekat pripada (Da li je laptop ili mobilni)
 */
public class Zadatak2 {
    public static void main(String[] args) {


        Laptop laptop = new Laptop(15, 64, 1024, 15, Tastatura.INTERNATIONAL);
        Laptop laptop1 = new Laptop(12, 32, 256, 16.8,Tastatura.US);
        MobilniTelefon mobilni = new MobilniTelefon(11, 6, 512, 40, Mreza._3G);
        MobilniTelefon mobilni1 = new MobilniTelefon(4, 4, 32, 32, Mreza._5G);

        ArrayList<Racunar> racunari = new ArrayList<>();
        racunari.add(laptop);
        racunari.add(laptop1);
        racunari.add(mobilni);
        racunari.add(mobilni1);

        for(Racunar racunar : racunari){
            if (racunar instanceof Laptop){
                System.out.println("Laptop: " + racunar.toString());
            } else if (racunar instanceof MobilniTelefon){
                System.out.println("Mobilni: " + racunar.toString());
            }
        }
    }
}
