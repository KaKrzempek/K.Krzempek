import java.util.ArrayList;

public class Uzytkownik {
    private static int numer=0;
    private int ID=numer;
    private boolean blokada=false;
    Osoba uzytkownik;
    ArrayList<String> Historia= new ArrayList<String>();
    Uzytkownik( String nazwisko,String imie){
        this.uzytkownik=new Osoba(imie,nazwisko);
        numer++;
    }

    public int getID() {
        return ID;
    }
    public String getImie() {
        return this.uzytkownik.getImie();
    }
    public String getNazwisko() {
        return this.uzytkownik.getNazwisko();
    }


    //Blokada
    public void setBlokada(boolean blokada){

        this.blokada=blokada;
    }
    public boolean getBlokada(){
        return blokada;
    }

    //Historia wypozyczen
    public void DopiszDoKonta(String nazwa, Osoba autor){
        Historia.add(nazwa+"  "+autor.getImie()+" "+autor.getNazwisko());
    }
    public void ZobaczHistorie(){
        System.out.println("Uzytkownik: "+this.getImie()+" "+this.getNazwisko());
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

