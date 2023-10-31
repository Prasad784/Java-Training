package First;

class ArrayListDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNames();

        student.printNames();
        student.getName("2");
        student.getName("5"); // Not found
        student.printNamesKeySet();
        student.printSize();
        student.remove("3");

        student.printNames();
    }
}
