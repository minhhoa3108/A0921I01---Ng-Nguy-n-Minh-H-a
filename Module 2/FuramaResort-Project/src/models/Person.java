package models;

public abstract class Person {
    private int maId;
    private String hoVaTen;
    private String ngaySinh;
    private String gioiTinh;
    private String CMND;
    private String soDienThoai;
    private String email;

    public Person(){}

    public Person(int maId, String hoVaTen, String ngaySinh, String gioiTinh, String CMND, String soDienThoai, String email){
        this.maId = maId;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.CMND = CMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public int getMaId() {
        return maId;
    }

    public void setMaId(int maId) {
        this.maId = maId;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Person[" + maId + ", họ và tên: " + hoVaTen + ", ngày sinh: " + ngaySinh + ", giới tính: " + gioiTinh +
                ", CMND: " + CMND + ", sđt: " + soDienThoai + ", email: " + email;
    }
}
