
 //TUTORIAL 2: QUESTION 4
 class Order {
    private int orderId;
    private String customerName;
    private Double totalAmount;
    private Double discount;

    public Order (int orderID, String custName)//2-parameter constructors
    {
        this (orderID,custName, 250.0, 10.0);
        
    }

    public Order (int orderID, String custName, double totA, double dis)// All four constructors
    {
        orderId = orderID;
        customerName = custName;
        totalAmount = totA;
        discount = dis;
    }
    public Order (int orderID)
    {
        this (orderID, "Guest", 0.0, 0.0);//1-parameter constructors
    }
     void displayDetails() {//Gotta be in the class Order
        System.out.println("Order ID: " + orderId + " | Customer: " +
       customerName + " | Total Amount: $" + totalAmount + " | Discount:  " + discount +"%");
        }

        public String toString()
        {
            return "Testing toString method";//This will override the toString.() function
        }

}


    public class Tut2Q4 {//when there is main, the file name gotta be the same as class name & you gotta be the most lowest
        public static void main(String[] args) {
        Order o1 = new Order(1001);
        Order o2 = new Order(1002, "Ali");
        Order o3 = new Order(1003, "Bob", 150.0, 5.0);

    
       System.out.println(o1.toString());//print class name with its address
       System.out.println(o2);//the same thing as aboce

       /* // o1.displayDetails();
        o2.displayDetails();
        o3.displayDetails();*/
        }

      
       }

