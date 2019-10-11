package cn.com.yangheng.lamda;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author yangheng
 * @Classname TestLamda
 * @Description TODO
 * @Date 2019/10/11 17:13
 * @group smart video north
 */
public class TestLamda {

    @Test
    public void testLamda() {
        //判断输入的对象是否符合某个条件，Predicate 是一个布尔类型的函数，该函数只有一个输入参数
        Predicate<String> predicate = x -> x.length() > 3;
        System.out.println("predicate"+predicate.test("123"));

        //Consumer 是表示一个接受单个输入参数并且没有返回值的操作
        Consumer<String> consumer = p -> System.out.println("coffee" + p);
        consumer.accept("yangheng");

        Function<Integer, String> f = x -> x + "123";
        System.out.println(f.apply(0));

        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());

    }
}
