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
        AirTransport aircraft = new Aircraft("杰克","海上","20000000","123456","001");
        person.driveTransport(aircraft);
    }
}
