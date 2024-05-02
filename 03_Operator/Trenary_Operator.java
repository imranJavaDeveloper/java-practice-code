package operator;

public class Trenary_Operator {
    public static void main(String[] args) {

        int a = 20, b = 10, c = 30, Max;

        // result holds max of three
        // numbers
        Max = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = "+ Max);
    }
}
