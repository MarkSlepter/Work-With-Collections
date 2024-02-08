package assignment3;

import assignment3.method.AverageCalculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Runner extends AverageCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int collectionSize = 0;
        boolean validInput = false;

        while (!validInput){

            try {

                System.out.println("Print size of collection: ");
                collectionSize = scanner.nextInt();

                if (collectionSize > 0) {
                    validInput = true;
                } else {
                    System.out.println("Size of collection should be more than 0.");
                }

            } catch (InputMismatchException e){

                System.out.println("Please, print integer.");
                scanner.nextLine();

            }

        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < collectionSize; i ++){
            numbers.add((int)(Math.random() * 100));
        }

        System.out.println("Random numbers: " + numbers);
        double average = calculateAverage(numbers);
        System.out.println("Arithmetic mean of the collection " + average);
        scanner.nextLine();

    }

}
