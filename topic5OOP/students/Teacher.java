package topic5OOP.students;

public class Teacher extends Person {
    private String department;
    private String courses;

    public Teacher(String firstName,String lastName,String gender,String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public Teacher(Person person,String department,String courses){
        super(person);
        this.department = department;
        this.courses = courses;
    }

    public String getCourses() {
        return courses;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Muellim: "+this.getFirstName()+" "+this.getLastName()+
        "\nIsleyir: "+this.getDepartment()+" "+this.getCourses();
    }

    public boolean equals(Teacher another){
        // this vs another
        // return getFirstName() ==  another.getFirstName();
        // TODO: AFTER String topic
        return false;
    }

}
