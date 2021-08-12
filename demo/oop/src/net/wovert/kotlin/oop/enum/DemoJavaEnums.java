public class DemoJavaEnums {
    public static void main(String[] args) {

    }
}

class JavaEnums {
    enum State implements Runnable {
        Idle {
            @Override
            public void run() {

            }
        },
        Busy {
            @Override
            public void run() {

            }
        }
    }
}