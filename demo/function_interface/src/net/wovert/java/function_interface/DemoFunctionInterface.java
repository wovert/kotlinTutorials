package net.wovert.java.function_interface;

/**
 * 可以检测是否是一个函数式接口
 *   - 是：编译成功
 *   - 否：编译失败
 */
@FunctionalInterface
interface MyFunctionInterface {
    public abstract void method();
//    void method2();
}

class MyFunctionInterfaceImp implements MyFunctionInterface {

    @Override
    public void method() {
        System.out.println("实现类重写方法");
    }
}

public class DemoFunctionInterface {
    public static void main(String[] args) {
        // 接口的实例类对象
        show(new MyFunctionInterfaceImp());

        // 接口的匿名内部类
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("接口的匿名内部类重写方法");
            }
        });

        // 方法的参数是一个函数式接口，可以使用 Lambda 表达式
        show(() -> {
            System.out.println("使用Lambda 表达式重写抽象方法");
        });

        show(()->
            System.out.println("使用Lambda 表达式重写抽象方法")
        );
    }

    /**
     * 参数使用函数式接口
     */
    public static void show(MyFunctionInterface myInter) {
        myInter.method();
    }
}
