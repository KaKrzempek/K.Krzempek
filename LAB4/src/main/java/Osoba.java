public class Osoba {
    String imie,nazwisko;
    Osoba(String imie,String nazwisko){
        setImie(imie);
        setNazwisko(nazwisko);
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
}
    public String getImie() {
        return imie;
    }
}
