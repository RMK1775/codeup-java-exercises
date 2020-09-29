import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();

        System.out.println("Enter 3 words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String theRest = input.nextLine();
        System.out.println(theRest);

        Scanner digits = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = Integer.parseInt(digits.nextLine());
        System.out.println("Enter width: ");
        int width = Integer.parseInt(digits.nextLine());

        int area = length * width;
        int perimeter = (2 * length) + (2 * width);

        System.out.printf("Area = %d.\n", area);
        System.out.printf("Perimeter = %d.", perimeter);





    }
}

