package model;

public class Customer {
    private int ma_khach_hang;
    private String ho_ten;
    private String ngay_sinh;
    private String so_cmnd;
    private String so_dien_thoai;
    private String email;
    private String dia_chi;

    public Customer() {}

    public Customer(int ma_khach_hang, String ho_ten, String ngay_sinh, String so_cmnd, String so_dien_thoai, String email, String dia_chi) {
        this.ma_khach_hang = ma_khach_hang;
        this.ho_ten = ho_ten;
        this.ngay_sinh = ngay_sinh;
        this.so_cmnd = so_cmnd;
        this.so_dien_thoai = so_dien_thoai;
        this.email = email;
        this.dia_chi = dia_chi;
    }

    public int getMa_khach_hang() {
        return ma_khach_hang;
    }

    public void setMa_khach_hang(int ma_khach_hang) {
        this.ma_khach_hang = ma_khach_hang;
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
