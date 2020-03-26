package start;

import java.util.ArrayList;

public class Uzytkownik {
    private static int numer=0;
    private int ID=numer;
    private boolean blokada=false;
    private String nazwisko, imie;
    ArrayList<String> Historia= new ArrayList<String>();
    Uzytkownik( String nazwisko,String imie){
        setNazwsko(nazwisko);
        setImie(imie);
        numer++;
    }
    public void setNazwsko(String nazwsko) {
        this.nazwisko = nazwsko;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getID() {
        return ID;
    }
    public String getNazwisko() {
        return nazwisko;
    }

    //Blokada
    public void setBlokada(boolean blokada){

        this.blokada=blokada;
    }
    public boolean getBlokada(){
        return blokada;
    }

    //Historia wypozyczen
    public void DopiszDoKonta(String nazwa, String autor){
        Historia.add(nazwa+"  "+autor);
    }
    public void ZobaczHistorie(){
        System.out.println("Uzytkownik: "+imie+" "+nazwisko);
        System.out.println("Historia wypozyczen: ");
        int i=Historia.size()-1;
        if(i<0) System.out.println("Brak Historii");
        else{
            do
            {
                System.out.println(Historia.get(i--));
            }while(i>=0);
        }
    }



    }

