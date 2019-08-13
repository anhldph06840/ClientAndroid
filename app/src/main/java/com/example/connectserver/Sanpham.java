package com.example.connectserver;

public class Sanpham {
    String Name;
    String Type;
    String Url;
    String Infor;
    String Cost;

    public Sanpham(String name, String type, String url, String infor, String cost) {
        Name = name;
        Type = type;
        Url = url;
        Infor = infor;
        Cost = cost;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getInfor() {
        return Infor;
    }

    public void setInfor(String infor) {
        Infor = infor;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String cost) {
        Cost = cost;
    }
}
