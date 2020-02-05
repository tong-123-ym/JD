package com.newer.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Checkins implements Serializable {
    private Integer cid;//入住编号
    private String name;//姓名
    private String gender;//性别
    private String cardtype;//证件类型
    private String cardno;//证件号码
    private String roomid;//居住房间号
    private Integer num;//天数
    private Integer totalprice;//结账总金额
    private String cstate;//是否结账
    private Timestamp checkinTime;//入住时间
    private Timestamp leaveTime;//结账时间
private Rooms rooms;
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    public Timestamp getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Timestamp checkinTime) {
        this.checkinTime = checkinTime;
    }

    public Timestamp getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Timestamp leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Checkins() {
    }

    public Checkins(Integer cid, String name, String gender, String cardtype, String cardno, String roomid, Integer num, Integer totalprice, String cstate, Timestamp checkinTime, Timestamp leaveTime) {
        this.cid = cid;
        this.name = name;
        this.gender = gender;
        this.cardtype = cardtype;
        this.cardno = cardno;
        this.roomid = roomid;
        this.num = num;
        this.totalprice = totalprice;
        this.cstate = cstate;
        this.checkinTime = checkinTime;
        this.leaveTime = leaveTime;
    }

    @Override
    public String toString() {
        return "Checkins{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", cardtype='" + cardtype + '\'' +
                ", cardno='" + cardno + '\'' +
                ", roomid='" + roomid + '\'' +
                ", num=" + num +
                ", totalprice=" + totalprice +
                ", cstate='" + cstate + '\'' +
                ", checkinTime=" + checkinTime +
                ", leaveTime=" + leaveTime +
                ", rooms=" + rooms +
                '}';
    }
}
