public class Film extends Zbior {
    private AtrybutyAudio audio;
    Film(String nazwa, String autorI,String autorN, String narracja ,String jezyk, int dlugosc, double wartosc, int rok,String wyd){
        super(nazwa, autorI, autorN, wartosc, rok, wyd);
        this.audio=new AtrybutyAudio(dlugosc,narracja,jezyk);
}
    Film(String nazwa,String autorI,String autorN){
        super(nazwa,autorI,autorN);
    }


    public void setDlugosc(int dlugosc) {
        this.audio.setDlugosc(dlugosc);
    }
    public int getDlugosc(){
        return this.audio.getDlugosc();
    }
}
