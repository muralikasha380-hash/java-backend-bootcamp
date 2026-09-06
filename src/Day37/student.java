package Day37;

public class student {

    private int id;
    private String name;
    private int age;
    private String course;

    // Constructor
    public student(int id, String name, int age, String course) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for course
    public String getCourse() {
        return course;
    }

    // Setter for course
    public void setCourse(String course) {
        this.course = course;
    }

    // Display student details
    @Override
    public String toString() {

        return "ID: " + id+ ", Name: " + name+ ", Age: " + age+ ", Course: " + course;
    }
}