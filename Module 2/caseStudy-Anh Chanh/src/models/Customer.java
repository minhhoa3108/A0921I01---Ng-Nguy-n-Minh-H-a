package models;

public class Customer extends Person {
    private String customerType;

    public Customer() {
    }

    public Customer(int id, String maSo, String name, String birthday, String customerType) {
        super(id, maSo, name, birthday);
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", maSo='" + maSo + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                "customerType='" + customerType + '\'' +
                '}';
    }
    //int id, String maSo, String name, String birthday, String customerType
    public String getInfoToCVS(){
        return this.id+","+this.maSo+","+this.name+","+this.birthday+","+this.customerType;
    }
}
