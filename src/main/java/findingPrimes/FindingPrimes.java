package findingPrimes;
import java.util.Scanner;

public class FindingPrimes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 0; i < T; i++) {

            String[] tmpTab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(tmpTab[0]);
            int b = Integer.parseInt(tmpTab[1]);


            for (int j = a; j <= b; j++){
                if (czyPierwsza(j)){
                    counter++;
                }
            }

            System.out.println(counter);
            counter = 0;
        }
    }
    public static boolean czyPierwsza(int a) {

        if (a == 1) {
            return false;
        }
        for (int i = 2; i < (a / 2) + 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

}
