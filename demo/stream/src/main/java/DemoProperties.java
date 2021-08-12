import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {
    public static void main(String[] args) throws IOException {
//        show1();
//        show2();
        show3();
    }

    private static void show1() {
        // create Properties Object
        Properties prop = new Properties();

        // add data
        prop.setProperty("梅西", "no1");
        prop.setProperty("内马尔", "no2");
        prop.setProperty("姆巴佩", "no3");

        // stringPropertyNames 把 Properties 集合中的键取出，存储到一个 Set 集合中
        Set<String> set = prop.stringPropertyNames();

        // 遍历 Set 集合，取出 Properties 集合的每一个键
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println( key + "=" + value);
        }
    }
    private static void show2() throws IOException {
        // 1. create Properties Collection Object, Add data
        Properties prop = new Properties();

        // 2. Create Byte output stream/character output stream object, constructor binding output target
        prop.setProperty("梅西", "no1");
        prop.setProperty("内马尔", "no2");
        prop.setProperty("姆巴佩", "no3");

        // 3. 集合中的临时数据，持久化写入到硬盘存储
        FileWriter fw = new FileWriter("./property_data.txt");
        prop.store(fw, "save data");

        // 4. 释放资源
        fw.close();
    }
    private static void show3() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("./property_data.txt"));

        Set<String> set = prop.stringPropertyNames();
        for(String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
