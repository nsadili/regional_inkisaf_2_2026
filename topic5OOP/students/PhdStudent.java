package topic5OOP.students;

public class PhdStudent extends Student {
    private String department;

    public PhdStudent(Integer studentId,
            String firstName,
            String lastName,
            String gender,
            String department) {
        super(studentId, firstName, lastName, gender);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "PhdStudent [department=" + department
                + ", " + super.toString()
                + "]";
    }

}
