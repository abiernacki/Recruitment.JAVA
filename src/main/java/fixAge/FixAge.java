package fixAge;

public class FixAge {

    public static void main(String[] args) {

        int[] tab = {5, 15, 25, 78, 59, 45};

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
                if(i < (tmpTab.length-1)) {
                    System.out.print(tmpTab[i] + ", ");
                } else {
                    System.out.print(tmpTab[i]);
                }
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("NA");
        }
    }
}
