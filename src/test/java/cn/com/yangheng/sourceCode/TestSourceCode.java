package cn.com.yangheng.sourceCode;

import org.junit.Test;

/**
 * @author yangheng
 * @Classname TestSourceCode
 * @Description TODO
 * @Date 2019/10/26 15:13
 * @group smart video north
 */
public class TestSourceCode {

    /**
     * short学习
     */
    @Test
    public void testShort(){
        Short decode = Short.decode("111");
        System.out.println("decode-》"+decode);
        short parseShort = Short.parseShort("11111");
        System.out.println("parseShort->"+parseShort);
        int hashCode = Short.hashCode((short) 111);
        System.out.println("hash->"+hashCode);
    }
}
