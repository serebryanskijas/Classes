import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.TimeZone;

public class Calendars {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Date date0 = new Date();
        System.out.println(date0);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String sDate = dateFormat.format(date0);
        System.out.println(sDate);

        calendar.add(Calendar.MONTH, 1);
        Date dateAfter = calendar.getTime();
        sDate = dateFormat.format(dateAfter);
        System.out.println(sDate);
        calendar = new GregorianCalendar(2021, Calendar.DECEMBER, 31);
        Date specDate = calendar.getTime();
        sDate = dateFormat.format(specDate);
        System.out.println(sDate);

        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        System.out.println("TimeZone : " + timeZone.getID() + " (" + timeZone.getDisplayName() + ")\n");

    }
}
