package com.hangguo;


/**
 * @description:
 * @author: guohang
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Airship extends Transport {
    public Airship() {
    }

    public Airship(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Airship--drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Airship--load");
    }

    @Override
    public void maintain() {
        System.out.println("Airship--maintain");
    }

    @Override
    public void addGos() {
        System.out.println("Airship--addGos");
    }
}
