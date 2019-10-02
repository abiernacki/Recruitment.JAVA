package existingPowersOfTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExistingPowersOf2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<String> binaryNumbers = new ArrayList<>();
        List<String> trimNumbers = new ArrayList<>();
        List<Integer> score = new ArrayList<>();
        int counter = 0;
        int indexGreatestPowerTwo = 0;

        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        Collections.sort(numbers);
        Collections.reverse(numbers);

        for (Integer var : numbers) {
            binaryNumbers.add(Integer.toBinaryString(var));
        }

        for (String var : binaryNumbers) {
            trimNumbers.add(trimStringByString(var, "0"));
        }

        for (String var : trimNumbers) {
            if (var.equals("1")) {
                indexGreatestPowerTwo = counter;
                int greatestPowerTwo = numbers.get(indexGreatestPowerTwo);

                while (greatestPowerTwo != 0) {

                    score.add(greatestPowerTwo);
                    greatestPowerTwo = greatestPowerTwo / 2;
                }

                Collections.reverse(score);
                for (Integer var1 : score) {
                    if (var1 != numbers.get(indexGreatestPowerTwo)) {
                        System.out.print(var1 + ", ");
                    } else {
                        System.out.print(var1);
                    }
                }
                break;
            }
            counter++;
        }

        if (score.isEmpty()){
            System.out.println("NA");
        }

    }


    public static String trimStringByString(String text, String trimBy) {
        int beginIndex = 0;
        int endIndex = text.length();

        while (text.substring(beginIndex, endIndex).startsWith(trimBy)) {
            beginIndex += trimBy.length();
        }

        while (text.substring(beginIndex, endIndex).endsWith(trimBy)) {
            endIndex -= trimBy.length();
        }

        return text.substring(beginIndex, endIndex);
    }
}
