import java.util.Formatter;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int firstInt = sc.nextInt();
        System.out.print("Enter another integer: ");
        int secondInt = sc.nextInt();
        int result = 0;

//  Basic Mathematics Method calls
        addTwoNumbers(firstInt,secondInt);
        subtractTwoNumbers(firstInt, secondInt);
        multiplyTwoNumbers(firstInt, secondInt);
        divideTwoNumbers(firstInt, secondInt);
        modulusTwoNumbers(firstInt, secondInt);
        System.out.println("Multiplying your two integers results in a product of " + multiplyStarless(firstInt, secondInt, result));

//  Verify integer between 1-10
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);

// Factorize integer between 1-10
        factorizeIt();

// Dice Roll
        pairOfDice();

    }

// Methods
    //Basic Mathematics
    public static void addTwoNumbers(int a, int b) {
        int sum = a + b;
        System.out.printf("The sum of %d and %d = %d\n", a, b, sum);
    }

    public static void subtractTwoNumbers(int a, int b) {
        int difference = a - b;
        System.out.printf("%d take away %d = %d\n", a, b, difference);
    }

    public static void multiplyTwoNumbers(int a, int b) {
        int product = a * b;
        System.out.printf("The product of %d times %d = %d\n", a,b,product);
    }

    public static void divideTwoNumbers(int a, int b) {
        int quotient = a / b;
        System.out.printf("The quotient of %d divided by %d = %d\n", a,b,quotient);
    }

    public static void modulusTwoNumbers(int a, int b) {
        int remainder = a%b;
        System.out.printf("The remainder of %d divided by %d is %d.\n", a,b,remainder);
    };

    public static int multiplyStarless(int a, int b, int sum){

        if(b > 0){
            sum += a;
            return multiplyStarless(a, b-1, sum);
        }else{
            return sum;
        }
    }

    // Check Integer
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int checkInt = scanner.nextInt();

        if(checkInt < 1 || checkInt > 10){
            System.out.println("You have not entered an acceptable value.");
            System.out.print("Please enter a whole number between 1 and 10: ");
            return getInteger(1,10);
        }else {
            return checkInt;
        }
    }

    // Print Factorial
    public static void factorizeIt (){
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        long factorial = 1;
        int center = userInput + ((userInput - 1)*3);
        StringBuilder centerStr = new StringBuilder(center);
        centerStr.append("1");
        Formatter f = new Formatter();
        for(int i = 1; i <=userInput; i++){
            factorial *= i;
            if(i > 1){
                centerStr.append(" x " + i);
            }
            System.out.printf("%d! = %-" + center + "s = %d\n", i, centerStr, factorial);
        }
        String anotherFactorial = "n";
        System.out.print("Would you like to enter another number? (y or n) ");
        Scanner another = new Scanner(System.in);
        anotherFactorial = another.nextLine();
        if(anotherFactorial.toLowerCase().equals("y")){
            factorizeIt();
        }
    }

    // Dice Roll
    /*
    Ask the user to enter the number of sides for a pair of dice.
    Prompt the user to roll the dice.
    "Roll" two n-sided dice,
        Use static methods to implement the method(s) that generate the random numbers.
            Use the .random method of the java.lang.Math class to generate random numbers.
        display the results of each, and
        then ask the user if he/she wants to roll the dice again.
    */
    public static void pairOfDice() {
        System.out.print("For this pair of dice, how many sides does each die have? ");
        Scanner gygax = new Scanner(System.in);
        int dieSides = gygax.nextInt();
        pressAnyKeyToContinue();
        int[] diceRoll = rollTheDice(dieSides);
        System.out.printf("You have rolled %d and %d!", diceRoll[0], diceRoll[1]);
    }

    public static int[] rollTheDice(int sides){
        int[] dice = new int[2];
        dice[0] = (int)(Math.random()*sides) + 1;
        dice[1] = (int)(Math.random()*sides) + 1;
        return dice;
    }

    private static void pressAnyKeyToContinue() {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        }
        catch(Exception e) {}
    }


}
