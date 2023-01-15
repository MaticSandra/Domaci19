package DodatniZadatakTest;

public class MobilniTelefon extends Racunar {
    int kamera;
    Mreza mreza;

    public MobilniTelefon(int brojProcesora, int kolicinaRama, int kolicinaMemorije, int kamera, Mreza mreza){
        super(brojProcesora, kolicinaRama, kolicinaMemorije);
        this.kamera = kamera;
        this.mreza = mreza;
    }

    @Override
    public String toString() {
        return super.toString() + " kamera: " + kamera+ "megapixela, mreza: " + mreza;
    }
}
