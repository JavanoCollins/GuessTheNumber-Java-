import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

/*
Working with dates
*/
public class Question3 {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 2 2013"));
    }

    public static boolean isDateOdd(String date) {

        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("MMMM d yyyy").toFormatter(Locale.ENGLISH);

        LocalDate localDate = LocalDate.parse(date, formatter);

        int dayNumber = localDate.getDayOfYear();
        if (dayNumber % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}

