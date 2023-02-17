package com.jcw.test.service;

import com.jcw.test.config.MyEnum;

public class DigitalToChineseService {

    public static String ToChinese(String data) {
        int length = data.length();

        String[] unit = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千","兆"};

        String currentUnit;
        String str = new String();

        int[] ints = StringToInt(data,length);
        String[] strings = To(ints);

        int count = 0;
        for (int i = length; i > 0; i--) {
            currentUnit = unit[i-1];
            str+=strings[count];
            if (!"零".equals(strings[count])){
                str+=currentUnit;
            }
            count++;
        }
        return str;
    }

    public static int[] StringToInt(String s,int length){
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return ints;
    }


    public static String[] To(int[] ints){
        String[] strings = new String[ints.length];
        for (int i = 0; i < ints.length; i++) {
            switch (ints[i]){
                case 0:
                    strings[i] = MyEnum.Ling.getData();
                    break;
                case 1:
                    strings[i] = MyEnum.YI.getData();
                    break;
                case 2:
                    strings[i] = MyEnum.ER.getData();
                    break;
                case 3:
                    strings[i] = MyEnum.SAN.getData();
                    break;
                case 4:
                    strings[i] = MyEnum.SI.getData();
                    break;
                case 5:
                    strings[i] = MyEnum.WU.getData();
                    break;
                case 6:
                    strings[i] = MyEnum.LIU.getData();
                    break;
                case 7:
                    strings[i] = MyEnum.QI.getData();
                    break;
                case 8:
                    strings[i] = MyEnum.BA.getData();
                    break;
                case 9:
                    strings[i] = MyEnum.JIU.getData();
            }
        }
        return strings;
    }
}
