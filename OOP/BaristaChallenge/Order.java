import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    
    // ORDER METHODS
    // Most of your code will go here, 
    // so implement the getters and setters first!
    public void getStatusMessage(){
        if(this.isReady()){
            System.out.println( "Thank you for waiting. Your order will be ready soon.");
        }else{
            System.out.println("Your order is ready.");
        }
    }
    public void addItems(Item item){
        this.items.add(item);
    }
    public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
            // System.out.println( item.getPrice());
        }
        return total;
    }
    public void display(){
        System.out.println(this.name);
        for(Item item : items){
            // System.out.println(item.getPrice());
            System.out.println(item.getName() + " - $" +  item.getPrice());
        }
        System.out.printf("Total: $" + getOrderTotal() + "\n");
    }



    // GETTERS & SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public String getName(){
        return this.name;
    }
    public boolean isReady(){
        return this.ready;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }
    
}