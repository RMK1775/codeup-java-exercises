package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String aName){
        this.name = aName;
        this.grades = grades;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double average = 0;
        for(int grade : grades){
            average += grade;
        }
        average /= grades.size();
        return average;
    }
/* Commented out initial code from first exercise in order to use in Collections exercise

    public static void main(String[] args) {
        Student ryan = new Student("Ryan");
        ryan.addGrade(85);
        ryan.addGrade(100);
        ryan.addGrade(76);
        System.out.println(ryan.getGradeAverage());
    }
*/

}
