package commonDigit;
import java.util.Scanner;

public class CommonDigit {

    public static void main(String[] args) {

        int[] tmpTab = new int[10];
        Scanner scanner = new Scanner(System.in);
        int N = 0;

        do {

            N = Integer.parseInt(scanner.nextLine());

        } while (N < 2 || N > 20);

        String[] helpTab = scanner.nextLine().split(" ");
        String[] numbers = new String[N];
        for (int i = 0; i < N; i++){
            numbers[i] = helpTab[i];
        }

        for (String number : numbers) {
            String[] digits = number.split("");
            for (String digit : digits) {
                tmpTab[Integer.valueOf(digit)]++;
            }
        }

        int number = 0;
        int max =0;

        for(int i = 0; i < tmpTab.length; i++) {
            if(tmpTab[i] >= max ) {
                max = tmpTab[i];
                number = i;
            }
        }

        System.out.println(number);

    }
}
