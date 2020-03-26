package start;

public class Ksiazka extends Zbior {
    protected int liczba_str=0;
    protected String gatunek="nieokreslony";
    Ksiazka(String nazwa, String autor, String gatunek ,int liczba_str, double wartosc, int rok,String wyd){
        numer++;
        setNazwa(nazwa);
        setAutor(autor);
        setWydawnictwo(wyd);
        setGatunek(gatunek);
        setLiczba_str(liczba_str);
        setRokWydania(rok);
        setWartosc(wartosc);

    };
    Ksiazka(){numer++;};
    Ksiazka(String nazwa, String autor){
        setAutor(autor);
        setNazwa(nazwa);
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }
    public void setLiczba_str(int liczba_str) {
        this.liczba_str = liczba_str;
    }
    public int getLiczba_str() {
        return liczba_str;
    }
    public String getGatunek() {
        return gatunek;
    }
}
