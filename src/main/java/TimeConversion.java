/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 5..
 */
public class TimeConversion {
    private static final String PM = "PM";
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String separator = s.substring(s.length() - 2);
        Integer hour = Integer.valueOf(s.substring(0, 2));
        boolean isPM = PM.equalsIgnoreCase(separator);


        return getHour(hour, isPM) + ":" + s.substring(3, s.length() - 2);

    }

    private static String getHour(Integer hour, boolean isPM) {
        if (hour < 12 && isPM) {
            return String.valueOf(hour + 12);
        }
        if (hour == 12 && !isPM) {
            return "00";
        }
        return String.format("%02d", hour);
    }
}
