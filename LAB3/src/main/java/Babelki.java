public class Babelki implements Sortable{
 private int i=0;
    Babelki(){
        System.out.println("Wybrano sortowanie babelkowe");
    };
   public int[] sort(int[]tab){
       int n = tab.length;
       int temp = 0;
       for(int i=0; i < n; i++){
           for(int j=1; j < (n-i); j++){
               if(tab[j-1] > tab[j]){
                   temp = tab[j-1];
                   tab[j-1] = tab[j];
                   tab[j] = temp;
                   step_counting();
               }
           }
       }
       return tab;
   };

    public double step_counting() {
            return i++;
    }

    public int getI() {
        return i;
    }

    public void getSteps() {
        System.out.println("Liczba wykonanych porownan: " + getI());
    }
}
