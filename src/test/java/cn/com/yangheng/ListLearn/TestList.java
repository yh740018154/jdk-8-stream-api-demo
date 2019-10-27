package cn.com.yangheng.ListLearn;

import cn.com.yangheng.entity.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangheng
 * @Classname TestList
 * @Description TODO
 * @Date 2019/10/27 13:15
 * @group smart video north
 */
public class TestList {

    @Test
    public void testList() {
        List list = new ArrayList();
        list.add(new Student());
        list.add(1);
        int hashCode1 = new Student().hashCode();
        int hashCode = list.hashCode();
        System.out.println("hash->"+hashCode1);
    }
}
