public class CheckedExample2 {
    public static void main(String[] args) {
        try {
            // Trying to load a class that doesn't exist
            Class.forName("com.unknown.MyClass");  // Checked exception
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
