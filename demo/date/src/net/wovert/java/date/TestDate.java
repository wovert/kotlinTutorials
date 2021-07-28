package net.wovert.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
//        Date date = sdf.parse("2088年12月02日 20时23分2秒");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(d);
//        System.out.println(date);
    }
}
