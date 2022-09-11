public class Main {

    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
//        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Католиков Владимир", 1, 150000);
        employees[1] = new Employee("Католикова Вероника", 1, 155000);
        employees[2] = new Employee("Иванов Иван", 2, 125000);
        employees[3] = new Employee("Петров Василий", 2, 13400);
        employees[4] = new Employee("Сидоров Антон", 3, 95200);
        employees[5] = new Employee("Иванова Анна", 3, 81543);
        employees[6] = new Employee("Сергеев Александр", 4, 65800);
        employees[7] = new Employee("Погребняк Павел", 4, 75750);
        employees[8] = new Employee("Антонов Сергей", 5, 55300);
        employees[9] = new Employee("Сидоренко Светлана", 5, 45200);

        printFullNameEmployee();
        System.out.println("Сумма трат за месяц составила " + getCalculateSumSalary() + " рублей");
    }

    public static void printFullNameEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);}
    }

    public static double getCalculateSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;}

    public static Employee getEmployeeMinSalary() {
        double min = 0;

        return getEmployeeMinSalary();
    }
}