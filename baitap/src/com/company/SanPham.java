package com.company;

import java.io.Serializable;

public class SanPham implements Serializable {
    private int id;
    private String name;
    private String hangSX;
    private int gia;

    public SanPham(int id, String name, String hangSX, int gia) {
        this.id = id;
        this.name = name;
        this.hangSX = hangSX;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", gia=" + gia +
                '}';
    }
}
