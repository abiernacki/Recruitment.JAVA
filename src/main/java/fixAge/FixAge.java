package fixAge;

public class FixAge {

    public static void main(String[] args) {

        int[] tab = {5, 15, 2, 78, 2, 2};

        fixage(tab);

    }

    public static void fixage(int[] tab) {

        int[] tmpTab = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= 18 && tab[i] <= 60) {
                tmpTab[i] = tab[i];
            }
        }

        int counter = 0;
        for (int i = 0; i < tmpTab.length; i++){
            if (tmpTab[i] != 0) {
                System.out.println(tmpTab[i]);
            }
            if (tmpTab[i] != 0){
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("NA");
        }
    }
}
