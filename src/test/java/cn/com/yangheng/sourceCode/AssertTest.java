package cn.com.yangheng.sourceCode;

import org.junit.Test;
import org.springframework.util.Assert;

/**
 * @author yangheng
 * @Classname AssertTest
 * @Description TODO
 * @Date 2019/10/27 14:42
 * @group smart video north
 */
public class AssertTest {

    @Test
    public void testAssert() {
        String test = null;
        Assert.notNull(test, "test is null");
    }
}
