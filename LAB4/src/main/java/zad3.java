import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        int[] tab={1,2,3,4,5};
        Scanner scan= new Scanner(System.in);
        System.out.println("Podaj indeks elementu tablicy [1-5]: ");
        do{
            String indeks=scan.next();
            ZmienNaLiczbeDodatnia spr=new ZmienNaLiczbeDodatnia();
            int id= spr.spr(indeks);
            try{
                System.out.println("Twoj element: "+tab[id]);
                break;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Niepoprawny indeks.");
            }

        }while (true);



    }
}
