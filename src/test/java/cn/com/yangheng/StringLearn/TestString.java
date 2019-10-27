package cn.com.yangheng.StringLearn;

import org.junit.Test;

/**
 * @author yangheng
 * @Classname TestString
 * @Description String源码剖析：
 *
 * @Date 2019/10/26 15:33
 * @group smart video north
 */
public class TestString {

    @Test
    public void testString(){
        char value[]={'a','b','c'};
        String string = new String(value, 1, 1);
        String copyValueOf = String.copyValueOf(value);
        String.format();
        System.out.println("string->"+string);
        System.out.println("copyValueOf->"+copyValueOf);

    }
}
