import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

class Customer{
    Double paymentAmount;
    public boolean payment(Double total){
        /* Takes total as the input argument from the order class */
        /* return true if paymentAmount==total */
        /* return error message otherwise */
    }

    public void getToken(Cashier obj){
        /* Gets the token from the Cashier */
    }
    public void wait(Cashier obj){
        /* Gets the waiting time in minutes by the cashier */

    }
    public void getNotification(Barista obj){
        /* Gets notify by the barista to collect the order */
    }

}
class Cashier{
    String token;
    String queue;
    Map<String,ArrayList<String>> orderMap;
    public String createOrder(Customer customer, Order obj){
        /* if payment == true, creates a map with token as the key and
        the order list as the value and returns a auto incremented token*/
        /* else error message */
    }
    public Queue<String> orderQueue(){
        /* inserts every value in the orderMap in the queue*/
        return queue;
    }
    public TimeUnit.MINUTES waitTime(){
        /* Calculates the wait time according to the
        numbers of order in the order queue */
        return time;
    }

}
class Barista{
    public Queue<String> getOrderFromQueue(Cashier obj){
        /* Get the order queue created by the cashier */
    }
    public Queue<String> prepareOrder(){
        /* inserts the items in a prepare queue which have been prepared by the barista */

    }
    public boolean completeOrder(Cashier obj){
        /* if prepare queue == value at the first key of the map */
        /* then complete == true */
        /* remove the items from the prepare queue, order queue and the map */
        /* return complete */
    }
    public boolean giveNotification(){
        /* if complete == true */
        /* notify == true */
    }

}
class Order{
    int totalAmount;
    Map<String,Double> itemMap = new HashMap<>();
    /* This map contains the food items available in the
    coffee shop as the key of the map and the price as the value*/
    public List<String> placeOrder() {
        List<String> order = new ArrayList<>();
        /* This method takes the order as an array which contains
        the order items choosen by the customer */
        return order;
    }
    public int total(){
        /* This method calculates the total amount to be paid
        by the cutsomer according to the items in the order array */
        return totalAmount;
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        /* Displays the Menu and takes input of the order by the customer */

    }
}
