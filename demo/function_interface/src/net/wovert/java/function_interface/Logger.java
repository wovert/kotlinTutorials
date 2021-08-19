package net.wovert.java.function_interface;

/**
 * 日志案例
 * 存在性能浪费问题
 * 调用 show 方法，传递第二个参数是一个拼接后的字符串
 * 先把字符串拼接好，然后调用 show 方法
 * show 方法中如果传递人日志等级不是1级
 * 那么就不会如此拼接后的字符串
 * 感觉字符串就拼接好了，存在了浪费
 */
public class Logger {
    public static void show(int level, String message) {
        switch(level) {
            case 1:
                System.out.println(message);
        }
    }

    public static void show2(int level, MessageBuilder mb) {
        switch(level) {
            case 1:
                System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        show(2, msg1 + msg2 + msg3);

        /**
         * Lambda 表达式作为参数传递，仅仅是把参数传递到 show 方法中
         * 只有满足条件 MessageBuilder 中的方法 builderMessage
         * 才会进行字符串的拼接
         * 条件不满足，日志的等级不是1级，那么 MessageBuilder 接口中的方法 builderMessage 也不会执行
         * 所以拼接字符串代码也不会执行，所以不存在性能的浪费
         */
        show2(2, ()->{
            return msg1 + msg2 + msg3;
        });
    }
}

@FunctionalInterface
interface MessageBuilder {
    public abstract String builderMessage();
}
