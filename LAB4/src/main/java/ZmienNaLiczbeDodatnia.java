import java.util.Scanner;

public class ZmienNaLiczbeDodatnia {
    public int spr(String wyraz){
        int liczba = 0;
        boolean i=true;
        try {
            liczba=Integer.parseInt(wyraz);
        }
        catch (NumberFormatException e) {
            System.out.println("\""+wyraz+"\" to nie liczba.");
            i=false;
        }
        if(i) return liczba;
       else return -1;
    }
}
