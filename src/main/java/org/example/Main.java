package org.example;

import DodatniZadatakTest.*;

import java.util.ArrayList;

public class Main {
    /*Napraviti klasu koja predstavlja racunar. Racunar ima broj procesora, kolicinu ram memorije i kolicinu memorije.
    Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB".

Napraviti klasu laptop koja nasledjuje racunar i ima dodatno polja za velicinu ekrana i enum za tastaturu (da li je internacionalna ili US).
Isto implementirati toString, samo dodati jos velicinu ekrana i tastaturu kao:
 "Broj procesora: 4, ram: 16GB, memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"
Napraviti klasu mobilni telefon koji nasledjuje racunar i ima dodatno polja za jacinu kamere
u megapikselima i enum za mrezu koju podrzava (3G, 4G, 5G). Implementirati toString metodu da ispisuje
"Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
U main metodi napraviti listu racunara, provuci kroz jednu petlju i ispisati klasu koja je + pozvati toString.
Treba lepo da se ispise klasa samo kao Racunar, Laptop ili Mobilni, a ne class paket.Racunar
*/
    public static void main(String[] args) {

        Racunar racunar = new Racunar(8, 1024,32);

        Laptop laptop1 = new Laptop(3, 512,16, 17.5, Tastatura.US);

        MobilniTelefon mob1 = new MobilniTelefon(3,512,8,12, Mreza.CETIRI_G);

        ArrayList<Racunar> lista = new ArrayList<>();
        lista.add(racunar);
        lista.add(mob1);
        lista.add(laptop1);

        for (int i = 0; i < lista.size(); i++) {
            Racunar trenutniRacunar = lista.get(i);
            System.out.println(trenutniRacunar.getClass().getSimpleName() + ": " + trenutniRacunar.toString());

        }

    }
}
