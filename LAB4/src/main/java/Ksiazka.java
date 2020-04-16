public class Ksiazka extends Zbior {
    protected int liczba_str=0;
    protected String gatunek="nieokreslony";
    Ksiazka(){};
    Ksiazka(String nazwa, String autorI,String autorN, double wartosc, int rok,String wyd,String gatunek ,int liczba_str){
        super(nazwa,autorI,autorN,wartosc,rok,wyd);
        setGatunek(gatunek);
        setLiczba_str(liczba_str);
    };
    Ksiazka(String nazwa,String autorI,String autorN)     {
        super(nazwa,autorI,autorN);
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
