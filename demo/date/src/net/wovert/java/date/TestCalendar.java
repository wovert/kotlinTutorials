package net.wovert.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        // getInstance方法获取 Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month); // 西方0-11, 东方1-12

        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

        int day = c.get(Calendar.DATE);
        System.out.println(day);

    }
}
