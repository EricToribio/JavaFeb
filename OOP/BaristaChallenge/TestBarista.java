public class TestBarista {
    public static void main(String[] args){
        Item item1 = new Item("mocha",3.25);
        // item1.setName = "mocha";
        // item1.setPrice = 3.25;

        Item item2 = new Item("latte",4.5);
        // item2.setName = "latte";
        // item2.setPrice = 4.5;

        Item item3 = new Item("drip coffee", 2.15);
        // item3.setName = "drip coffee";
        // item3.setPrice = 2.15;

        Item item4 = new Item("capuccino", 3.5);
        // item4.setName = "capuccino";
        // item4.setPrice = 3.5;


        Order Order1 = new Order();

        Order Order2 = new Order();
        // System.out.println(Order1);
        // System.out.println(Order2);
        Order Order3 = new Order("Amanda");
        Order3.addItems(item1);
        Order3.addItems(item4);
        Order3.setReady(true);
        Order3.getOrderTotal();
        Order3.getStatusMessage();
        Order3.display();
        Order Order4 = new Order("Bob");
        Order4.addItems(item1);
        Order4.addItems(item3);
        Order4.getOrderTotal();
        Order4.getStatusMessage();

        Order4.display();
        Order Order5 = new Order("Eric");
        Order5.addItems(item1);
        Order5.addItems(item2);
        Order5.setReady(true);
        Order5.getOrderTotal();
        Order5.getStatusMessage();
        Order5.display();


    }
}