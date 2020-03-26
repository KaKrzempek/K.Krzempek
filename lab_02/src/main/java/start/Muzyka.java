package start;

public class Muzyka extends  Zbior{
    private String gatunek="nieokreslony";
    private double dlugosc=0;

    Muzyka(){numer++;};
    Muzyka(String nazwa, String autor){
        setAutor(autor);
        setNazwa(nazwa);
    }
    Muzyka(String nazwa, String autor, String gatunek,double dlugosc, double wartosc, int rok,String wyd){
        numer++;
        setNazwa(nazwa);
        setAutor(autor);
        setWydawnictwo(wyd);
        setGatunek(gatunek);
        setRokWydania(rok);
        setWartosc(wartosc);
        setDlugosc(dlugosc);
    };
    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }
    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

}
