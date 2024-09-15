package t3;

public class student {

    private String ditno = "12345";
    private String name = "udaya";
    private String address = "malabe";

    public String getDitno() {
        return ditno;
    }

    public void setDitno(String ditno) {
        this.ditno = ditno;
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

    // Method to display student details
    public String getdeatals() {
        System.out.println("ID number: " + ditno);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        return "Details printed successfully";
    }
}
