package com.jcw.test.test;

import com.jcw.test.service.DigitalToChineseService;

public class ApplicationTest {
    public static void main(String[] args) {

        String number = "123456789";
        String chinese = DigitalToChineseService.ToChinese(number);
        System.out.println(chinese);
    }
}
