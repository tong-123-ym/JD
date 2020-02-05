package com.newer.domain;

import java.io.Serializable;

public class Rooms implements Serializable {
private  String roomid;//房间编号',
private String roomtype;
private Double price;
private String state;

    @Override
    public String toString() {
        return "Rooms{" +
                "roomid='" + roomid + '\'' +
                ", roomtype='" + roomtype + '\'' +
                ", price=" + price +
                ", state='" + state + '\'' +
                '}';
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
