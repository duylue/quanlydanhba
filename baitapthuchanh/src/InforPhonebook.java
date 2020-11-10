public class InforPhonebook extends Person {
    private String number;
    private String team;



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "InforPhonebook{" +
                "fullName='" + getFullName() + '\'' +
                " number='" + number + '\'' +
                ", birth='" + getBirth() + '\'' +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", Email='" + getEmail() + '\'' +
                ", team=" + team +
                '}';
    }
}
