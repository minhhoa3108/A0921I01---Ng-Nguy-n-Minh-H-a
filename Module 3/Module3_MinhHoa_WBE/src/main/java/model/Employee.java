package model;

import java.util.Date;

public class Employee {
    private int ma_nhan_vien;
    private String ho_ten;
    private String ngay_sinh;
    private String so_cmnd;
    private double luong;
    private String so_dien_thoai;
    private String email;
    private String dia_chi;

    public Employee() {}

    public Employee(int ma_nhan_vien, String ho_ten, String ngay_sinh, String so_cmnd, double luong, String so_dien_thoai, String email, String dia_chi) {
        this.ma_nhan_vien = ma_nhan_vien;
        this.ho_ten = ho_ten;
        this.ngay_sinh = ngay_sinh;
        this.so_cmnd = so_cmnd;
        this.luong = luong;
        this.so_dien_thoai = so_dien_thoai;
        this.email = email;
        this.dia_chi = dia_chi;
    }

    public int getMa_nhan_vien() {
        return ma_nhan_vien;
    }

    public void setMa_nhan_vien(int ma_nhan_vien) {
        this.ma_nhan_vien = ma_nhan_vien;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getSo_cmnd() {
        return so_cmnd;
    }

    public void setSo_cmnd(String so_cmnd) {
        this.so_cmnd = so_cmnd;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }
}
