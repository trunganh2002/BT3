package com.example.bkt3;

public class Thi {
    String tenThi, moTa;
    int hinh;

    public Thi() {
    }

    public Thi(String tenThi, String moTa, int hinh) {
        this.tenThi = tenThi;
        this.moTa = moTa;
    }

    public String getTenThi() {
        return tenThi;
    }

    public void setTenThi(String tenThi) {
        this.tenThi = tenThi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
