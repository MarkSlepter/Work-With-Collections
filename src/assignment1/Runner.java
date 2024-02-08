package assignment1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers(To complete, print 'exit'): ");

        while (true){
            String inputData = scanner.next();
            if(inputData.equals("exit")){
                break;
            }

            try {
                int input = Integer.parseInt(inputData);
                numbers.add(input);
            } catch (NumberFormatException e){
                System.out.println("Please enter a valid integer or 'exit: ");
            }

        }

        System.out.println("Even numbers from the collection: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }

        scanner.close();

        }

    }

}
