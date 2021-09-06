package net.wovert.java.function_interface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Predicate：对某种数据类型的数据进行判断，结果返回一个 boolean 值
 */
public class DemoPredicate {
    public static void main(String[] args) {
        String s = "hello";
//        boolean b = checkString(s, (String str) -> {
//          return str.length() > 5;
//        });
        // 优化 Lambada 表达式
        boolean b = checkString(s, str -> str.length() > 5);
        System.out.println(b);

        boolean b1 = checkStringAnd(s, (String str) -> {
            return str.length() > 4;
        }, (String str) -> {
            return str.contains("h");
        });
        System.out.println(b1);

        String s2 = "how are you";
        boolean b2 = checkStringOr(s2, (String str) -> {
            return str.length() > 4;
        }, (String str) -> {
            return str.contains("k");
        });
        System.out.println(b2);

        boolean b3 = checkStringNegate(s2, (String str) -> {
            return str.length() > 4;
        });
        System.out.println(b3);

        // 帅选姓名为4个子的女性
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "罗纳尔多,男", "刘德华,男"};
        ArrayList<String> res = filterItem(arr, (String str) -> {
            return str.split(",")[1].equals("女");
        }, (String str) -> {
            return str.split(",")[0].length() == 4;
        });
        System.out.println(res);


    }


    /**
     * 判断一个字符串，有两个判断的条件
     * 1. 需要使用两个 Predicate 接口
     * 2. 必须同时满足两个条件
     */
    private static ArrayList<String> filterItem(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        // 遍历数组，获取数组中的每一条信息
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if (b) {
                list.add(s);
            }
        }
        return list;
    }

    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    public static boolean checkStringAnd(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }

    public static boolean checkStringOr(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);
    }

    public static boolean checkStringNegate(String s, Predicate<String> pre) {
//        return !pre.test(s)
        return pre.negate().test(s);
    }

    
}
