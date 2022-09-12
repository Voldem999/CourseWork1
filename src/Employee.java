public class Employee {

    private String fullName;
    private int departament;
    private double salary;
    private int id;
    private static int counter;

    public Employee(String fullName, int departament, double salary) {
        this.id = ++counter;
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartament() {
        return departament;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartament(int departament) {
        if (departament < 0 || departament > 5){ throw new IllegalArgumentException("Введены не верные данные");}
        this.departament = departament;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник " + fullName  +
                ", отдел - " + departament +
                ", зарплата - " + salary +
                ", id=" + id +
                '}';
    }
}
