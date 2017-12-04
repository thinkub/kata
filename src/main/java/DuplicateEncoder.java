/**
 * Created by AL01485330 on 2017. 12. 4..
 */
public class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (isDuplicate(word, word.charAt(i))) {
                sb.append(")");
            } else {
                sb.append("(");
            }
        }
        return sb.toString();
    }

    private static boolean isDuplicate(String str, Character c) {
        int dupCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                dupCount++;
            }
        }
        return dupCount > 1;
    }
}
