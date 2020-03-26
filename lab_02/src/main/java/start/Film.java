package start;

public class Film extends Zbior {
    private String narracja="brak",jezyk="polski";
    private int dlugosc=0;
    Film(){++numer;};
    Film(String nazwa, String autor, String narracja ,String jezyk, int dlugosc, double wartosc, int rok,String wyd){
        numer++;
        setNazwa(nazwa);
        setAutor(autor);
        setNarracja(narracja);
        setDlugosc(dlugosc);
        setJezyk(jezyk);
        setRokWydania(rok);
        setWydawnictwo(wyd);
        setWartosc(wartosc);
    }
    Film(String nazwa, String autor){
        setAutor(autor);
        setNazwa(nazwa);
    }
    public void setNarracja(String narracja) {
        this.narracja = narracja;
    }
    public String getNarracja() {
        return narracja;
    }
    public void setJezyk(String jezyk) {this.jezyk=jezyk;}
    public String getJezyk() {
        return jezyk;
    }
    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }
    public int getDlugosc() {
        return dlugosc;
    }


}
