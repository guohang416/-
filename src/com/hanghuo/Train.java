package com.hanghuo;

/**
 * @description:
 * @author:
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Train extends LandTransport{
    public Train() {
    }

    public Train(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }
}
