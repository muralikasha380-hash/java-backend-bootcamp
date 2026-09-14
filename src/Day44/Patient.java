package Day44;

public class Patient {

    private String pid;
    private String pname;
    private int age;
    private long contact;

    public Patient(String pid, String pname,int age, long contact) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.contact = contact;
    }
    public String getPid() {
        return pid;
    }
    public String getPname() {
        return pname;
    }
    public int getAge() {
        return age;
    }
    public long getContact() {
        return contact;
    }
    @Override
    public String toString() {
        return "Patient ID: " + pid + ", Name: " + pname + ", Age: " + age + ", Contact: " + contact;
    }
}