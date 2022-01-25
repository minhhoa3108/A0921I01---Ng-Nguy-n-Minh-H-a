package models;

public class Room extends Facility{
    private String dichVuMienPhi;

    public Room(){}

    public Room(String tenDichVu, Double dienTichSuDung, Double chiPhiThue, int soNguoiToiDa, String kieuThue,
                String dichVuMienPhi){
        super(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return  "Room{" +
                "dịch vụ miễn phí='" + dichVuMienPhi +
                "} " + super.toString();
    }
}
