package com.wovert.java.collection;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {

    public static void main(String[] args) {
        // create Notice class
        Notice n1 = new Notice(1, "欢迎来到为名教育", "管理员", new Date());
        Notice n2 = new Notice(2, "大家好，我的机器人", "机器人", new Date());
        Notice n3 = new Notice(3, "诗人有性，富有感情", "诗人", new Date());

        // add notice
        ArrayList noticeList = new ArrayList();
        noticeList.add(n1);
        noticeList.add(n2);
        noticeList.add(n3);

        // show notice
        System.out.println("公告的内容：");
        print(noticeList);

        // After first notice add new notice
        Notice n4 = new Notice(4, "新添加的公告", "管理员", new Date());
        noticeList.add(1, n4);
        System.out.println("新添加的公告的内容：");
        print(noticeList);

        // delete element
        noticeList.remove(3); // element index
        System.out.println("删除的公告的内容剩余为：");
        print(noticeList);

        // modify content
        System.out.println("修改公告的内容剩余为：");
        n4.setTitle("新添加的内容");
        noticeList.set(1, n4); // 如果创建了一个新的对象，用新的对席那个提花n4的时候需要调用ArrayList的set方法
        print(noticeList);


    }

    public static void print(ArrayList arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice)arrayList.get(i)).getTitle());
        }
    }
}
