package DodatniZadatakTest;

public class Laptop extends Racunar {
     double velicinaEkrana;
     Tastatura tastatura;

     public Laptop(int brojProcesora, int kolicinaRama, int kolicinaMemorije, double velicinaEkrana, Tastatura tastatura){
         super(brojProcesora, kolicinaRama, kolicinaMemorije);
         this.velicinaEkrana = velicinaEkrana;
         this.tastatura = tastatura;
     }

    @Override
    public String toString() {
        return super.toString() + " velicina ekrana: " + velicinaEkrana + "tastatura: " + tastatura;
    }
}
