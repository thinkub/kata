import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2019. 8. 6..
 */
public class GradingStudentsTest {

    @Test
    public void gradingStudents() {
        List<Integer> grades = Arrays.asList(4, 73, 67, 38, 33);
        List<Integer> result = GradingStudents.gradingStudents(grades);
        System.out.println(result);
    }
}