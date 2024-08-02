
import java.time.LocalTime;

public class PrintHours {
    public static void main(String[] args) {

        LocalTime time= LocalTime.now();
          int h=time.getHour();
          int m=time.getMinute();
          int s=time.getSecond();
          int n=time.getNano();

        System.out.println("Time :"+h+"-"+m+"-"+s+"-"+n);
    }
}
