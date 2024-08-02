
import java.time.LocalDate;

public class findLocalDate{
    public static void main(String[] args) {

        LocalDate date= LocalDate.now();
        System.out.println(date);  // 2024-08-02

        // But I want to print like 02-08-2024

        LocalDate d= LocalDate.now();
                 int dd=d.getDayOfMonth();
                 int mm=d.getMonthValue();
                 int yy=d.getYear();

        System.out.println(dd+"-"+mm+"-"+yy);  //2-8-2024
    }
}
