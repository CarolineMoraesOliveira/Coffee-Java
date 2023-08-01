public class CafeJava {
    public static void main(String[] args) {
        
    
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.5;
        double latte = 3.5;
        double cappuccino = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    

        boolean isReadyOrder1 = false;
            if (isReadyOrder1 == true){
                System.out.println(customer1 + readyMessage);
            }
            else {
                System.out.println(customer1 + pendingMessage);
            }

        boolean isReadyOrder2 = true;
            System.out.println(isReadyOrder2 ? customer2 + readyMessage : customer2 + pendingMessage);

        boolean isReadyOrder3 = false;
            if (isReadyOrder3 == true){
                System.out.println(customer3 + readyMessage);
            }
            else {
                System.out.println(customer3 + pendingMessage);
            }

        boolean isReadyOrder4 = false;
            System.out.println(isReadyOrder4 ? customer4 + readyMessage : customer4 + pendingMessage);

       
        System.out.println(generalGreeting + customer1);

        System.out.println(customer2 + displayTotalMessage + latte * 2);

        System.out.println(customer3 + displayTotalMessage + (latte - dripCoffee));

    }
}
