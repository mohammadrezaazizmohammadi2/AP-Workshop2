public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;

    public Student(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = 0
        setId(id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && id.length() == 7) {
            this.id = id;
        } else {
            System.out.println("Error: Student ID must be exactly 7 digits! (Entered: " + id + ")");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 20) {
            this.grade = grade;
        } else {
            System.out.println("Error: Grade must be between 0 and 20.");
        }
    }
    public void printStudentInfo() {
        System.out.println("Student: " + firstName + " " + lastName + " | ID: " + id + " | Grade: " + grade);
    }
}
