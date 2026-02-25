package Application;

import java.util.Scanner;

/**
 * MovieDriver is the entry point of the application.
 * 
 * This program repeatedly prompts the user to enter details
 * about a movie (title, rating, tickets sold), stores the
 * information in a Movie object, and prints the movie data.
 * 
 * The program continues running until the user chooses to stop.
 */
public class MovieDriver_Task1 {

    /**
     * Main method program execution starts here.
     */
    public static void main(String arg[]) {
    	
        Scanner scan = new Scanner(System.in);
        Movie movie = new Movie();

    	String name;
    	String rating;
    	int tickets_sold;

        // Prompt for movie title
        System.out.println("Enter the name of a movie");
        name = scan.nextLine();
        movie.setTitle(name);

        // Prompt for movie rating
        System.out.println("Enter the rating of the movie");
        rating = scan.nextLine();
        movie.setRating(rating);

        // Prompt for tickets sold
        System.out.println("Enter the number of tickets sold for this move");
        tickets_sold = scan.nextInt();
        movie.setSoldTickets(tickets_sold);
        

        // Display movie information
        System.out.println(movie.toString());
        System.out.println("Goodbye");

        scan.close();
        System.exit(0);
    }
}