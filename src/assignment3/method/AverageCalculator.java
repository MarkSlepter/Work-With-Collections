package assignment3.method;

import java.util.List;

public abstract class AverageCalculator {

    public static double calculateAverage(List<Integer> numbers){

        if (numbers == null || numbers.isEmpty()) {
            return 0.0;
        }
        int sum = 0;

        for (int number : numbers){
            sum += number;
        }

        return (double) sum / numbers.size();

    }

}
