import java.util.Date;
public class AlfredQuote {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String greeting = "Hello " + name;
        return greeting;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date currentDate = new Date();
        return "Today is " +currentDate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE

        return conversation;
    }

    
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}