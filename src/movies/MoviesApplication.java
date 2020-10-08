package movies;
import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
        int selection;
        do {
            //User Menu
            DisplayUI();
            //User choice
            int userChoice = new Input().getInt("Enter your choice: ");
            selection = userChoice;
            displayUserSelection(userChoice);
        }while(selection != 0);
        System.out.println("Thanks for looking! Take care.");
    }

    public static void DisplayUI(){
        System.out.println("What would you like to see?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category\n");
    }

    public static void displayUserSelection(Integer option){

            switch (option) {
                case 1:
                    DisplaySelectedMovies("all");
                    break;
                case 2:
                    DisplaySelectedMovies("animated");
                    break;
                case 3:
                    DisplaySelectedMovies("drama");
                    break;
                case 4:
                    DisplaySelectedMovies("horror");
                    break;
                case 5:
                    DisplaySelectedMovies("scifi");
                    break;
            }

    }

    public static void DisplaySelectedMovies(String selectedCategory){
        Movie[] moviesList = MoviesArray.findAll();
        if(selectedCategory.equals("all")){
            for(Movie movie : moviesList){
                System.out.printf("%s --- %s\n", movie.getName(), movie.getCategory());
            }
        } else {
            for(Movie movie : moviesList){
                if(movie.getCategory().equals(selectedCategory)){
                    System.out.printf("%s --- %s\n", movie.getName(), movie.getCategory());
                }
            }
        }
        System.out.println("********\n");
    }
}

