public class CafeJava {
    public static void main(String[] args) {
// APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = " , your order will be ready shortly";
        String readyMessage = " , your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 4.0;
        double latte = 5.5;
        double cappuccino = 4.5;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        isReadyOrder4 = !isReadyOrder4;
        isReadyOrder2 = !isReadyOrder2;
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        String readyNoah = isReadyOrder4?
        (customer4 + readyMessage)
        :
        (customer4 + pendingMessage);
        System.out.println(readyNoah);
        
        System.out.println(customer2 + displayTotalMessage + (latte*2));
        String totalSam = isReadyOrder2 ? 
        (customer2 + readyMessage) 
        :
        (customer2 + pendingMessage);
        
        System.out.println(totalSam);

        System.out.println(customer3+ ',' +displayTotalMessage + (latte - dripCoffee));

    	// ** Your customer interaction print statements will go here ** //
    }
}