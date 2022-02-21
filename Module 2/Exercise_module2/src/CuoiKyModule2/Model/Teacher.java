package CuoiKyModule2.Model;

public class Teacher {
    private long maGV;
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String sdt;

    public Teacher(){}

    public Teacher(long maGV, String ten, String ngaySinh, String gioiTinh, String sdt){
        this.maGV = maGV;
        this.ten = ten;
        this. ngaySinh = ngaySinh;
        this. gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public long getMaGV() {
        return maGV;
    }

    public void setMaGV(long maGV) {
        this.maGV = maGV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString(){
        return "Teacher[" + " maGV: " + this.maGV +
                " ten: " + this.ten +
                ", ngaySinh: " + this.ngaySinh +
                ", gioiTinh: " + this.gioiTinh +
                ", sdt: " + this.sdt +  "]";
    }
}
