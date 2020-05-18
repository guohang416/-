package com.hanghuo;

/**
 * @description:
 * @author:
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class MaritimeMeansTransport extends Transport{
    public MaritimeMeansTransport() {
    }
    public MaritimeMeansTransport(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }
}
