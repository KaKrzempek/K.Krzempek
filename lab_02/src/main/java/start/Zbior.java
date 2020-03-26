package start;

import java.util.ArrayList;

public class Zbior {
    protected String nazwa="brak nazwy",autor="brak autora",wydawnictwo="brak wydawnictwa";
    protected static int numer=0;
    protected int RokWydania=1448,ID=numer;
    protected double  WartoscZbioru=0;
    protected int MaxCzasWypozyczenia=30,CzasWypozyczenia=0,IdPosiadacza=-1;
    protected double OplataZa1Dzien=0.05;

     //set dane zbioru
     public  void setNazwa(String nazwa){
         this.nazwa=nazwa;
     }
     public void setAutor(String autor){
         this.autor=autor;
     }
     public void setWydawnictwo(String wydawnictwo){
         this.wydawnictwo=wydawnictwo;
     }
     public void setRokWydania(int RokWydania){
        if(RokWydania>1452&&RokWydania<=2020)
        this.RokWydania=RokWydania;
        else System.out.println("Bledna wartosc");
     }
     public void setWartosc(double wartosc){
        if(wartosc>0)
         this.WartoscZbioru=wartosc;
        else System.out.println("Bledna wartosc");
     }

     //set dane zwiazane z wypozyczeniem
   public void setMaxCzasWypozyczenia(int czas) {
        if(czas>0)MaxCzasWypozyczenia = czas;
        else System.out.println("Bledna wartosc");
    }

    public void setOplataZaOpoznienie(double oplataZl) {
        if(oplataZl>=0)OplataZa1Dzien = oplataZl;
        else System.out.println("Bledna wartosc");
    }
    public void setCzasWypozyczenia(int czasWypozyczenia) {
        if(czasWypozyczenia>=0)CzasWypozyczenia = czasWypozyczenia;
        else System.out.println("Bledna wartosc");
    }

   //get
     public String getNazwa(){
         return nazwa;
     }
     public String getAutor() {
         return autor;
     }
     public String getWydawnictwo() {
         return wydawnictwo;
     }
     public int getRokWydania() {
         return RokWydania;
     }
     public double getWartoscZbioru() {
         return WartoscZbioru;
     }
     public int getID() {
        return ID;
    }
    public double getOplataZa1Dzien() {
        return OplataZa1Dzien;
    }
    public int getCzasWypozyczenia() {
        return CzasWypozyczenia;
    }

    //uslugi
    public void Wypozyczenie(Uzytkownik Chcacy,int AktualnyCzas) {
        if (IdPosiadacza == Chcacy.getID()) System.out.println("Juz wypozyczone tej osobie");
        else if (IdPosiadacza>=0)
            System.out.println("Wypozyczone przez kogos innego");

        else {
            if (Chcacy.getBlokada()) {
                System.out.println("Blokada. Ureguluj oplate za wczesniejsze wypozyczenie");
            } else {
                System.out.println("Wypozyczyles. Dziekujemy");
                IdPosiadacza=Chcacy.getID();
                setCzasWypozyczenia(AktualnyCzas);
                 Chcacy.DopiszDoKonta(this.nazwa,this.autor);
            }
        }
    }

    public int Zwrot (int AktualnyCzas){
        if(IdPosiadacza>=0){
            System.out.println("Zwrociles: "+nazwa+". Dziekujemy");
            int czas=AktualnyCzas-CzasWypozyczenia;
            if(czas>MaxCzasWypozyczenia)
            {
                double oplata=OplataZa1Dzien*(czas-MaxCzasWypozyczenia);
                System.out.println("Niestety - zwrot po terminie, naliczono oplate:"+String.format("%.2f", oplata)+" zl");


            }
           setCzasWypozyczenia(0);
            int id=IdPosiadacza;
            IdPosiadacza=-1;
            return id;
        }
        else System.out.println("Juz zwrocone.");
        return -1;
    }

    public int PoTerminie(int AktualnyCzas){
         if(CzasWypozyczenia-AktualnyCzas<0){
             return IdPosiadacza;
         }
         else return -1;
}

}

