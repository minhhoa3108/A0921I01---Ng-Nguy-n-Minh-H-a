package models;

//class hợp đồng thuê
public class Contact {
    private String soHopDong;
    private String maBooking;
    private String soTienCoc;
    private String tongTienThanhToan;
    private String maKhachHang;

    public Contact(){}

    public Contact(String soHopDong, String maBooking, String soTienCoc, String tongTienThanhToan, String maKhachHang){
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCoc = soTienCoc;
        this.tongTienThanhToan = tongTienThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getSoTienCoc() {
        return soTienCoc;
    }

    public void setSoTienCoc(String soTienCoc) {
        this.soTienCoc = soTienCoc;
    }

    public String getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(String tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString(){
        return "Hợp đồng thuê{" +
                ", số hợp đòng= " + getSoHopDong() +
                ", mã booking= " + getMaBooking() +
                ", số tiền cọc trước= " + getSoTienCoc() +
                ", tổng số tiền thanh toán= " + getTongTienThanhToan() +
                ", mã khách hàng= " + getMaKhachHang();
    }
}
