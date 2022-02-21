package CuoiKyModule2.Model;

public class Student {
    private long maSV;
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String sdt;
    private String maLopHoc;

    public Student(){}

    public Student(long maSV, String ten, String ngaySinh, String gioiTinh, String sdt, String maLopHoc){
        this.maSV = maSV;
        this.ten = ten;
        this. ngaySinh = ngaySinh;
        this. gioiTinh = gioiTinh;
        this.sdt = sdt;-
        this.maLopHoc = maLopHoc;
    }

    public long getMaSV() {
        return maSV;
    }

    public void setMaSV(long maSV) {
        this.maSV = maSV;
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

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    @Override
    public String toString(){
        return "Student[" + " maSV: " + this.maSV +
                " ten: " + this.ten +
                ", ngaySinh: " + this.ngaySinh +
                ", gioiTinh: " + this.gioiTinh +
                ", sdt: " + this.sdt +
                ", maLopHoc: " + this.maLopHoc + "]";
    }

    public String getInfoToCSV(){
        return this.getMaSV() + "," +this.getTen() + "," + this.getNgaySinh() + "," + this.getGioiTinh() + "," +
                this.getSdt() + "," + this.getMaLopHoc();
    }
}
