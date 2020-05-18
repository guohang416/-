package com.hanghuo;

/**
 * @description:
 * @author:
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Airship extends AirTransport{
    public Airship() {
    }

    public Airship(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }
}
