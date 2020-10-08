package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        String input = getString().trim().toLowerCase();
        char checkValue = input.charAt(0);
        return checkValue == 'y';
    }

    public int getInt(int min, int max) {
        int input;
        boolean exceptionFound = false;
        boolean outOfBounds = false;
        do {
            exceptionFound = false;
            System.out.println("Enter a number between " + min + " and " + max + ": ");
            input = this.scanner.nextInt();
            try {
                if (input < min || input > max) {
                    System.out.println("Number outside the given parameters.");
                    outOfBounds = true;
                } else {
                    // user entered a correct integer
                    outOfBounds = false;
                }
            } catch( Exception e ) {
                System.out.println("That is not an integer");
                System.out.println();
                exceptionFound = true;
            }

        } while (exceptionFound || outOfBounds);

        return input;
    }

    public int getInt() {
        System.out.println("Input a number: ");
        return this.scanner.nextInt();
    }

    public int getInt(String prompt){
        System.out.print(prompt);
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input = 0.0;
        boolean outOfBounds = false;
        do {
            outOfBounds = false;
            System.out.println("Enter a number between " + min + " and " + max + ".");
            try {
                input = this.scanner.nextDouble();
            } catch (NumberFormatException e) {
                System.out.println("That is not a double");
                outOfBounds = true;
            }
            if (input < min || input > max) {
                System.out.println("You've entered a value outside the given parameters.");
                System.out.println();
            }
        } while (outOfBounds || input < min || input > max);

        return input;
    }

    public double getDouble() {
        System.out.println("Input a number: ");
        return this.scanner.nextDouble();
    }
}
