import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class DayOfProgrammer {
    private static final int DAY_OF_THE_PROGRAMMER = 256;

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        if (year > 1699 && year < 1918) {
            LocalDate julianDate = LocalDate.ofYearDay(year, DAY_OF_THE_PROGRAMMER - 1);
            return julianDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        }
        LocalDate date = LocalDate.ofYearDay(year, DAY_OF_THE_PROGRAMMER);
        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
