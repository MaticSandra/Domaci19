package DodatniZadatakTest;

public class Laptop extends Racunar {
     double ekran;
     Tastatura tastatura;

     public Laptop(int brojProcesora, int kolicinaRama, int kolicinaMemorije, double ekran, Tastatura tastatura){
         super(brojProcesora, kolicinaRama, kolicinaMemorije);
         this.ekran = ekran;
         this.tastatura = tastatura;
     }

    @Override
    public String toString() {
        return super.toString() + " velicina ekrana: " + ekran + "tastatura: " + tastatura;
    }
}
