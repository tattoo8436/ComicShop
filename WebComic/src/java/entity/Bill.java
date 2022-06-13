
package entity;

public class Bill {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String product;

    public Bill() {
    }

    public Bill(int id, String name, String address, String phone, String product) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
    
}
