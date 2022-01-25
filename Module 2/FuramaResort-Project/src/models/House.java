package models;

public class House extends Facility{
    private String tieuChuanPhong;
    private int soTang;

    public House(){}

    public House(String tenDichVu, Double dienTichSuDung, Double chiPhiThue, int soNguoiToiDa, String kieuThue,
                String tieuChuanPhong, int soTang){
        super(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return  "House{" +
                "tiêu chuẩn phingf='" + tieuChuanPhong +
                ", số tầng=" + soTang +
                "} " + super.toString();
    }
}
