package net.wovert.java.function_interface;

import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        String str = "123";
        change(str, (String s) -> {
            // 把字符串类型的整数，转换为 Integer 类型的整数返回
            return Integer.parseInt(s);
        });
        change(str, s ->Integer.parseInt(s));

//        changeAdd(str, (String s) -> {
//            return Integer.parseInt(s) + 10;
//        }, (Integer i) -> {
//            return i + "";
//        });
        changeAdd(str, s -> Integer.parseInt(s) + 10, i ->i + "");

        String s2 = "赵丽玲,23";
        customFun(s2, s -> {
            String s1 = s.split(",")[1];
            return s1;
        }, s -> {
            int i = Integer.parseInt(s);
            return i;
        }, i->{
            i += 100;
            return i;
        });
    }

    private static void customFun(String s,
                                  Function<String, String> fun1,
                                  Function<String, Integer> fun2,
                                  Function<Integer, Integer> fun3) {

        int res = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(res);
    }

    /**
     * 定义方法: 使用Function 接口的方法 apply，把字符串类型的整数，转换为 Integer 类型的整数
     * 方法参数1：字符串类型的整数
     * 方法参数2：Function接口，范性使用<String, Integer>
     */
    public static void change(String s, Function<String, Integer> fun) {
//        Integer in = fun.apply(s);
        int in = fun.apply(s);
        System.out.println(in);
    }

    /**
     * Function 接口的默认方法 andThen: 用来进行组合操作
     * 需求：String 类型的 "123", 转换为 Integer 类型，把转换后的结果加 10
     * 把增加之后的 Integer 类型的数据，转换为 String
     */
    public static void changeAdd(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String resStr = fun1.andThen(fun2).apply(s);
        System.out.println(resStr);
    }
}
