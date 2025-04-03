package MVC;

/* Client */
public class Client {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase(); //Initialize
        StudentView view = new StudentView(model);
        StudentController controller = new StudentController(model, view);

        //Print default values
        controller.getView().printStudentDetails();

        //Edit parameters of controller and visualize them
        controller.inputStudentName("Vikram Sharma");
        controller.getView().printStudentDetails();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Lokesh Sharma");
        student.setRollNo("15UCS157");
        return student;
    }    
}
