import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the date
        System.out.println("Enter date (in the format dd-MM-yyyy): ");
        String inputDate = sc.nextLine();

        // Prompt the user to enter the new format
        System.out.println("Enter new Format: ");
        String newFormatPattern = sc.nextLine();

        // Parse the input date using the provided format
        LocalDateTime currentDate = LocalDateTime.parse(inputDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        // Format the date using the new format pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(newFormatPattern);
        String formattedDate = formatter.format(currentDate);

        // Print the formatted date
        System.out.println("Formatted date: " + formattedDate);

        
        
	   // ZoneId zone = ZoneId.of("America/New_York");
	    
	   // LocalDateTime currDate = LocalDateTime.now(zone);
	    
	   // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    
	   // String newDate = formatter.format(currDate);
	   // System.out.println(newDate);
	   
        sc.close();
    }
}

