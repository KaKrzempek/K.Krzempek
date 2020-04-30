import java.util.Scanner;

public class ProgramyNieZawarteWLab5 {
    // czyli zadania w lab 1., ktorych nie ma w lab 5.

    protected boolean czyLiczba(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    protected int wpiszLiczbe(){
        Scanner scr=new Scanner(System.in);
        String str;
        do{
            str=scr.next();
        }while(!czyLiczba(str));
        return Integer.parseInt(str);
    }

    //5.
    public void trojkatProstokatny() {
        int[] boki = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj dlugosc boku: ");
            do{
                boki[i]=wpiszLiczbe();
            }while(boki[i]<=0);
        }
        if(czyProstokatny(boki)) System.out.println("Trojkat jest prostokatny");
        if(!czyProstokatny(boki)) System.out.println("Trojkat nie jest prostokatny");
    }
    protected boolean czyProstokatny(int[] boki) {
        if(boki.length==3){
            for(int i=0;i<3;i++){
                boki[i] = boki[i] ^ 2;
            }

            if (boki[0] > boki[1] && boki[0] > boki[2]) {
                if (boki[1] + boki[2] == boki[0]) return true;
            } else if (boki[1] > boki[0] && boki[1] > boki[2]) {
                if (boki[0] + boki[2] == boki[1]) return true;
            } else if (boki[2] > boki[0] && boki[2] > boki[1]) {
                if (boki[0] + boki[1] == boki[2]) return true;
            }
        }
        return false;
    }

    //6.
    public void gwiazdki(){
            System.out.println("Podaj wysokosc trojkata: ");
            rysujTrojkat(wpiszLiczbe());
    }
    protected boolean rysujTrojkat(int h){
        int liczbaZabezpieczajaca=0,liczbaKontrolna=0;
        for(int i=1;i<=h;i++){
            liczbaKontrolna=+i;
        }

        for(int i=1;i<=h;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
                liczbaZabezpieczajaca=+j;
            }
            System.out.print("\n");
        }
        if(liczbaZabezpieczajaca==liczbaKontrolna) return true;
        else return false;
    }

}
