import java.util.List;
import java.util.stream.Collectors;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 6..
 */
public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        return grades.stream()
                     .skip(0)
                     .map(GradingStudents::getGrade)
                     .collect(Collectors.toList());
    }

    private static Integer getGrade(Integer grade) {
        if (isRounded(grade)) {
            Integer result = (Math.round(grade / 5) * 5) + 5;
            return result > 39 ? result : grade;
        }
        return grade;
    }

    private static boolean isRounded(Integer grade) {
        return (Math.round(grade / 5) * 5) + 5 - grade <= 2;
    }


}
