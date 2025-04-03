package MVC;

/* Controller */
public class StudentController implements Observer {
    private Student model;
    private StudentView view; //To be referred in the main through the controller

    String inputName;
    String inputRollNo;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public StudentView getView() {
        return this.view;
    }
    
    public void inputStudentName(String name) {
        this.inputName = name;
        update();
    }

    public void inputStudentRollNo(String rollNo) {
        this.inputRollNo = rollNo;
        update();
    }

    public void setView(StudentView newView) {
        this.view = newView;
    }

    @Override
    public void update() {
        model.setName(inputName);
        model.setRollNo(inputRollNo);
        model.notifyObservers();
    }

}
