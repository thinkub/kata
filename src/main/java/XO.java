/**
 * Created by AL01485330 on 2017. 12. 4..
 */
public class XO {
    public static boolean getXO (String str) {
        int xCount = 0;
        int oCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if ("O".equalsIgnoreCase(String.valueOf(str.charAt(i)))) {
                oCount++;
            }
            if ("X".equalsIgnoreCase(String.valueOf(str.charAt(i)))) {
                xCount++;
            }
        }
        return oCount == xCount;
    }
}
