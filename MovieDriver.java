package Application;

import java.util.Scanner;

public class MovieDriver {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		Movie movie = new Movie();
		boolean add_movie = true;
		do {
			String name,rating;
			int tickets_sold;
			System.out.println("Enter the name of a movie");
			name = scan.nextLine();
			System.out.println("Enter the rating of the movie");
			rating = scan.nextLine();
			System.out.println("Enter the number of tickets sold for this move");
			tickets_sold = scan.nextInt();
			scan.nextLine();
			
			
			movie.setTitle(name);
			movie.setRating(rating);
			movie.setSoldTickets(tickets_sold);
			
			System.out.println(movie.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			String choice = scan.next();
			scan.nextLine();
			if(!choice.equals("y") && !choice.equals("Y")) {
				add_movie = false;
			}
			
		} while(add_movie);
		System.exit(0);
		
	}
}
