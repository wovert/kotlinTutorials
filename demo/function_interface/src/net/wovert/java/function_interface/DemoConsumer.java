package net.wovert.java.function_interface;

import java.util.Locale;
import java.util.function.Consumer;

/**
 * 消费型函数式接口，范型执行什么类型，就可以使用 accept 方法消息什么类型的数据
 * 具体怎么消费，需要自定义（输出，计算）
 */
public class DemoConsumer {

    /**
     * 方法的参数传递一个字符串的姓名
     * 方法的参数传递 consumer 接口，范型使用 String
     * 可以使用 Consumer 接口消费字符串的姓名
     */
    public static void method(String name, Consumer<String> con) {
        con.accept(name);
    }

    public static void main(String[] args) {
        method("刘德华", (String name) -> {
            // 对传递的字符串进行消费
            // 消费方式：直接输出字符串
//            System.out.println(name);

            // 消费方式：把字符串进行反转输出
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });

        method2("Hello",
                (t) -> {
                    System.out.println(t.toUpperCase());
                },
                (t) -> {
                    System.out.println(t.toLowerCase());
                });

        String[] arr = {"迪丽热巴, 女", "古力娜扎,女", "玛尔扎哈,男"};
        printInfo(arr, (m) -> {
            // 消费方式：对 m 切割，获取姓名，按照指定的格式输出
            String name = m.split(",")[0];
            System.out.print("姓名：" + name);
        }, (m) -> {
            // 消费方式：对 m 切割，获取年龄，按照指定的格式输出
            String age = m.split(",")[1];
            System.out.println(",年龄：" + age);
        });
    }

    /**
     * andThen 方法
     * 作用：需要两个 Consumer 接口，可以把两个 Consumer 接口组合到一起，在对数据进行消费
     * Consumer<String> con1
     * Consumer<String> con2
     * con1.accept(s)
     * con2.accept(s)
     *
     * 连接两个 Consumer 接口，再进行消费
     * con1.andThen(con2).accept(s); 谁在前边谁先消费
     */
    public static void method2(String s, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(s);
//        con2.accept(s);
        con1.andThen(con2).accept(s);
    }

    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String message: arr) {
            con1.andThen(con2).accept(message);
        }
    }
}
