class Customer {
    private int custNo;
    private String custName;
    private String custAddr;

    public Customer() {
        // Default constructor
        custName = "Shiva";
    }

    public Customer(int custNo, String custName, String custAddr) {
        this.custNo = custNo;
        this.custName = custName;
        this.custAddr = custAddr;
    }

    public void display() {
        System.out.println("Customer Number: " + custNo);
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer Address: " + custAddr);
    }

    // Setters and Getters
    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }
}



class CustomerReport {
    private Customer[] custList;

    public CustomerReport(int size) {
        custList = new Customer[size];
    }

    public void addCustomer(Customer customer) {
        for (int i = 0; i < custList.length; i++) {
            if (custList[i] == null) {
                custList[i] = customer;
                break;
            }
        }
    }

    public void printList() {
        for (Customer customer : custList) {
            if (customer != null) {
                customer.display();
                System.out.println();
            }
        }
    }
}




public class PizzaHut {

    public static void main(String[] args) {

        // Create a CustomerReport with space for 5 customers

        CustomerReport report = new CustomerReport(5);

        // Accept values from the user and create Customer objects

        for (int i = 0; i < 5; i++) {

            int custNo = i + 1;
            System.out.println("Enter details for Customer " + custNo);

            // You can replace the input methods with your preferred way of accepting user input.

            // For simplicity, we use hardcoded values here.

            String custName = "Customer" + custNo;
            String custAddr = "Address" + custNo;
            Customer customer = new Customer(custNo, custName, custAddr);
            report.addCustomer(customer);
        }

        // Print the customer report

        System.out.println("Customer Report:");
        report.printList();
    }
}





public class Customer {
    private int custNo;
    private String custName;
    private String custAddr;
    private static int billNo = 1000; // Static variable for bill number

    static {
        // Static initialization block to set initial bill number
        billNo = 1000;
    }

    public Customer(String custName, String custAddr) {
        this.custNo = billNo++; // Automatically increment bill number
        this.custName = custName;
        this.custAddr = custAddr;
    }

    public void display() {
        System.out.println("Bill No: " + custNo + "\t\tDate: __________");
        System.out.println("\nCustomer: " + custName);
        System.out.println("Address: " + custAddr);
    }

    public static void printBillNo() {
        System.out.println("Bill No: " + billNo);
    }
}



import java.util.Scanner;

public class PizzaHut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while (choice == 1) {
            System.out.println("Enter customer details:");
            System.out.print("Customer Name: ");
            String name = scanner.next();
            System.out.print("Customer Address: ");
            String address = scanner.next();

            Customer customer = new Customer(name, address);

            System.out.println("\nBill details:");
            customer.display();
            Customer.printBillNo();

            System.out.println("\nDo you want to create another bill? (1/0): ");
            choice = scanner.nextInt();
        }
        scanner.close();
    }
}




abstract class Pizza {

    protected String type;

    protected String[] toppings;

    protected String name;

    protected float timeForPreparation;

    protected int costOfPizza;

    protected String size;

 

    

    public Pizza(String type, String[] toppings, String name, float timeForPreparation, String size) {

        // Validation

        if (!type.equalsIgnoreCase("veg") && !type.equalsIgnoreCase("non-veg")) {

            System.out.println("Only Veg and Non-Veg type is allowed.");

            return;

        }

 

        if (!size.equalsIgnoreCase("small") && !size.equalsIgnoreCase("medium")) {

            System.out.println("Only small and medium size pizzas are available.");

            return;

        }

 

        this.type = type;

        this.toppings = toppings;

        this.name = name;

        this.timeForPreparation = timeForPreparation;

        this.size = size;

        this.costOfPizza = calculateCost();

    }

 

    //  calculating the total cost of the pizza

    public abstract int calculateCost();

 

    @Override

    public String toString() {

        StringBuilder toppingsStr = new StringBuilder();

        for (String topping : toppings) {

            toppingsStr.append(topping).append(", ");

        }

        String toppingsString = toppingsStr.toString().isEmpty() ? "No toppings" : toppingsStr.toString();

 

        return "Type: " + type + "\n" +

                "Toppings: " + toppingsString + "\n" +

                "Name: " + name + "\n" +

                "Time for Preparation: " + timeForPreparation + " minutes" + "\n" +

                "Size: " + size + "\n" +

                "Cost of Pizza: $" + costOfPizza;

    }

}

 

class ItalianPizza extends Pizza {

    public ItalianPizza(String type, String[] toppings, String name, float timeForPreparation, String size) {

        super(type, toppings, name, timeForPreparation, size);

    }

 

    

    @Override

    public int calculateCost() {

        if (type.equalsIgnoreCase("veg")) {

            if (size.equalsIgnoreCase("small")) {

                return 200;

            } else if (size.equalsIgnoreCase("medium")) {

                return 350;

            }

        } else if (type.equalsIgnoreCase("non-veg")) {

            if (size.equalsIgnoreCase("small")) {

                return 270;

            } else if (size.equalsIgnoreCase("medium")) {

                return 420;

            }

        }

        return 0;  

    }

}

 

 

interface Deliverable {

    int deliveryAreaLimit = 5;

 

    boolean delivery();

}

 

 

class Order implements Deliverable {

    private int orderNo;

    private Date orderDate;

    private int cost;

    private String custName;

    private String custAddress;

    private int approxDistance;

 

   

    public Order(int orderNo, Date orderDate, String custName, String custAddress, int approxDistance, int cost) {

        this.orderNo = orderNo;

        this.orderDate = orderDate;

        this.custName = custName;

        this.custAddress = custAddress;

        this.approxDistance = approxDistance;

        this.cost = cost;

    }

 

 

    @Override

    public boolean delivery() {

        if (approxDistance <= deliveryAreaLimit) {

            System.out.println("Home Delivery available for this distance.");

            return true;

        } else {

            System.out.println("Home Delivery not available for this distance.");

            return false;
 
        }

    }

}

 

 