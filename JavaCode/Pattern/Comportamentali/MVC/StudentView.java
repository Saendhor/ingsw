package MVC;

/* View */
public class StudentView implements Observer {
    private String studentName;
    private String studentRollNo;
    private Student model;

    public StudentView(Student student) {
        this.model = student;
        update();
    }

    @Override
    public void update() {
        updateName();
        updateRollNo();
    }

    public void updateName() {
        this.studentName = model.getName();
    }

    public void updateRollNo() {
        this.studentRollNo = model.getRollNo();
    }

    public void printStudentDetails() {
        System.out.println("Student:");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
    
}
