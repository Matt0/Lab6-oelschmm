import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.*;

import static junit.framework.Assert.*;



/**
 * 
 *
 * @author oelschmm.
 *         Created Apr 9, 2012.
 */
public class PrintBalanceTest {
	
		@Test
		public void TestGreetingEnglish(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("en", "US");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("greetings"), "Hello World");
		}
		
		@Test
		public void TestNameEnglish(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("en", "US");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("name"), "Please enter your name ");
		}
		
		@Test
		public void TestMeetingEnglish(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("en", "US");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("meeting"), "I am pleased to meet you");
		}
		
		@Test
		public void TestDateEnglish(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("en", "US");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("date"), "As of : ");
		}
		
		@Test
		public void TestOweEnglish(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("en", "US");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("owe"), "You owe the school ");
		}
		
		@Test
		public void TestFarewellEnglish(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("en", "US");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("farewell"), "Goodbye");
		}
		
		@Test
		public void TestGreetingGerman(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("de", "DE");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("greetings"), "Hallo Welt");
		}
		
		@Test
		public void TestNameGerman(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("de", "DE");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("name"), "Bitte geben Sie Ihren Namen ");
		}
		
		@Test
		public void TestMeetingGerman(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("de", "DE");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("meeting"), "Ich freue mich, Sie kennen zu lernen");
		}
		
		@Test
		public void TestDateGerman(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("de", "DE");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("date"), "Stand : ");
		}
		
		@Test
		public void TestOweGerman(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("de", "DE");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("owe"), "Sie schulden die Schule ");
		}
		
		@Test
		public void TestFarewellGerman(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("de", "DE");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("farewell"), "Auf Wiedersehen");
		}
		
		@Test
		public void TestGreetingFrench(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("fr", "FR");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("greetings"), "Bonjour tout le monde");
		}
		
		@Test
		public void TestNameFrench(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("fr", "FR");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("name"), "S'il vous plaît entrer votre nom ");
		}
		
		@Test
		public void TestMeetingFrench(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("fr", "FR");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("meeting"), "Je suis heureux de vous rencontrer");
		}
		
		@Test
		public void TestDateFrench(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("fr", "FR");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("date"), "comme d' : ");
		}
		
		@Test
		public void TestOweFrench(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("fr", "FR");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("owe"), "Vous devez l'école ");
		}
		
		@Test
		public void TestFarewellFrench(){
			Locale currentLocale;
			ResourceBundle messages;
			currentLocale = new Locale("fr", "FR");
			messages = ResourceBundle.getBundle("BundleOfMessages", currentLocale);
			assertEquals(messages.getString("farewell"), "au revoir");
		}

}
