package com.guohang;


/**
 * @description:Aircraft--transport
 * @author:
 * @date:
 * @version: 1.0.0
 * @modified By:
 */
public class Aircraft {
    private String ownership;
    private String GPSPosition;
    private String price;
    private String dataOfPurchase;
    private String id;

    public Aircraft() {
    }

    public Aircraft(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        this.ownership = ownership;
        this.GPSPosition = GPSPosition;
        this.price = price;
        this.dataOfPurchase = dataOfPurchase;
        this.id = id;
    }

    public void drivingMethod(){
        System.out.println("HotAirBalloon{" +
                "ownership='" + ownership + '\'' +
                ", GPSPosition='" + GPSPosition + '\'' +
                ", price='" + price + '\'' +
                ", dataOfPurchase='" + dataOfPurchase + '\'' +
                ", id='" + id + '\'' +
                '}');
    }
}
