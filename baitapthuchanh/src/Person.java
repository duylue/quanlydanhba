import java.io.Serializable;

public class Person implements Serializable {
    private String fullName;
    private String birth;
    private String gioiTinh;
    private String address;
    private String Email;

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birth='" + birth + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", address='" + address + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
