import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab5Test {
    ProgramyZawarteWLab5 obiekt1=new  ProgramyZawarteWLab5();
    ProgramyNieZawarteWLab5 obiekt2=new ProgramyNieZawarteWLab5();// czyli zadania w lab 1., ktorych nie ma w lab 5.
    @Test
    void test1(){
        assertTrue(obiekt1.porownajWStosunkuDo100(120,90));
    }
    @Test
    void test1_2(){
        assertTrue(obiekt1.porownajWStosunkuDo100(90,120));
    }
    @Test
    void test1_3(){
        assertFalse(obiekt1.porownajWStosunkuDo100(120,190));
    }
    @Test//==100
    void test1_4(){
        assertFalse(obiekt1.porownajWStosunkuDo100(100,100));
    }

    @Test//war brzegowy
    void test2_1(){
        int[] tab={5,4,1,2,3};
        assertTrue(obiekt1.znajdz123(tab));
    }
    @Test
    void test2_2(){
        int[] tab={5,4,1,1,3};
        assertFalse(obiekt1.znajdz123(tab));
    }
    @Test//pusta tablica
    void test2_3(){
        int[] tab={};
        assertFalse(obiekt1.znajdz123(tab));
    }
    @Test//za mała tablica
    void test2_4(){
        int[] tab={1,2};
        assertFalse(obiekt1.znajdz123(tab));
    }

    @Test//poprawny ciag
    void test3(){
        String str= "123rew";
        assertEquals("rew",obiekt1.drugaPolowaZnakow(str));
    }
    @Test//pusty ciag
    void test3_1(){
        String str= "";
        assertEquals("",obiekt1.drugaPolowaZnakow(str));
    }
    @Test// nieparzysta liczba
    void test3_2(){
        String str= "126";
        assertEquals("26",obiekt1.drugaPolowaZnakow(str));
    }

    @Test//poprawne odwrocenie
    void test4(){
        int[] tab={1,2,3},tabO=obiekt1.odwrocTablice(tab);
        boolean s=false;
        if(tab.length==tabO.length){
            s=true;
            for(int i=0; i<tab.length;i++)
            {
                if(tab[i]!=tabO[tabO.length-1-i]) {
                    s=false;
                    break;
                }
            }
        }
        assertTrue(s);
    }
    @Test//pusta tablica
    void test4_1(){
        int[] tab={};
        assertNull(obiekt1.odwrocTablice(tab));
    }

    //programy niezawarte w lab 5.
    @Test// wpisanie innych znakow
    void testCzyLiczba(){
        assertTrue(obiekt2.czyLiczba("12"));
    }
    @Test// wpisanie innych znakow
    void testCzyLiczba_1(){
        assertFalse(obiekt2.czyLiczba("."));
    }
    @Test// wpisanie nie trojkata
    void test5(){
        int[] tab={1,2,3};
        assertFalse(obiekt2.czyProstokatny(tab));
    }
    @Test // wpisanie trojkata prostokatnego
    void test5_1(){
        int[] tab={4,5,3};
        assertTrue(obiekt2.czyProstokatny(tab));
    }
    @Test // wpisanie trojkata nieprostokatnego
    void test5_2(){
        int[] tab={6,5,3};
        assertFalse(obiekt2.czyProstokatny(tab));
    }
    @Test
        // sprawdzenie, czy trojkat posiada h kolumn i h rzedow oraz odpowiednia ilosc gwiazdek)
    void test6(){
        assertTrue(obiekt2.rysujTrojkat(5));
    }

}
