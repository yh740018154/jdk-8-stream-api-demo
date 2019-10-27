package cn.com.yangheng.StringLearn;

import org.junit.Test;

import java.util.Arrays;

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
        char value[]={'a','c','b'};
        String string = new String(value);
        String copyValueOf = String.copyValueOf(value);
        String format = String.format("111");
        boolean isContains = string.contains("a");
        int hashCode = string.hashCode();
        String toLowerCase = string.toLowerCase();
        int compareTo = string.compareTo("abc");
        int length = string.length();
        int i = string.indexOf(97);
        int codePointAt = string.codePointAt(1);

        string.intern();
        string.codePointBefore(1);
        char v2[]={};
        char[] chars = Arrays.copyOf(value, 1);
        String str="acb";
        boolean abc = "acb".equals("abc");
        System.out.println("string->"+string);
        System.out.println("copyValueOf->"+copyValueOf);
        System.out.println("format->"+format);
        System.out.println("isContains->"+isContains);
        System.out.println("hashCode->"+hashCode);
        System.out.println("toLowerCase->"+toLowerCase);
        System.out.println("compareTo->"+compareTo);
        System.out.println("length->"+length);
        System.out.println("i->"+i);
        System.out.println("codePointAt->"+codePointAt);
        System.out.println(abc);



    }
}
