package models;

public abstract class Facility {
    private String tenDichVu;
    private Double  dienTichSuDung;
    private Double chiPhiThue;
    private int soNguoiToiDa;
    private String kieuThue;

    public Facility(){}

    public Facility(String tenDichVu, Double dienTichSuDung, Double chiPhiThue, int soNguoiToiDa, String kieuThue){
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(Double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public Double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(Double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString(){
        return "Facility{" +
                "tên dịch vụ='" + tenDichVu +
                ", diện tích sử dụng =" + dienTichSuDung +
                ", chi phí thuê =" + chiPhiThue +
                ", số người ở tối đa =" + soNguoiToiDa +
                ", kiểu thuê =" + kieuThue +
                '}';
    }
}
