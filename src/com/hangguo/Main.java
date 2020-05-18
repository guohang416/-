package com.hangguo;

/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person(20,"女","001","爱丽丝");
        Transport transport = new Aircraft("杰克","海上","20000000","123456","001");
        person.drivingMethod(transport);
        person.load(transport);
        person.maintain(transport);
        person.addGos(transport);
    }
}
