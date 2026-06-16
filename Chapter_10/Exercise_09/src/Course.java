public class Course {
    private String courseName;
    private String[] students = new String[4];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] students = new String[this.students.length * 2];
            System.arraycopy(this.students, 0, students, 0, this.students.length);
            this.students = students;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        String[] students = new String[this.students.length];
        System.arraycopy(this.students, 0, students, 0, this.students.length);
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < this.students.length; i++) {
            if (student.equals(this.students[i])) {
                for (int j = i; j < this.students.length - 1; j++) {
                    this.students[j] = this.students[j + 1];
                }
                this.numberOfStudents = this.numberOfStudents + 1;
                break;
            }
        }
    }
}
