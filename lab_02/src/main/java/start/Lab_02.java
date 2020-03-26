package start;

import java.util.ArrayList;


public class Lab_02 {
    public static void main (String[] args)
    {
        int Dzien=0;//obecna data na swiecie, dla ulatwienia tylko dzien
    ArrayList<Uzytkownik> Uzytkownicy = new ArrayList<Uzytkownik>();
    ArrayList<Zbior> Zasoby = new ArrayList<Zbior>();
//TEST

    Uzytkownicy.add(new Uzytkownik("Jolkiewicz","Hanna"));
    Uzytkownicy.add(new Uzytkownik("Czarkowski", "Jan"));

    Zasoby.add(new Audiobook());//domyslnie ustawia brak autora, nazwy, itp. mozna pozniej zmienic
        Zasoby.get(0).setNazwa("Audio wysokiej klasy");
    Zasoby.add(new Ksiazka("Co tam w polityce","Zbysiu Wyrwijpięta"));
    Zasoby.add(new Muzyka("Jestem Królem","Seba Wirus","rap",23.03,39.99,2020,"Pandemic sp. z o.o."));
    Zasoby.add(new Film("Jakie to","Studio Takieto"));
    Zasoby.add(new Ebook());

    //Pusta Historia Wypozyczen
    Uzytkownicy.get(0).ZobaczHistorie();
    System.out.println("------------Akcja WYPOZYCZENIE----------");
        /* Metoda Wypozyczenie przypisuje id uzytkownika do danego zasobu oraz zapamietuje date wypozyczenia,
        sprawdza czy uzytkownik posiada cos po terminie (sprawdzenie blokady) i jesli nie, zapisuje nazwe i autora obiektu w historii uzytkownika,
        sprawdza tez czy pozycja zostala juz wypozyczona
         */
        Zasoby.get(0).Wypozyczenie(Uzytkownicy.get(0),Dzien);
        Zasoby.get(1).Wypozyczenie(Uzytkownicy.get(0),Dzien);
        Zasoby.get(2).Wypozyczenie(Uzytkownicy.get(0),Dzien);
        Zasoby.get(3).Wypozyczenie(Uzytkownicy.get(1),Dzien);
        //bledne wypozyczenia
        Zasoby.get(3).Wypozyczenie(Uzytkownicy.get(1),Dzien);// ta sama
        Zasoby.get(0).Wypozyczenie(Uzytkownicy.get(1),Dzien);// inny uzytkownik


    System.out.println("------------Historia Wypozyczen----------");
        Uzytkownicy.get(0).ZobaczHistorie();

        //Uplynal jakis czas
        Dzien=20;

    System.out.println("------------Akcja ZWROTY - w terminie----------");

       /* Metoda Zwrot zwraca id aktualnego posiadacza obiektu (tu ksiazki), jesli takiego nie ma zwraca -1, kasuje jego dane (id) z danych tego obiektu,
       ustawia tez czas wypozyczenia na 0 (bo obiekt jest w wypozyczalni) i oblicza kwote zaplaty w przypadku przetrzymania zbioru (pokazane pozniej).
        Program nie przewiduje, że ksiazke mozna zwrocic bez jej jednoczesnego opalcenia w przypadku nie dotrzymania terminu.
        Zwrocenie przewiduje wywolanie 2 metod - Zwrotu na zasobach i usuniecia blokady na uzytkowniku
        */
        int id= Zasoby.get(1).Zwrot(Dzien);
        if(id>=0) {Uzytkownicy.get(id).setBlokada(false);}

        id= Zasoby.get(0).Zwrot(Dzien);
        if(id>=0) {Uzytkownicy.get(id).setBlokada(false);}

        System.out.println("------------Akcja ZWROTY - bledne----------");
        //Juz wczesniej zwrocony
        id= Zasoby.get(0).Zwrot(Dzien);
        if(id>=0) {Uzytkownicy.get(id).setBlokada(false);}
        //niewypozyczony
        id= Zasoby.get(4).Zwrot(Dzien);
        if(id>=0) {Uzytkownicy.get(id).setBlokada(false);}

        //Uplynal jakis czas, domyslnie oplata za dzien: 0,05zl, max czas wypozyczenia 30 dni
        Dzien=150;
        //Niedoskonala petla nakladajaca blokade
        for( int i=0;i<Zasoby.size();i++){
            if(Zasoby.get(i).PoTerminie(Dzien)>=0)
                Uzytkownicy.get(Zasoby.get(i).PoTerminie(Dzien)).setBlokada(true);
        }

        System.out.println("------------Akcja ZWROT - z oplata----------");
        id= Zasoby.get(2).Zwrot(Dzien);
        if(id>=0) {Uzytkownicy.get(id).setBlokada(false);}

        System.out.println("------------Akcja WYPOZYCZENIE z blokada----------");
        Zasoby.get(2).Wypozyczenie(Uzytkownicy.get(1),Dzien);// ma pozycje 3. po terminie zwrotu

        //ustawienie wysokosci oplat - tak samo mozna ustawic maksymalny czas wypozyczenia
        for( int i=0;i<Zasoby.size();i++){
            Zasoby.get(i).setOplataZaOpoznienie(3);//oplata w zl
        }
        System.out.println("------------Zwrot z ustawiona inna oplata i usuniecie blokady----------");
        id= Zasoby.get(3).Zwrot(Dzien);
        if(id>=0) {Uzytkownicy.get(id).setBlokada(false);}
        Zasoby.get(2).Wypozyczenie(Uzytkownicy.get(1),Dzien);
    }

}
