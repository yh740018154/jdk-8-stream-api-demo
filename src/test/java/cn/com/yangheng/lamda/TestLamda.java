package cn.com.yangheng.lamda;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;
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

        //Predicate 是对参数的判断，Consumer 是表示一个接受单个输入参数并且没有返回值的操作
        Consumer<String> consumer = p -> System.out.println("coffee" + p);
        consumer.accept("yangheng");

        //Consumer 是对传入的参数做一个 void 操作，Function 则是对传入的参数做相应的处理，返回一个定义的类型。Function 执行的入口是 apple 接口
        Function<Integer, String> f = x -> x + "123";
        System.out.println(f.apply(0));

        //Supplier 和 Function 一样返回一个定义的类型，不同的是，不需要参数
        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());


        List<Integer> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
        System.out.println("sum is :"+nums.stream().filter(num -> num != null).distinct().mapToInt(num -> num * 2).peek(System.out::println).skip(2).limit(4).sum());
    }


    @Test
    public void test() {
        Number number1 ;


    }

}
