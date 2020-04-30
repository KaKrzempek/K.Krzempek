public class ProgramyZawarteWLab5 {
        //pkt 1.
        public boolean porownajWStosunkuDo100(int a,int b){
            if(a<100||b<100) return true;
            else return false;
        }

        //pkt 2.
        public boolean znajdz123(int[] tab){
            if(tab.length-2<0)
                return false;
            else{
                for(int i=0;i<(tab.length-2);i++){
                    if(tab[i]==1)
                        if(tab[i+1]==2)
                            if(tab[i+2]==3)
                                return true;
                }
                return false;
            }
        }

        //pkt.3 - gdy nieparzysta liczba znakow zwraca (dlugosc ciagu/2+1) znakow, gdy pusty string - zwraca pust string
        public String drugaPolowaZnakow(String ciag){
            int dlugosc=ciag.length();
            return ciag.substring(dlugosc/2,dlugosc);
        }

        //pkt 4.
        public int[] odwrocTablice(int[] tablica){
            int n=tablica.length;
            int[] tabZ=new int[n];
            if(n>0){
                for(int i=0;i<n;i++){
                    tabZ[i]=tablica[n-1-i];
                }
                return tabZ;
            }
            else return null;
        }
}
