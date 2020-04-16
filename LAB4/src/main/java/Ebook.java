public class Ebook extends Ksiazka {
    private double waga_MB=0;
    private String typ_pliku="pdf";
    Ebook(){}
    Ebook(String nazwa, String autorI,String autorN, String gatunek ,int liczba_str, double wartosc, int rok,String wyd,double waga_MB,String typ){
        super(nazwa,autorI,autorN,wartosc,rok,wyd,gatunek,liczba_str);
        setTyp_pliku(typ);
        setWaga_MB(waga_MB);
    };
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
