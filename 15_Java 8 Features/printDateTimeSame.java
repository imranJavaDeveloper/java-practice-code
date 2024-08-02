
import java.time.LocalDateTime;

public class printDateTimeSame {
    public static void main(String[] args) {

        LocalDateTime dateTime= LocalDateTime.now();
                int dd=dateTime.getDayOfMonth();
                int mm=dateTime.getMonthValue();
                int yy=dateTime.getYear();

        System.out.println("Date :"+dd+"-"+mm+"-"+yy); // Date :2-8-2024

                int h=dateTime.getHour();
                int m=dateTime.getMinute();
                int s=dateTime.getSecond();
                int n=dateTime.getNano();

        System.out.println("Time :"+h+"-"+m+"-"+s+"-"+n); // Time :23-58-12-750954200
    }
}
