package models;

public class Customer extends Person{
    private String loaiKhach;
    private String diaChi;

    public Customer(){}

    public Customer(int maId, String hoVaTen, String ngaySinh, String gioiTinh, String CMND, String soDienThoai, String email,
                    String loaiKhach, String diaChi){
        super(maId, hoVaTen, ngaySinh, gioiTinh, CMND, soDienThoai, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString(){
        return "Employee[" + getMaId() + ", họ và tên: " + getHoVaTen() + ", ngày sinh: " + getNgaySinh() + ", giới tính: " + getGioiTinh() +
                ", CMND: " + getCMND() + ", sđt: " + getSoDienThoai() + ", email: " + getEmail() +
                ", loại khách: " + loaiKhach + ", địa chỉ: " + diaChi;
    }
}
