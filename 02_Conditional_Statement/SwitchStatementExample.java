
public class SwitchStatementExample  {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number");

        int number= sc.nextInt();

        switch (number){
            //System.out.println("hello");
            /// java: case, default, or '}' expected
        }

        switch (number){
            case 1:
                System.out.println("hi");
                break;
            case 2:
                System.out.println("hello");
                break;
            default:
                System.out.println("some thing goes wrong");
        }


    }
}
