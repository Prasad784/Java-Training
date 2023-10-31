import java.util.HashSet;

public class RemoveArray {

    public static void main(String[] args) {

        int[] originalArray = {1,1,2,2,3,4,6,4,5,7,8,6};

        
        HashSet<Integer> uniqueSet = new HashSet<>();

        
        int[] uniqueArray;

        
        for (int i : originalArray) {

            uniqueSet.add(i);
        }

        
        uniqueArray = new int[uniqueSet.size()];

        int index = 0;

        for (int element : uniqueSet) {

            uniqueArray[index++] = element;
        }

        
        System.out.println("Original Array: ");

        for (int num : originalArray) {

            System.out.print(num + " ");
        }

        System.out.println("\nArray with Duplicate Elements Removed: ");

        for (int num : uniqueArray) {

            System.out.print(num + " ");
        }
    }
}
