package start;

public class Audiobook extends Zbior {
   private int dlugosc=0;
   private String narrator="brak",jezyk="polski";
    Audiobook(){numer++;};

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public void setJezyk(String jezyk) {
        this.jezyk = jezyk;
    }
}
