package com.hangguo;


/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Hovercraft extends Transport {
    public Hovercraft() {
    }

    public Hovercraft(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Hovercraft--drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Hovercraft--load");
    }

    @Override
    public void maintain() {
        System.out.println("Hovercraft--maintain");
    }

    @Override
    public void addGos() {
        System.out.println("Hovercraft--addGos");
    }
}
