package grades;

import java.util.HashMap;
import java.util.Random;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        // <github username, Student object>
        HashMap<String, Student> students = new HashMap<>();

        // Create 4 Students
        Student johnny = new Student("Johnny");
        Student alison = new Student("Ali");
        Student daniel = new Student("Daniel");
        Student tommy = new Student("Tommy");

        //Assign grades to each Student object
        assignGrades(johnny);
        assignGrades(alison);
        assignGrades(daniel);
        assignGrades(tommy);

        //Add Students and their usernames to Hashmap students
        students.put("cobrakai818", johnny);
        students.put("badboymagnet", alison);
        students.put("miyagido862", daniel);
        students.put("nomercy", tommy);

        initialGreeting(students);
        solicitRecordChoice(students);
    }

    public static void assignGrades(Student name){
        for (int i = 0; i <= 3 ; i++) name.addGrade(getRandomNumberUsingNextInt());
    }

    public static int getRandomNumberUsingNextInt() {
        Random random = new Random();
        return random.nextInt(31) + 70;
    }

    public static void initialGreeting(HashMap<String, Student> data) {
        System.out.println("Greetings!");
        System.out.println("These are the usernames of our current students.\n");
        for (String i : data.keySet()) {
            System.out.printf(" |>%s<| ", i);
        }
        System.out.println("\n");
    }

    public static void showChosenRecord(Student aStudent){
        System.out.printf("Student name: %s\n", aStudent.getName());
        System.out.println("GPA: " + aStudent.getGradeAverage());
    }

    public static void solicitRecordChoice(HashMap<String, Student> data){
        Input choice = new Input();
        do {
            System.out.print("Which student's info would you like to see? ");
            String userName = choice.getString();
            if (data.containsKey(userName)) {
                showChosenRecord(data.get(userName));
                System.out.printf("GitHub user name: %s\n\n", userName);
            } else {
                System.out.println("That record does not exist\n");
            }
            System.out.println("Would you like to see another student record?");
        }while(choice.yesNo());
    }
}
