
import java.time.LocalDate;
import java.time.LocalTime;

public class findLocalDate2 {
    public static void main(String[] args) {

        LocalDate date= LocalDate.now();

        // print Local date
             int dd=date.getDayOfMonth();
             int mm=date.getMonthValue();
             int yy=date.getYear();

        System.out.println(dd+"-"+mm+"-"+yy);  // 2-8-2024

        // but i want to print hours

        LocalTime time= LocalTime.now();

        int h=time.getHour();
        int m=time.getMinute();
        int s=time.getSecond();
        int n=time.getNano();

        System.out.println("Time : "+h+"-"+m+"-"+s+"-"+n); // print current date Time : 23-45-40-205752400
    }
}
