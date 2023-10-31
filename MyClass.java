public class MyClass {
    static int count = 0; // A static field shared by all instances

    public MyClass() {
        count++; // Increment count each time a new instance is created
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
 MyClass obj3 = new MyClass();

        System.out.println("Number of instances created: " + MyClass.count); // Output: 2
    }
}
