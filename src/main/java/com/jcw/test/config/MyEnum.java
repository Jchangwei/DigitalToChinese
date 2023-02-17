package com.jcw.test.config;



public enum MyEnum {


    Ling("零",0),YI("一", 1),ER("二",2),SAN("三",3),SI("四",4),WU("五",5),LIU("六",6),QI("七",7),BA("八",8),JIU("九",9);
    private String data;
    private int number;

    MyEnum(String s, int i) {
        this.data = s;
        this.number = i;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
