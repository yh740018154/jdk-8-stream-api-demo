package cn.com.yangheng.sourceCode;

/**
 * @author yangheng
 * @Classname StringDemo
 * @Description TODO
 * @Date 2019/10/26 15:22
 * @group smart video north
 */
public final class StringDemo implements java.io.Serializable, Comparable<StringDemo>, CharSequence {

    private final char value[];

    private int hash;

    private static final long serializableId=-1L;

    public StringDemo() {
        this.value = null;
    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }


    public int compareTo(String o) {
        return 0;
    }

    @Override
    public int compareTo(StringDemo o) {
        return 0;
    }
}
