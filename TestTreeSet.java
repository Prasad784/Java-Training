package First;
import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet {
    public static void main(String[] args) {
       
        TreeSet<String> productSet = new TreeSet<String>();

      
        productSet.add("Laptop");
        productSet.add("Phone");
        productSet.add("Tablet");
        productSet.add("Laptop"); 
        productSet.add("Headphones");

        
        System.out.println("Product Names:");
        Iterator<String> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        if (!productSet.isEmpty()) {
            System.out.println("First Product: " + productSet.first());
            System.out.println("Last Product: " + productSet.last());
        } else {
            System.out.println("Product set is empty.");
        }

        
        System.out.println("Size of TreeSet: " + productSet.size());

        
        String productToRemove = "Tablet";
        if (productSet.contains(productToRemove)) {
            productSet.remove(productToRemove);
            System.out.println(productToRemove + " has been removed from the set.");
        } else {
            System.out.println(productToRemove + " not found in the set.");
        }

       
        System.out.println("Size of TreeSet after removal: " + productSet.size());
    }
}

