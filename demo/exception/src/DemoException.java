import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoException {
    public static void main(String[] args) /*throws ParseException*/ {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 用来格式化日期
        Date date = null; // 把字符串格式的日期，解析为 Date 格式的日期
        try {
            date = sdf.parse("1999-0312");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);

        // RuntimeException
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("后续代码");

        // Error: OutOfMemory: Java heap space(内存益出，创建数组太大，超出了JVM分配的内存)
        int[] arr2 = new int[1024*1024*1024];
    }
}
