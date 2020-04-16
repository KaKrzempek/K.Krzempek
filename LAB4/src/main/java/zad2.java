import java.util.Scanner;
//wprowadzone znaki zostaja zmienione na int

public class zad2 {
    public static void main(String[] args) {
        int liczba = 0;
        boolean i=true;
        Scanner scan=new Scanner(System.in);

        System.out.println("Wpisz liczbe: ");
        String wyraz=scan.next();
        try {
            liczba=Integer.parseInt(wyraz);
        }
        catch (NumberFormatException e) {
            System.out.println("Blad. Wyraz \""+wyraz+"\" to nie liczba.");
            i=false;
        }
        if(i) System.out.println("Brawo! Twoja liczba to: "+liczba);

    }
}