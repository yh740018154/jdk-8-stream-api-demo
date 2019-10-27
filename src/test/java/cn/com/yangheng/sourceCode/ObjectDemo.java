package cn.com.yangheng.sourceCode;

/**
 * @author yangheng
 * @Classname ObjectDemo
 * @Description TODO
 * @Date 2019/10/24 14:39
 * @group smart video north
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Object object = new Object();
        Number number=new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };
        Byte byt =new Byte((byte)127);
    }

    Short aShort =new Short((short)1110);
    Integer integer;
    char[] chars={};
    Long aLong;

    String string;
}
