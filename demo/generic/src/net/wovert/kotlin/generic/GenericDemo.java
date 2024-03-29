package net.wovert.kotlin.generic;

import java.util.*;

interface GenericInterface<I> {
    void method(I i);
}

class GenericMethod {
    public <T, E> void method(T t, E e) {
        System.out.println(t.toString() + e);
    }

}

class Animal {}
class Cat extends Animal {

}
class Dog extends Animal {

}


public class GenericDemo implements GenericInterface<String> {
    public static void main(String[] args) {
//        List<Cat> cats = new ArrayList<>();
//        List<? extends Animal> animals = cats; // ok animals要的是Animal或Animal子类
//        animals.add(new Cat());  // 协变只能读取，不能写入

        List<Animal> animals = new ArrayList<>();
        List<? super Animal> contravariantAnimals = animals;
        contravariantAnimals.add(new Cat());
        contravariantAnimals.add(new Dog());

//        Animal animal = contravariantAnimals.get(0);

        Object[] objs = new String[]{"Hello", "world"};
//        objs[0] = new Object(); // error

//        List<String> list = new ArrayList<String>();
//        List<Object> list2 = list;
//        list2.add(3);
//        String str = list2.get(0);

        TreeMap tm = new TreeMap();
        tm.put(1, 1);
        tm.put(1, 1);
        tm.put(6, 6);
        tm.put(5, 5);


        System.out.println(tm.toString());

        GenericMethod gm = new GenericMethod();
        gm.method(300, "Hello World");

        GenericDemo g = new GenericDemo();
        g.method("Hello World");

        GenericInterfaceImp<Integer> g2 = new GenericInterfaceImp<>();
        g2.method(30);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");

        print(list1);
        print(list2);

        Collection<Integer> li1 = new ArrayList<Integer>();
        Collection<String> li2 = new ArrayList<String>();
        Collection<Number> li3 = new ArrayList<Number>();
        Collection<Object> li4 = new ArrayList<Object>();

        getElementNum1(li1); // ok
//        getElementNum1(li2); // error
        getElementNum1(li3); // ok
//        getElementNum1(li4); // error

//        getElementNum2(li1); // error
//        getElementNum2(li2); // error
        getElementNum2(li3); // ok
        getElementNum2(li4); // ok

    }

    // 泛型的上限：此时的泛型？，必须是Number类型或者Number类型的子类
    public static void getElementNum1(Collection<? extends Number> coll) {

    }

    // 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
    public static void getElementNum2(Collection<? super Number> coll) {

    }

    public static void print(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}

class GenericInterfaceImp<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
