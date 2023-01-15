package DodatniZadatakTest;

public class Racunar {
    int brojProcesora;
    int kolicinaRama;

    int kolicinaMemrije;

    public Racunar(){}

    public Racunar(int brojProcesora, int kolicinaRama, int kolicinaMemrije) {
        this.brojProcesora = brojProcesora;
        this.kolicinaRama = kolicinaRama;
        this.kolicinaMemrije = kolicinaMemrije;
    }

    @Override
    public String toString() {
        return "Broj procesora: " + brojProcesora+" ram: " + kolicinaRama + "GB memorija: " + kolicinaMemrije + "GB";
    }
}
