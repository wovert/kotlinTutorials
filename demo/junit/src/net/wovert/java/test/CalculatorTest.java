package net.wovert.java.test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import net.wovet.java.junit.Calculator;

public class CalculatorTest {

    /**
     * 初始化方法
     * 用于资源申请，所以测试方法在执行之前都会先执行该方法
     */
    @Before
    public void init() {
        System.out.println("init...");
    }

    /**
     * 释放资源的方法
     * 在所有方法执行完后，都会自动执行该方法
     */
    @After
    public void close() {
        System.out.println("close");
    }

    /**
     * 测试 add 方法
     */
    @Test
    public void testAdd() {
//        System.out.println("我被执行了");
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        System.out.println("testsub...");
//        System.out.println(result);

        Assert.assertEquals(3, result);
    }

    @Test
    public void testSub() {
        System.out.println("我被执行了");
        Calculator c = new Calculator();
        int result = c.sub(2, 2);
        System.out.println(result);
    }
}
