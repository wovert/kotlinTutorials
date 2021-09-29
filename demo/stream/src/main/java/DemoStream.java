import java.util.*;
import java.util.stream.Stream;

// Stream JDK 1.8+支持
// 1. 所有 Collection 集合都可以通过 stream 默认方式获取流 default Stream<E> stream()
// 2. Stream 接口的静态方法 of 可以后去数组对应的流 staic <T> Stream<T> of (T... values)
// 参数是一个可变参数，可以传递一个数组
public class DemoStream {
    public static void main(String[] args) {
        method();
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.add("张三丰");
        list.add("郭峰");

        list.stream().filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }

    private static void method() {
        // 集合转换为Stream 流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String, String> map = new HashMap();

        // 获取键，存储到一个 Set 集合中; Map集合转换为Set集合
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();

        // 获取值，存储到一个Collection 集合中；Map集合转换为 Collection 集合，即单例集合
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        // 获取键值对（键与值的映射关系 entrySet）
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        // 数组转换为 Stream 流, 传可变参数
        Stream<Integer> stream6 = Stream.of(1,2,3,4,5);

        // 可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5,6};
        Stream<Integer> stream7 = Stream.of(arr);
        String[] arr2 = {"a", "b", "c", "d"};
        Stream<String> stream8 = Stream.of(arr2);




    }
}
