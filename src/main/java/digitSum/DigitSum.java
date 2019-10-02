package digitSum;

import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        String[] helpTab = scanner.nextLine().split(" ");
        int index = getIndex(N, helpTab);
        System.out.println(index);
    }

    public static int getIndex(int n, String[] helpTab) {
        String[] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = helpTab[i];
        }

        int index = 0;
        int max = 0;

        int i = 0;
        for (String number : numbers) {
            String[] digits = number.split("");
            int sum = 0;
            for (String digit : digits) {
                sum += Integer.valueOf(digit);
            }

            if (sum > max) {
                max = sum;
                index = i;
            }
            i++;
        }
        return index;
    }
}
