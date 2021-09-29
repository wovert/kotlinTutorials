// 常用方法
// 1. 延迟方法：返回值类型是 Stream 接口自身类型的方法，因此支持链式调用（除了终结方法外，其余方法均为延迟方法）
// 2. 终结方法：返回值类型不再是 Stream 接口自身类型的方法，因此不再支持类似 StringBuilder 那样的链式调用

import java.util.stream.Stream;

public class DemoStreamMethod {
    public static void main(String[] args) {
        forEachMethod();
        filterMethod();

    }

    /**
     * Stream 流属于管道流，只能被消费（使用）一次
     * 第一个 Stream 流调用完毕方法，数据就会流转到下一个 Stream 上
     * 而这时第一个Stream流已经使用完毕，就会关闭了
     * 所以第一个 Stream流就不能在调用方法了
     */

    // 过滤方法：一个流转换成另一个子集流
    private static void filterMethod() {
        Stream<String> stream1 = Stream.of("张三丰","李四","王五","张无忌");
        Stream<String> stream2 = stream1.filter((String name) -> {
            return name.startsWith("张");
        });
        stream2.forEach(name -> System.out.println(name));

        // 报错，流已经用完了
//        stream1.forEach(name -> System.out.println(name));
    }

    // 遍历方法
    private static void forEachMethod() {
        // Comsumer 接口是消费型的函数式接口，可以传递 Lambda 表达式，消费数据
        // 获取Stream流
        Stream<String> stream1 = Stream.of("张三","李四","王五","赵六");

        // forEach 方法对Stream流中的数据进行遍历
//        stream1.forEach((String name) -> {
//            System.out.println(name);
//        });
//
        stream1.forEach(name -> System.out.println(name));
    }


}
