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
public class MovieDriver {

    /**
     * Main method program execution starts here.
     */
    public static void main(String arg[]) {
    	
        Scanner scan = new Scanner(System.in);
        Movie movie = new Movie();
        boolean add_movie = true;

        /**
         * Repeatedly collects movie information from the user.
         * The loop continues until the user enters something
         * other than 'y' or 'Y'.
         */
        do {

            String name;
            String rating;
            int tickets_sold;

            // Prompt for movie title
            System.out.println("Enter the name of a movie");
            name = scan.nextLine();

            // Prompt for movie rating
            System.out.println("Enter the rating of the movie");
            rating = scan.nextLine();

            // Prompt for tickets sold
            System.out.println("Enter the number of tickets sold for this move");
            tickets_sold = scan.nextInt();

            // Clear newline from input buffer
            scan.nextLine();

            // Populate Movie object with user input
            movie.setTitle(name);
            movie.setRating(rating);
            movie.setSoldTickets(tickets_sold);

            // Display movie information
            System.out.println(movie.toString());

            // Ask user whether to continue
            System.out.println("Do you want to enter another? (y or n)");
            String choice = scan.next();

            // Clear newline from buffer
            scan.nextLine();

            // Exit loop if user does not enter 'y' or 'Y'
            if (!choice.equals("y") && !choice.equals("Y")) {
                add_movie = false;
            }

        } while (add_movie);
        scan.close();
        System.exit(0);
    }
}