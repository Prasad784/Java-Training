package First;
import java.util.HashMap;

class Student {
    private HashMap<String, String> empNames = new HashMap<String, String>();

    public void setNames() {
        
        empNames.put("1", "John");
        empNames.put("2", "Alice");
        empNames.put("3", "Bob");
        empNames.put("4", "Eve");
    }

    public void printNames() {
      
        System.out.println("List of student names:");
        for (String key : empNames.keySet()) {
            System.out.println("Roll No: " + key + ", Name: " + empNames.get(key));
        }
    }

    public void getName(String key) {
        
        if (empNames.containsKey(key)) {
            System.out.println("Name for Roll No " + key + ": " + empNames.get(key));
        } else {
            System.out.println("Roll No " + key + " not found.");
        }
    }

    public void printNamesKeySet() {
        
        System.out.println("List of student names using keyset:");
        for (String key : empNames.keySet()) {
            System.out.println(empNames.get(key));
        }
    }

    public void printSize() {
       
        System.out.println("Size of the HashMap: " + empNames.size());
    }

    public void remove(String key) {
        
        if (empNames.containsKey(key)) {
            empNames.remove(key);
            System.out.println("Removed Roll No " + key + " from the list.");
        } else {
            System.out.println("Roll No " + key + " not found.");
        }
    }
}
