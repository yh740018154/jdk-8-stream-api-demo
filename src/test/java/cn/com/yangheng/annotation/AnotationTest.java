package cn.com.yangheng.annotation;

import cn.com.yangheng.model.Student;
import org.junit.Test;

/**
 * @author yangheng
 * @Classname AnotationTest
 * @Description TODO
 * @Date 2019/10/11 8:46
 * @group smart video north
 */
public class AnotationTest {
    @Test
    public void testNotNull() {
        Student student = new Student();
        student.setsName("yangheng");
        System.out.println(student);
    }
}
