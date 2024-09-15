package t3;

public class test {

    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();

        // Display details of s1
        s1.getdeatals();

        // You can also modify s2 and display its details
        s2.setDitno("67890");
        s2.setName("John");
        s2.setAddress("Colombo");
        s2.getdeatals();
    }
}

