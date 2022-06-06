import java.util.Calendar;
import java.util.Locale;

public class JavaDateTimeSolution {
    
    public static void main(String[] args) {
        String day = findDay(8, 14, 2017);
        System.out.println(day);
    }
    public static String findDay(int month, int day, int year) {
        if (year>2000 && year<3000) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month - 1);
            cal.set(Calendar.DAY_OF_MONTH , day);
            return cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,Locale.US).toUpperCase();
        }
        return "aaa";

    }

}
