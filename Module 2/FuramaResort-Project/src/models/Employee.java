package models;

public class Employee extends Person{
    private String trinhDo;
    private String viTri;
    private int luong;

    public Employee(){}

    public Employee(int maId, String hoVaTen, String ngaySinh, String gioiTinh, String CMND, String soDienThoai, String email,
                    String trinhDo, String viTri, int luong){
        super(maId, hoVaTen, ngaySinh, gioiTinh, CMND, soDienThoai, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString(){
        return "Employee[" + getMaId() + ", họ và tên: " + getHoVaTen() + ", ngày sinh: " + getNgaySinh() + ", giới tính: " + getGioiTinh() +
                ", CMND: " + getCMND() + ", sđt: " + getSoDienThoai() + ", email: " + getEmail()
                + ", trình độ: " + getTrinhDo() + ", Vị trí: " + getViTri() + ", Lương: " + getLuong();
    }
}
