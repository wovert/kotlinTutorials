package net.wovert.java.function_interface;

import java.util.function.Supplier;

// Supplier 生产型函数式接口
public class DemoSupplier {
    public static void main(String[] args) {
//        String s = getString(() -> {
//            // 生产一个字符串，并返回
//            return "胡歌";
//        });
        String s = getString(() -> "胡歌");
        System.out.println(s);

        int[] arr = {100, 0, -50, 88, 99, -30};
        int maxValue = getMax(() -> {
           // 获取数组最大值，并返回
           int max = arr[0];
           // 遍历数组
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中元素最大值是：" + maxValue);
    }

    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
