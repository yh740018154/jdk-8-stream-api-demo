package cn.com.yangheng.validation;

/**
 * @author yangheng
 * @Classname ValidationTest
 * @Description TODO
 * @Date 2019/10/27 15:23
 * @group smart video north
 */
public class ValidationTest {

    public static String validate(Object... objects) {
        for (Object object : objects) {
            if (null == object)
                return "入参为空";
            
        }
        return null;

    }
}
