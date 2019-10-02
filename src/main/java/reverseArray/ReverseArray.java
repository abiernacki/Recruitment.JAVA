package reverseArray;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] tab = scanner.nextLine().split(" ");

        for (int i = (N - 1); i >= 0; i--){
            System.out.print(tab[i] + " ");
        }
        System.out.println();

    }
}
