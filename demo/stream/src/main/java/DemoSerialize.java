import java.io.*;
import java.util.ArrayList;

/**
 * 序列化和反序列化时，会抛出 NotSerializableException 没有序列化异常
 * 类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
 * Serializable 接口也叫做标记型接口
 * 要进行序列化和反序列化的类必须实现 Serializable 接口，就会给类添加一个标记
 * 当进行序列化和反序列化时，就会检测类上是否有这个标记
 * 有：可以序列化和反序列化
 * 没有：就会抛出 NotSerializableException
 *
 * 注意：被 static 修饰的成员变量不能被序列化的，序列化的都是对象
 *
 * transient 关键字：瞬态关键字
 * 不想被序列化是 生命 private transient int age;
 */
class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class DemoSerialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        serialize();
//        unserialize();
        serializeCollection();
    }

    private static void unserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./person.txt"));
        Object o = ois.readObject();
        ois.close();

        System.out.println(o);
    }

    private static void serialize() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./person.txt"));
        oos.writeObject(new Person("小明", 29));
        oos.close();
    }

    private static void serializeCollection() throws IOException, ClassNotFoundException {
        // 1. 定义一个存储 Person 对象的 ArrayList 集合
        // 2. 往 ArrayList 集合中存储 Person 对象
        // 3. 创建一个序列化流 ObjectOutputStream 对象
        // 4. 使用 serializeCollection 对象中的 方法 writeObject, 对象进行序列化
        // 5. 创建一个反序列化 ObjectInputStream 对象
        // 6. 使用 ObjectInputStream 对象中的方法 readObject 读取文件中保存的集合
        // 7. 把 ObjectInputStream 对象中的方法 readObject 读取文件中保存的集合
        // 8. 遍历 ArrayList 集合
        // 9. 释放资源


        // 1. 定义一个存储 Person 对象的 ArrayList 集合
        ArrayList<Person> list = new ArrayList<>();

        // 2. 往 ArrayList 集合中存储 Person 对象
        list.add(new Person("张三", 18));
        list.add(new Person("李四", 28));
        list.add(new Person("王五", 38));

        // 3. 创建一个序列化流 ObjectOutputStream 对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./collection_data.txt"));

        // 4. 使用 serializeCollection 对象中的 方法 writeObject, 对象进行序列化
        oos.writeObject(list);

        // 5. 创建一个反序列化 ObjectInputStream 对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./collection_data.txt"));

        // 6. 使用 ObjectInputStream 对象中的方法 readObject 读取文件中保存的集合
        Object o = ois.readObject();

        // 7. 把 ObjectInputStream 对象中的方法 readObject 读取文件中保存的集合
        ArrayList<Person> list2 = (ArrayList<Person>)o;

        // 8. 遍历 ArrayList 集合
        for (Person p : list2) {
            System.out.println(p);
        }

        // 9. 释放资源
        ois.close();
        oos.close();
    }
}
