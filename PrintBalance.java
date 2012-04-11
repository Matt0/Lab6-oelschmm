import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * 
 *
 * @author oelschmm.
 *         Created Mar 9, 2012.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		String language;
		String country;
		Locale currentLocale;
		ResourceBundle messages;
		currentLocale = new Locale("de", "DE");
		messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
		
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		
		//Greeting
		System.out.println(messages.getString("greetings"));
		
		//Get User's Name
		System.out.println(messages.getString("name"));
		String name = scanInput.nextLine();
		System.out.println(messages.getString("meeting") + " " + name);
		
		//print today's date, balance and bid goodbye
		System.out.println(messages.getString("date") 
				+ DateFormat.getDateInstance(DateFormat.FULL, currentLocale).format(today));
		System.out.println(messages.getString("owe") 
				+ NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21));
		System.out.println(messages.getString("farewell"));
	}
}