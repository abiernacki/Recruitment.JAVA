package permutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {

        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String[] firstTab = scanner.nextLine().split(" ");
        String[] secondTab = scanner.nextLine().split(" ");

        for (int i = 0; i < firstTab.length; i++) {
            firstList.add(firstTab[i]);
            secondList.add(secondTab[i]);
        }

        secondList.retainAll(firstList);

        if (firstList.size() == secondList.size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
