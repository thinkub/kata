import org.junit.Test;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 8..
 */
public class DayOfProgrammerTest {
    private static final int DAY_OF_THE_PROGRAMMER = 256;

    @Test
    public void dayOfProgrammer() {
        int year = 1800;
        if (year > 1699 && year < 1918) {
            LocalDate julianDate = LocalDate.ofYearDay(year, DAY_OF_THE_PROGRAMMER + 1);
            System.out.println(julianDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        }
        LocalDate date = LocalDate.ofYearDay(year, DAY_OF_THE_PROGRAMMER);
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

    }

    @Test
    public void leapYear() {
        int year = 1917;
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(year));
    }
}