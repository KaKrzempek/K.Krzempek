public class AtrybutyAudio {
    private int dlugosc=0;
    private String narracja="brak",jezyk="polski";
    AtrybutyAudio(){};
    AtrybutyAudio(int dl,String narracja,String jezyk){
        setDlugosc(dl);
        setNarrator(narracja);
        setJezyk(jezyk);
    };

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }
    public void setNarrator(String narrator) {
        this.narracja = narrator;
    }
    public void setJezyk(String jezyk) {
        this.jezyk = jezyk;
    }

    public int getDlugosc() {
        return dlugosc;
    }
    public String getJezyk() {
        return jezyk;
    }
    public String getNarrator() {
        return narracja;
    }
}
