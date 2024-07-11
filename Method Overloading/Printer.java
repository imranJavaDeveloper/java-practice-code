
public class Printer {
    void print(String text)
    {
        System.out.println("String : " + text);
    }

    void print(int num)
    {
        System.out.println("Integer : " + num);
    }

    public static void main(String[] args)
    {
        Printer Printer = new Printer();
        Printer.print("Hello World");
        Printer.print(47);
    }
}
