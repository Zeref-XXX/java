
public class customer {

    customer() {
        String custid;
        String name;
        String address;
        String phone;
    }

    void setcustid(String custid) {
        this.setcustid = custid;
    }

    void setname(String name) {
        this.name = name;
    }

    void setaddress(String address) {
        this.address = address;
    }

    void setphone(String phone) {
        this.phone = phone;
    }

    public static void main(String[] args) {
        customer c1=new customer();
        c1.setcustid("1011");
        c1.setaddress("lane 1");
        c1.setname("purple");
        c1.setphone("+0923234");

        System.out.println("Address of c1 "+c1.ad);
    }
}
