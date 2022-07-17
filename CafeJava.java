public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready ";
        String displayTotalMessage = "Your total is  ";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 5.75;
        double latte = 4.5;
        double cappuccino  =6.90;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam ";
        String customer3 = "Jimmy";
        String customer4 = "Noah ";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage + "total : "+cappuccino+" $");
        }

        if(isReadyOrder2){
            System.out.println(customer2 + displayTotalMessage+latte*2+" $");
        }

        if(isReadyOrder3){ 
            System.out.println(customer3 + displayTotalMessage + (mochaPrice + latte)+ " $");
        }
         // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
    }
}
