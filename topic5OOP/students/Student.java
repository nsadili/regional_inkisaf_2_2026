package topic5OOP.students;

public class Student extends Person {
    private Integer studentId;

    public Student(Integer studentId,
            String firstName,
            String lastName,
            String gender) {

        this.studentId = studentId;
        super(firstName, lastName, gender);

    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [studentId =" + studentId +
                ", firstName =" + getFirstName() +
                ", lastName =" + getLastName() +
                ", gender =" + getGender() +
                "]";
    }

    public boolean equals(Student another) {
        return false;
    }

}
