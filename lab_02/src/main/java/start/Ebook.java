package start;

public class Ebook extends Ksiazka {
    private double waga_MB=0;
    private String typ_pliku="pdf";
    Ebook(){numer++;};
    Ebook(String nazwa, String autor, String gatunek ,int liczba_str, double wartosc, int rok,String wyd,double waga_MB,String typ){
        numer++;
        setNazwa(nazwa);
        setAutor(autor);
        setWydawnictwo(wyd);
        setGatunek(gatunek);
        setLiczba_str(liczba_str);
        setRokWydania(rok);
        setWartosc(wartosc);
        setTyp_pliku(typ);
        setWaga_MB(waga_MB);

    };
    Ebook(String nazwa, String autor){
        setAutor(autor);
        setNazwa(nazwa);
    }
    public void setTyp_pliku(String typ_pliku) {
        this.typ_pliku = typ_pliku;
    }
    public void setWaga_MB(double waga_MB) {
        this.waga_MB = waga_MB;
    }
    public double getWaga_MB() {
        return waga_MB;
    }
    public String getTyp_pliku() {
        return typ_pliku;
    }
}
