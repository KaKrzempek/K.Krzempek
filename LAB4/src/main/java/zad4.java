import java.util.ArrayList;

    public class zad4 {

        public static void main(String[] args) {
            int Dzien = 0;//obecna data na swiecie, dla ulatwienia tylko dzien
            ArrayList<Uzytkownik> Uzytkownicy = new ArrayList<Uzytkownik>();
            ArrayList<Zbior> Zasoby = new ArrayList<Zbior>();
//TEST

            Uzytkownicy.add(new Uzytkownik("Jolkiewicz", "Hanna"));
            Uzytkownicy.add(new Uzytkownik("Czarkowski", "Jan"));

            Zasoby.add(new Audiobook());
            Zasoby.get(0).setNazwa("Audio wysokiej klasy");
            Zasoby.add(new Ksiazka("Co tam w polityce","Halina","Gabi"));
            Zasoby.add(new Muzyka("Jestem Królem", "Seba"," Wirus", "rap", 23.03, 39.99, 2020, "Pandemic sp. z o.o."));
            Zasoby.add(new Film("Jakie to","Edward","Kowalski"));
            Zasoby.add(new Ebook());

            //Pusta Historia Wypozyczen
            Uzytkownicy.get(0).ZobaczHistorie();
            System.out.println("------------Akcja WYPOZYCZENIE----------");

            Zasoby.get(0).Wypozyczenie(Uzytkownicy.get(0), Dzien);
            Zasoby.get(1).Wypozyczenie(Uzytkownicy.get(0), Dzien);
            Zasoby.get(2).Wypozyczenie(Uzytkownicy.get(0), Dzien);
            Zasoby.get(3).Wypozyczenie(Uzytkownicy.get(1), Dzien);
            //bledne wypozyczenia
            Zasoby.get(3).Wypozyczenie(Uzytkownicy.get(0), Dzien);// ta sama
            Zasoby.get(0).Wypozyczenie(Uzytkownicy.get(1), Dzien);// inny uzytkownik


            System.out.println("------------Historia Wypozyczen----------");
            Uzytkownicy.get(1).ZobaczHistorie();


            System.out.println("------------Modyfikacja: Zbior ->Autor----------");
            //W historii zapisane sa dane zbioru w momencie jego wypozyczenia,
            // wiec to same dzielo po zmianie autora w historii nadal bedzie opisane starym imieniem i nazwiskiem
            Zasoby.get(3).setAutor("Emil","de Leclemont");
            Zasoby.get(3).Zwrot(Dzien);
            Zasoby.get(3).Wypozyczenie(Uzytkownicy.get(1),Dzien);
            Uzytkownicy.get(1).ZobaczHistorie();

/*
            //Uplynal jakis czas
            Dzien = 20;

            System.out.println("------------Akcja ZWROTY - w terminie----------");


            int id = Zasoby.get(1).Zwrot(Dzien);
            if (id >= 0) {
                Uzytkownicy.get(id).setBlokada(false);
            }

            id = Zasoby.get(0).Zwrot(Dzien);
            if (id >= 0) {
                Uzytkownicy.get(id).setBlokada(false);
            }

            System.out.println("------------Akcja ZWROTY - bledne----------");
            //Juz wczesniej zwrocony
            id = Zasoby.get(0).Zwrot(Dzien);
            if (id >= 0) {
                Uzytkownicy.get(id).setBlokada(false);
            }
            //niewypozyczony
            id = Zasoby.get(4).Zwrot(Dzien);
            if (id >= 0) {
                Uzytkownicy.get(id).setBlokada(false);
            }

            //Uplynal jakis czas, domyslnie oplata za dzien: 0,05zl, max czas wypozyczenia 30 dni
            Dzien = 150;
            //Niedoskonala petla nakladajaca blokade
            for (int i = 0; i < Zasoby.size(); i++) {
                if (Zasoby.get(i).PoTerminie(Dzien) >= 0)
                    Uzytkownicy.get(Zasoby.get(i).PoTerminie(Dzien)).setBlokada(true);
            }

            System.out.println("------------Akcja ZWROT - z oplata----------");
            id = Zasoby.get(2).Zwrot(Dzien);
            if (id >= 0) {
                Uzytkownicy.get(id).setBlokada(false);
            }

            System.out.println("------------Akcja WYPOZYCZENIE z blokada----------");
            Zasoby.get(2).Wypozyczenie(Uzytkownicy.get(1), Dzien);// ma pozycje 3. po terminie zwrotu

            for (int i = 0; i < Zasoby.size(); i++) {
                Zasoby.get(i).setOplataZaOpoznienie(3);//oplata w zl
            }
            System.out.println("------------Zwrot z ustawiona inna oplata i usuniecie blokady----------");
            id = Zasoby.get(3).Zwrot(Dzien);
            if (id >= 0) {
                Uzytkownicy.get(id).setBlokada(false);
            }
            Zasoby.get(2).Wypozyczenie(Uzytkownicy.get(1), Dzien);*/
        }

    }

