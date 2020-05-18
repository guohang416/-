package com.hanghuo;

/**
 * @description:
 * @author:
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Aircraft extends AirTransport{
    public Aircraft() {
    }

    public Aircraft(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }
}
