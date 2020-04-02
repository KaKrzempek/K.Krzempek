public class Kubelki implements Sortable{
    private int i=0;
    int[] tablica=new int [200];
    Kubelki(){
        System.out.println("Wybrano sortowanie kubelkowe");
    };

    private void swap(int indeks_a,int indeks_b){
        int temp = tablica[indeks_a];
        tablica[indeks_a] = tablica[indeks_b];
        tablica[indeks_b] = temp;
    }

    private void qSort(int lewy, int prawy) {
        int i = lewy, j = prawy;
        int pivot = tablica[(prawy+lewy)/2];

        while (i <= j) {
            while (tablica[i] < pivot) {
                i++;
            }
            while (tablica[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(i, j);
                i++;
                j--;
                step_counting();
            }
        }
        if (lewy < j)
            qSort(lewy, j);
        if (i < prawy)
            qSort(i, prawy);
    }

    public int[] sort(int[] tab) {
        this.tablica = tab;
        int n= tab.length;
        qSort(0, n-1);
        return tablica;
    }

    public double step_counting() { return i++; }

    public int getI() { return i;}

    public void getSteps() {
        System.out.println("Liczba wykonanych porownan: " + getI());
    }
}
