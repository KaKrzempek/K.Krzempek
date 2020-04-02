import java.util.Scanner;
import java.util.Random;

public class LAB3 {
    static int[] tablica=new int[200];
    static void menu(){
    System.out.println("Witaj w programie sortowania\nJaka metode wybieradsz?");
    System.out.println("Wybierz:\n1 <- sortowanie babelkowe\n2 <-sortowanie kubelkowe\n3 <-pokaz tablice\n4 <-stworz nowa tablice\nq <-wyjdz");
    }

    static void getTab(int[] tab){
        int n=tab.length;
        for(int i=0;i<n;i++){
            System.out.println(tab[i]);
        }
        System.out.println("Koniec tablicy");
    }

    static void setTab(){
        Random rand=new Random();
        for(int i=0;i<200;i++) {
            tablica[i]=rand.nextInt(1001);
        }
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        setTab();
        menu();
        char wybor;
            do{
                wybor = scan.next().charAt(0);
                 if(wybor=='1'){
                     Babelki A=new Babelki();
                     A.sort(tablica);
                     A.getSteps();
                 }
                 if(wybor=='2'){
                     Kubelki A=new Kubelki();
                     A.sort(tablica);
                     A.getSteps();
                 }
                 if(wybor=='3'){
                     getTab(tablica);
                 }
                 if(wybor=='4')
                     setTab();
        }while(wybor!='q');

    }


}
