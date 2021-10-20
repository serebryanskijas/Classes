import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Dates {
    public static void main(String[] args) {
        DateTimeFormatter datetime_f = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime date_time = LocalDateTime.now();
        String s_dt = datetime_f.format(date_time);
        System.out.println(date + " " + time);
        System.out.println(date_time);
        System.out.println(s_dt);

    }
}
