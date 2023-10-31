import java.util.Vector;
import java.util.Date;

// Define the Pizza class hierarchy from your previous assignment (if not already defined)
class Pizza {
    // Define properties and methods for the Pizza class hierarchy
    // ...
}

class Bill {
    private int billNo;
    private String custName;
    private Date date;
    private int total;
    private Vector<Pizza> pizza;

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Vector<Pizza> getPizza() {
        return pizza;
    }

    public void setPizza(Vector<Pizza> pizza) {
        this.pizza = pizza;
    }
}

public class Reception {
    public static void main(String[] args) {
        Bill bill = new Bill();
        
        // Accept user input for Bill details
        // ...

        // Create a Vector to store pizza orders
        Vector<Pizza> pizzaOrders = new Vector<>();

        // Accept user input for multiple pizza orders
        // ...
        
        // Set the pizza orders in the Bill
        bill.setPizza(pizzaOrders);

        // Calculate the total bill amount
        // ...

        // Set the total amount in the Bill
        bill.setTotal(total);

        // Display the Bill
        // ...
    }	
}
