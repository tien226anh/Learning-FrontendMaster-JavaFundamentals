package inheritance;

public class Employee extends Person {

    private String employeeId;
    private String title;

    public Employee() {

    }

    public Employee(String name, int age, String gender, String employeeId, String title) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.title = title;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
