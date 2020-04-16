public class Muzyka extends  Zbior{
    private String gatunek="nieokreslony";
    private double dlugosc=0;

    Muzyka(String nazwa, String autorI,String autorN, String gatunek,double dlugosc, double wartosc, int rok,String wyd){
        super(nazwa,autorI,autorN,wartosc,rok,wyd);
        setGatunek(gatunek);
        setDlugosc(dlugosc);
    };
    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }
    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

}
