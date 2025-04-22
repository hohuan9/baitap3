
package test;
import com.mycompany.student.Student;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentTest {
    @Test
    public void testGetName() {
        Student student = new Student("S01", "John Doe", 20);
        Assert.assertEquals(student.getName(), "John Doe");
    }

    @Test
    public void testSetAge() {
        Student student = new Student("S01", "John Doe", 20);
        student.setAge(25);
        Assert.assertEquals(student.getAge(), 25);
    }

    @Test
    public void testUpdateName() {
        Student student = new Student("S01", "John Doe", 20);
        student.updateName("Jane Doe");
        Assert.assertEquals(student.getName(), "Jane Doe");
    }
}
